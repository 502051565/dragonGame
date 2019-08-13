function getRadioUrl(){
    var wxAudio = new MyAudio({
        ele: '.wx-audio',
        src: vm.form.audioUrl,
        loop: true,
        ended: function () {
            alert('播放结束')
        }
    });
}