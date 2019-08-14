<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="pragma" content="no-cache" />
    <meta http-equiv="content-type" content="no-cache, must-revalidate" />
    <meta http-equiv="expires" content="" />
    <meta name="viewport"
        content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0,user-scalable=yes">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link type="text/css" rel="stylesheet" href="${ctx}/assets/game/css/reset.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/assets/game/css/swiper.css" />
    <link rel="stylesheet" type="text/css" href="${ctx}/assets/game/css/index.css" />
    <title>天龙八部</title>
    <script type="text/javascript">
        (function () {
            var w = document.documentElement.clientWidth,
                html = document.documentElement;
            html.style.fontSize = w / 750 * 100 + "px";
        })()
    </script>
    <style>
        [v-cloak] {
            display:none !important;
        }

    </style>
</head>

<body>
    <div class="wrap" id="app" v-cloak>
        <div class="fixed_header">
            <dl>
                <dt>
                    <img src="${ctx}/assets/game/img/headimg.png" alt="">
                </dt>
                <dd>
                    <p>天龙八部3D</p>
                    <p>全民第一武侠RPG手游</p>
                </dd>
            </dl>
            <div class="fixed_btn">进入官网</div>
            <div class="fixed_btn">官方公众号</div>
        </div>
        <div class="banner">
            <img src="${ctx}/assets/game/img/head.png" alt="">
            <div class="btn" @click="showReserve"></div>
        </div>
        <div class="content_center">
            <div class="head_num">
                <span>2134134</span>
            </div>
            <div class="gift">
                <img src="${ctx}/assets/game/img/gift1.png" alt="">
                <img src="${ctx}/assets/game/img/img02.png" alt="">
                <img src="${ctx}/assets/game/img/gift3.png" alt="">
                <img src="${ctx}/assets/game/img/gift4.png" alt="">
                <img src="${ctx}/assets/game/img/gift5.png" alt="">
            </div>
            <div class='old_brother'>
                <img src="${ctx}/assets/game/img/old.png" alt="" class="imgold">
                <p id="yaonum">已邀请<i>2</i>人</p>
                <img src="${ctx}/assets/game/img/brother.png" alt="" class="img_brother">

                <p><span>您的邀请码是</span><input type="text" name="username" id="username"></p>

                <div class="inviteBtn">
                    <img src="${ctx}/assets/game/img/yao.png" alt="">
                </div>
                <div class="gift_hit">好友预约时需要填写邀请码，成功邀请好友的少侠请在公测后前往本页面领取奖励</div>
            </div>
            <div class="scrollImg">
                <section class="pc-banner">
                    <div class="swiper-container">
                        <div class="swiper-wrapper">
                            <div class="swiper-slide swiper-slide-center none-effect">
                                <a href="#">
                                    <img src="${ctx}/assets/game/img/swiper01.png">
                                </a>
                                <div class="layer-mask"></div>
                            </div>
                            <div class="swiper-slide">
                                <a href="#">
                                    <img src="${ctx}/assets/game/img/swiper02.png">
                                </a>
                                <div class="layer-mask"></div>
                            </div>
                            <div class="swiper-slide">
                                <a href="#">
                                    <img src="${ctx}/assets/game/img/swiper03.png">
                                </a>
                                <div class="layer-mask"></div>
                            </div>

                        </div>

                    </div>
                </section>
            </div>
            <div class="footer">
                <img src="${ctx}/assets/game/img/footer.png" alt="">
                <img src="${ctx}/assets/game/img/top.png" alt="" class="top" id="goTop">
            </div>
        </div>
    </div>
    <!-- 邀请好友 -->
    <div class="mask">
        <div class='apply_box' id="yuyue">
            <!-- 预约100%领豪礼 -->
            <h1 id="yu">
                <img src="${ctx}/assets/game/img/yu.png" alt="">
            </h1>
            <div class="tab1">
                <div id="nav">
                    <div class="on">IOS</div>
                    <div>Android</div> 
                </div>
                 <div id="contentBox">
                    <div class="box active">
                        <input type="text" placeholder="请输入手机号" class="tel">
                        <div class="ipt">
                            <input type="text" placeholder="输入图片中验证码，点击图片即可刷新">
                            <div class="Imgcode">
                                <img src="" alt="">
                            </div>
                        </div>
                        <div class="ipt">
                            <input type="text" placeholder="请输入手机验证码">
                            <div class="Imgcode">
                                发送验证码
                            </div>
                        </div>
                        <div class="makeAway">
                            <img src="${ctx}/assets/game/img/img3.png" alt="">
                        </div>
                        <p>预约游戏即可获得专属邀请码，邀请好友预约游戏，公测即可获得丰富奖励哦！</p>
                        <input type="text" placeholder="输入好友邀请码，助TA得奖励（选填）" class="yaocode">
                    </div>    

                     <div class="box">
                        <input type="text" placeholder="请输入手机号" class="tel">
                        <div class="ipt">
                            <input type="text" placeholder="输入图片中验证码，点击图片即可刷新">
                            <div class="Imgcode">
                                <img src="" alt="">
                            </div>
                        </div>
                        <div class="ipt">
                            <input type="text" placeholder="请输入手机验证码">
                            <div class="Imgcode">
                                发送验证码
                            </div>
                        </div>
                        <div class="makeAway">
                            <img src="${ctx}/assets/game/img/img3.png" alt="">
                        </div>
                        <p>预约游戏即可获得专属邀请码，邀请好友预约游戏，公测即可获得丰富奖励哦！</p>
                        <input type="text" placeholder="输入好友邀请码，助TA得奖励（选填）" class="yaocode">
                    </div>
                     
                       
                </div>
            </div>
        </div>
    </div>
    <!-- 邀请好友 -->
    <div class="maskgood">
        <div class='apply_box' id="friend">
            <h1><img src="${ctx}/assets/game/img/good.png" alt=""></h1>
            <p class="yaop yaop1">成功邀请好友预约游戏</p>
            <p class="yaop1">即可在星宿派上线时100%领取豪华奖励</p>
            <p class="copy">点击复制按钮，复制链接给好友</p>
            <div class="address">
                链接地址 <input type="text" placeholder="快来预约，与我一起重回天龙，兄弟们人人有奖">
                <span>复制链接</span>
            </div>
            <div class="sure">
                <img src="${ctx}/assets/game/img/sure.png" alt="">
            </div>
        </div>
    </div>
    <!-- 选择角色 -->
    <div class="maskjiao">
        <div class='apply_box' id="jiaose">
            <h1 id="jiao">
                <img src="${ctx}/assets/game/img/jiao.png" alt="">
            </h1>

            <div class="colour">
                选择系统： <input type="text" placeholder="请选择系统">
            </div>
            <div class="colour">
                选择大区： <input type="text" placeholder="请选择大区">
            </div>
            <div class="colour">
                选择角色： <input type="text" placeholder="请选择角色">
            </div>
            <div class="sure">
                <img src="${ctx}/assets/game/img/sure.png" alt="">
            </div>
        </div>
    </div>
    <!-- 成功预约 -->
    <!-- <div class='apply_box'> -->
    <div class="maskseccess">
        <div class='success' id="success">
            <img src="${ctx}/assets/game/img/success.png" alt="">
        </div>
    </div>
    <!-- </div> -->
    <script src="${ctx}/assets/game/js/swiper.min.js"></script>
    <script src="${ctx}/assets/game/js/jquery-1.11.0.min.js"></script>
    <script src="${ctx}/assets/game/js/index.js"></script>

