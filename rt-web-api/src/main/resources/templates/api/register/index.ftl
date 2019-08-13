<!DOCTYPE html>
<html class="fullpage">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no">
    <title>绑定手机号</title>
    <link rel="stylesheet" type="text/css" href="${ctx}/assets/css/vant.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/assets/css/dzx.css">
    <style>
        [v-cloak] {
            display:none !important;
        }
    </style>
</head>
<body>
    <div class="wrapper bindPhone" id="app" v-cloak>
        <div class="box1">
            <!--<form>-->
                <div class="inputBox">
                    <div class="num">
                        +86
                    </div>
                    <div class="input">
                        <input type="text" class="phone"   v-model="from.phone"   @input="inputVal" placeholder="输入手机号">
                    </div>
                </div>
                <div class="inputBox">
                    <div class="input">
                        <input type="text" class="code"  v-model="from.code"   @input="inputVal"  placeholder="输入验证码">
                    </div>
                    <div class="obtain"   >
                        <button class="obtain2" v-if="flag" @click="getCode">获取</button>
                        <button class="obtain1" v-if="!flag">{{second}}S</button>

                    </div>
                </div>
                <input type="hidden" id="formType" value="${type}">
                <button  class="submit"  :class="{submitACT:isActive}"       @click="submits">确定</button>
            <!--</form>-->
        </div>
    </div>
</body>
[#--<script src="https://cdn.jsdelivr.net/npm/vant@1.6/lib/vant.min.js"></script>--]
<script src="${ctx}/assets/js/font.js"></script>
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