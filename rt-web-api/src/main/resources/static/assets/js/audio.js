;(function (undefined) {
	var _global;

	function MyAudio(tpl){

	    let defaultOptions = {
	      ele: null,
	      src: '',
	      // loop为true的时候不执行ended事件
	      loop: true,
	      ended: function () {}
	    }

	    this.opt = Object.assign({}, defaultOptions, tpl)
	    // 判断传进来的是DOM还是字符串
	    if (typeof this.opt.ele === 'string') {
	        this.opt.ele = document.querySelector(this.opt.ele)
	    }
	    if (!this.opt.ele) return


	    this.loading = false
		this.isDrag = false
		this.isplaying = false
		this.durationT = 0
		this.currentT = 0
		this.currentP = 0
		this.maxProgressWidth = 0
		this.dragProgressTo = 0

		// 通过时间戳与当前时间的差值来判断是否需要加载
		this.reduceTBefore = 0   // 时间戳与当前时间的差值 (初始化)
		this.reduceTAfter = 0   // 时间戳与当前时间的差值 (执行中)

	    this.initDom();
	};

	MyAudio.prototype = {
		constructor: this,
		initDom: function(){
			// content
		    this.wxAudioC = document.createElement('div')
		    this.wxAudioC.className = 'wx-audio-content'
		    this.opt.ele.appendChild(this.wxAudioC)
		    
		    // audio 
		    this.wxAudio = document.createElement('audio')
		    this.wxAudio.className = 'wx-audio-content'
		    this.wxAudio.src = this.opt.src
		    if (this.opt.loop) this.wxAudio.setAttribute('loop', this.opt.loop)
		    this.wxAudioC.appendChild(this.wxAudio)
//================================================================
		    // topbox
		    this.wxAudioTop = document.createElement('div')
		    this.wxAudioTop.className = 'wx-audio-top'
		    this.wxAudioC.appendChild(this.wxAudioTop)

		    //progrees
		    this.wxAudioP = document.createElement('div')
		    this.wxAudioP.className = 'wx-audio-progrees'
		    this.wxAudioTop.appendChild(this.wxAudioP)

		    // progress detail 
		    this.wxAudioDetail = document.createElement('div')
		    this.wxAudioDetail.className = 'wx-progrees-detail'
		    this.wxAudioP.appendChild(this.wxAudioDetail)

		    // wxVoiceP 
		    this.wxVoiceP = document.createElement('div')
		    this.wxVoiceP.className = 'wx-voice-p'
		    this.wxAudioDetail.appendChild(this.wxVoiceP)

		    // loading p
		    this.wxLoading = document.createElement('span')
		    this.wxLoading.className = 'wx-loading'
		    this.wxAudioDetail.appendChild(this.wxLoading)

		    // laoding wrapper
		    this.wxLoadingWrapper = document.createElement('span')
		    this.wxLoadingWrapper.className = 'wx-loading-wrapper'
		    this.wxLoading.appendChild(this.wxLoadingWrapper)

		    // buffer p
		    this.wxBufferP = document.createElement('span')
		    this.wxBufferP.className = 'wx-buffer-p'
		    this.wxAudioDetail.appendChild(this.wxBufferP)

		    // origin 
		    this.wxAudioOrigin = document.createElement('div')
		    this.wxAudioOrigin.className = 'wx-audio-origin'
		    this.wxAudioP.appendChild(this.wxAudioOrigin)

		    // currentT
		    this.wxAudioCurrent = document.createElement('span')
		    this.wxAudioCurrent.className = 'wx-audio-time current-t'
		    this.wxAudioCurrent.innerText = '00:00'
		    this.wxAudioTop.appendChild(this.wxAudioCurrent)

		    // durationT
		    this.wxAudioDuration = document.createElement('span')
		    this.wxAudioDuration.className = 'wx-audio-time duration-t'
		    this.wxAudioDuration.innerText = '00:00'
		    this.wxAudioTop.appendChild(this.wxAudioDuration)

//==================================================================
		    // btmbox
		    this.wxAudioBtm = document.createElement('div')
		    this.wxAudioBtm.className = 'wx-audio-btm'
		    this.wxAudioC.appendChild(this.wxAudioBtm)


		    // left
		    this.wxAudioLeft = document.createElement('div')
		    this.wxAudioLeft.className = 'wx-audio-left'
		    this.wxAudioBtm.appendChild(this.wxAudioLeft)

		    // right
		    this.wxAudioRight = document.createElement('div')
		    this.wxAudioRight.className = 'wx-audio-right'
		    this.wxAudioBtm.appendChild(this.wxAudioRight)


		    // playbtn
		    this.wxAudioPlayBtn = document.createElement('div')
		    this.wxAudioPlayBtn.className = 'wx-audio-play'
		    this.wxAudioBtm.appendChild(this.wxAudioPlayBtn)


		    this.initAudioEvent();
		},
		updatePorgress: function () {
    		this.wxAudioOrigin.style.left = this.dragProgressTo + 'px'
    		this.wxVoiceP.style.width = this.dragProgressTo + 'px'
    		var currentTime = Math.floor(this.dragProgressTo / this.maxProgressWidth * this.durationT)
    		this.wxAudioCurrent.innerText = this.formartTime(currentTime)
  		},
  		cutPorgress: function(){

  		},
		initAudioEvent: function(){
			var _this = this
    		// 音频事件
		    _this.wxAudio.onplaying = function () {
		      	var date = new Date ()
		      	_this.isPlaying = true
		      	_this.reduceTBefore = Date.parse(date) - Math.floor(_this.wxAudio.currentTime * 1000)
		      	_this.wxAudioPlayBtn.className = 'wx-audio-play sel'
		    },
		    _this.wxAudio.onpause = function () {
		      	_this.isPlaying = false
      			_this.showLoading(false)
		      	_this.wxAudioPlayBtn.className = 'wx-audio-play'
		    },
		    _this.wxAudio.onloadedmetadata = function () {
		      	_this.durationT = _this.wxAudio.duration
		      	// 初始化视频时间
		      	_this.wxAudioDuration.innerText = _this.formartTime(_this.wxAudio.duration)
		    },
		    _this.wxAudio.onwaiting = function () {
			    if(!_this.wxAudio.paused) {
			        _this.showLoading(true)
			    }
		    },
		    _this.wxAudio.onprogress = function () {
				if(_this.wxAudio.buffered.length > 0) {
					var bufferedT = 0
					for (var i = 0; i < _this.wxAudio.buffered.length; i++) {
						bufferedT += _this.wxAudio.buffered.end(i) - _this.wxAudio.buffered.start(i)
						if(bufferedT > _this.durationT) {
							bufferedT = _this.durationT
							_this.showLoading(false)
							console.log('缓冲完成')
						}
					}
					var bufferedP = Math.floor((bufferedT / _this.durationT) * 100)
					_this.wxBufferP.style.width = bufferedP + '%'
				}

				// ===========================
				var date = new Date ()
				if(!_this.wxAudio.paused) {
					_this.reduceTAfter = Date.parse(date) - Math.floor(_this.currentT * 1000)
				if(_this.reduceTAfter - _this.reduceTBefore > 1000) {
					_this.showLoading(true)
				} else {
					_this.showLoading(false)
				}
				} else {
					return
				}
		    },

		    // 播放结束事件
		    _this.wxAudio.onended = function () {
		      	_this.opt.ended()
		    }
		    // 绑定进度条
		    _this.wxAudio.ontimeupdate = function () {
		      var date = new Date ()
			      if (!_this.isDrag) {
			        _this.currentT = _this.wxAudio.currentTime
			        _this.currentP = Number((_this.wxAudio.currentTime / _this.durationT) * 100)
			        _this.reduceTBefore = Date.parse(date) - Math.floor(_this.currentT * 1000)
			        _this.currentP = _this.currentP > 100 ? 100 : _this.currentP
			        _this.wxVoiceP.style.width = _this.currentP + '%'
			        _this.wxAudioOrigin.style.left = _this.currentP + '%'
			        // 更改时间进度
			        _this.wxAudioCurrent.innerText = _this.formartTime(_this.wxAudio.currentTime)
			        _this.showLoading(false)
			      }
		    },
		    // 页面点击事件
		    _this.wxAudioPlayBtn.onclick = function () {
		      _this.audioPlayPause()
		    }
		    _this.wxAudioLeft.onclick = function () {
		    	_this.wxAudio.currentTime = Math.max(0, _this.wxAudio.currentTime-15);
		    	console.log(_this.wxAudio.currentTime)
		    }
		    _this.wxAudioRight.onclick = function () {
		    	_this.wxAudio.currentTime = Math.min(_this.wxAudio.duration, _this.wxAudio.currentTime+15);
		    	console.log(_this.wxAudio.currentTime)

		    }		    
			//滑动绑定
			_this.wxAudioOrigin.ontouchstart = function (event) {
			    _this.isDrag = true
			    var e = event || window.event
			    var x = e.touches[0].clientX
			    var l = e.target.offsetLeft
      			_this.maxProgressWidth = _this.wxAudioDetail.offsetWidth
			
				_this.wxAudioC.ontouchmove = function (event) {
					if (_this.isDrag) {
			          	var e = event || window.event
			          	var thisX = e.touches[0].clientX
			          	_this.dragProgressTo = Math.min(_this.maxProgressWidth, Math.max(0, l + (thisX - x)))
			          	_this.updatePorgress()
					}
				}

			    _this.wxAudioC.ontouchend = function () {
			        if (_this.isDrag) {
			          	_this.isDrag = false
			          	_this.wxAudio.currentTime = Math.floor(_this.dragProgressTo / _this.maxProgressWidth * _this.durationT)
			        } else {
			          	return
			        }
			    }


			}

		},
		showLoading (bool) {
    		this.loading = bool || false
		    if (this.loading) {
		      	this.wxLoading.style.display = 'block'
		    } else {
		      	this.wxLoading.style.display = 'none'
		    }
  		},
		formartTime (seconds) {
	    	var formatNumber = function (n) {
	            n = n.toString()
	            return n[1] ? n : '0' + n
	        }
	        var m = Math.floor(seconds / 60);
	        var s = Math.floor(seconds % 60);
	        return formatNumber(m) + ":" + formatNumber(s);
  		},
		// 播放
		audioPlay () {
		    this.wxAudio.play()
			this.isPlaying = true
		},
		audioPause () {
		    this.wxAudio.pause();
		    this.isPlaying = false
		},
  		audioPlayPause () {
		    if (this.isPlaying) {
		      this.audioPause();
		    } else {
		      this.audioPlay();
		    }
  		},

	}

    // 最后将插件对象暴露给全局对象
    _global = (function(){ return this || (0, eval)('this'); }());
    if (typeof module !== "undefined" && module.exports) {
        module.exports = MyAudio;
    } else if (typeof define === "function" && define.amd) {
        define(function(){return MyAudio;});
    } else {
        !('MyAudio' in _global) && (_global.MyAudio = MyAudio);
    }




                // <div class="wx-audio-content">
                //     <audio src="http://m10.music.126.net/20190403200103/93e581382bb0b6f2163f17b950787789/ymusic/c290/fe09/4450/004e668511f79c1c106ccc286ccbed41.mp3" loop="true"></audio>
                //     <div class="wx-audio-top">
                //         <span class="wx-audio-time current-t">00:00</span>
                //         <span class="wx-audio-time duration-t">00:00</span>
                //         <div class="wx-audio-progrees">
                //             <div class="wx-progrees-detail">
                //                 <span class="wx-voice-p"></span>
                //                 <span class="wx-buffer-p"></span>
                //                 <span class="wx-loading">
                //                     <span class="wx-loading-wrapper"></span>
                //                 </span>
                //             </div>
                //             <div class="wx-audio-origin"></div>
                //         </div>
                //     </div>
                //     <div class="wx-audio-btm">
                //         <div class="wx-audio-play"></div>
                //         <div class="wx-audio-left"></div>
                //         <div class="wx-audio-right"></div>
                //     </div>
                // </div>
}());