</body>
<script src="${ctx}/assets/js/vue.js"></script>
<script src="${ctx}/assets/js/jquery/jquery.js"></script>
<script>

    var vm = new Vue({
        el:"#app" ,
        data:{
            isObtain:true,//获取验证码
            isActive:false,
            from:{
                phone:"",
                code:""
            },
            second: 60,
            flag: true,
            timer: null // 该变量是用来记录定时器的,防止点击的时候触发多个setInterval
        },
        create(){
            this.judgeCode()
        },

        mounted(){


        },
        methods:{
            inputVal(){
                if (this.from.phone!="" && this.from.code!="") {
                    this.isActive=true ;
                }else{
                    this.isActive=false ;
                }
            },
            showReserve(){
                $('.mask').show();
                $('#yuyue').show()
            },
            getCode() {
                if(vm.from.phone===""){
                    alert('请输入手机号');
                    return false
                }
                if (vm.flag) {
                    vm.flag = false;
                    var interval = window.setInterval(function() {
                        vm.setStorage(vm.second);
                        if (vm.second-- <= 0) {
                            vm.second = 60;
                            vm.flag = true;
                            window.clearInterval(interval);
                        }
                    }, 1000);
                }

                $.ajax({
                    url: "${ctx}/api/register/getCode/"+vm.from.phone,
                    type: "Get",
                    data: null,
                    success: function (re) {
                        if (re.code === 0) {
                        } else {
                            alert(re.msg);
                        }
                    }
                })
            },
            setStorage(parm) {
                localStorage.setItem("dalay", parm);
                localStorage.setItem("_time", new Date().getTime());
            },
            getStorage() {
                var localDelay = {};
                localDelay.delay = localStorage.getItem("dalay");
                localDelay.sec = localStorage.getItem("_time");
                return localDelay;
            },
            judgeCode() {
                var that = this;
                var localDelay = that.getStorage();
                console.log(localDelay)
                if (localDelay.delay=="0" || localDelay.delay=="1") {
                    that.flag = true;
                    console.log("已过期");
                } else {
                    that.flag = false;
                    var _delay = localDelay.delay;
                    that.second = _delay;
                    that.timer = setInterval(function() {
                        if (_delay > 1) {
                            _delay--;
                            that.setStorage(_delay);
                            that.second = _delay;
                            that.flag = false;
                        } else {
                            that.flag = true;
                            window.clearInterval(that.timer);
                        }
                    }, 1000); }

            },
            payAlert(){
                this.payShow=true
            },
            submits(){

                if (this.from.phone==="") {
                    alert('请输入手机号');
                    return false
                }
                if(this.from.code===""){
                    alert('请输入验证码');
                    return false
                }
                $.ajax({
                    url: "${ctx}/api/register/setPhone/"+vm.from.phone+"/"+this.from.code,
                    type: "Get",
                    data: null,
                    success: function (re) {
                        if (re.code === 0) {
                            alert("绑定成功");
                            window.location.href = "${(targetURL)!}";
                        } else {
                            alert(re.msg);
                        }
                    }
                })


            }
        }
    })
</script>
</html>