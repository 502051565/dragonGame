(function(){
    document.documentElement.style.fontSize = Math.min(window.innerWidth, 510)/7.5 + 'px';
    // document.documentElement.style.cssText = 'font-size: calc( 100% + (78 - 34) * (100vw - 255px) / (510 - 255) );';
    // var calcSupFS = window.getComputedStyle(document.documentElement, null)['font-size'];
    // window.calcSup = false;
    // if (!(/\d+px/.test(calcSupFS))) {
    //     document.documentElement.style.fontSize = Math.min(window.innerWidth, 486)/7.5 + 'px';
    // }else{
    //     document.documentElement.style.cssText = '';
    //     window.calcSup = true;
    // }
})();