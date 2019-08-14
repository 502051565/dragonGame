(function () {
    var swiper = new Swiper('.swiper-container', {
        autoplay: false, //是否自动滚动
        // speed: 3000,      //滚动速速
        autoplayDisableOnInteraction: true,
        loop: true,
        centeredSlides: true,
        slidesPerView: 3, //当前选中
        pagination: '.swiper-pagination',
        paginationClickable: true,
        prevButton: '.swiper-button-prev', // 左右切换
        nextButton: '.swiper-button-next', // 左右切换
        onInit: function (swiper) {
            swiper.slides[3].className = "swiper-slide swiper-slide-active"; //当前选中 状态
        },
    });
    $(".top").click(function () {
        $("html,body").stop().animate({ scrollTop: 0 }, 900);
    });
    $("#nav div").off("click").on("click", function () {
        var index = $(this).index();
        $(this).addClass("on").siblings().removeClass("on");
        $("#contentBox .box").eq(index).addClass("active").siblings().removeClass("active");
    });
   /* $('.btn').click(function () {
        $('.mask').show()
        $('#yuyue').show()
    })*/
})()