(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-baokanxinxi-add-or-update"],{"23d1":function(e,r,t){"use strict";t.r(r);var i=t("cac9"),a=t.n(i);for(var n in i)"default"!==n&&function(e){t.d(r,e,(function(){return i[e]}))}(n);r["default"]=a.a},"6c9e":function(e,r,t){"use strict";var i={"w-picker":t("e2b1").default},a=function(){var e=this,r=e.$createElement,t=e._self._c||r;return t("v-uni-view",{staticClass:"content"},[t("v-uni-form",{staticClass:"app-update-pv"},[t("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 24rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(251, 251, 251, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[t("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[e._v("报刊名称")]),t("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(194, 228, 106, 1)",backgroundColor:"rgba(255, 255, 255, 0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"16rpx",borderWidth:"2rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"dashed",height:"60rpx"},attrs:{disabled:e.ro.baokanmingcheng,placeholder:"报刊名称"},model:{value:e.ruleForm.baokanmingcheng,callback:function(r){e.$set(e.ruleForm,"baokanmingcheng",r)},expression:"ruleForm.baokanmingcheng"}})],1),t("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 24rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(251, 251, 251, 1)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"},on:{click:function(r){arguments[0]=r=e.$handleEvent(r),e.fengmianTap.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[e._v("封面")]),t("v-uni-view",{staticClass:"right-input",staticStyle:{padding:"0"}},[e.ruleForm.fengmian?t("v-uni-image",{staticClass:"avator",style:{padding:"0",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"16rpx 0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",borderRadius:"100%",borderWidth:"0",width:"88rpx",borderStyle:"solid",height:"88rpx"},attrs:{src:e.baseUrl+e.ruleForm.fengmian,mode:"aspectFill"}}):t("v-uni-image",{staticClass:"avator",style:{padding:"0",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"16rpx 0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",borderRadius:"100%",borderWidth:"0",width:"88rpx",borderStyle:"solid",height:"88rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1)],1),t("v-uni-view",{staticClass:"cu-form-group select",style:{padding:"0 24rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(251, 251, 251, 1)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[t("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[e._v("报刊类型")]),t("v-uni-picker",{attrs:{value:e.baokanleixingIndex,range:e.baokanleixingOptions},on:{change:function(r){arguments[0]=r=e.$handleEvent(r),e.baokanleixingChange.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"uni-input",style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(194, 228, 106, 1)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"16rpx",borderWidth:"2rpx",width:"calc(100% - 160rpx)",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"dashed"}},[e._v(e._s(e.ruleForm.baokanleixing?e.ruleForm.baokanleixing:"请选择报刊类型"))])],1)],1),t("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 24rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(251, 251, 251, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"}},[t("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[e._v("订阅价格")]),t("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(194, 228, 106, 1)",backgroundColor:"rgba(255, 255, 255, 0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"16rpx",borderWidth:"2rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"dashed",height:"60rpx"},attrs:{disabled:e.ro.dingyuejiage,placeholder:"订阅价格"},model:{value:e.ruleForm.dingyuejiage,callback:function(r){e.$set(e.ruleForm,"dingyuejiage",r)},expression:"ruleForm.dingyuejiage"}})],1),t("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 24rpx",boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(251, 251, 251, 1)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[e._v("报刊详情")]),t("v-uni-textarea",{style:{padding:"20rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(194, 228, 106, 1)",borderRadius:"16rpx",color:"rgba(0, 0, 0, 1)",borderWidth:"2rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"dashed",height:"240rpx"},attrs:{placeholder:"报刊详情"},model:{value:e.ruleForm.baokanxiangqing,callback:function(r){e.$set(e.ruleForm,"baokanxiangqing",r)},expression:"ruleForm.baokanxiangqing"}})],1),t("v-uni-view",{staticClass:"btn"},[t("v-uni-button",{staticClass:"bg-red",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0) inset",margin:"0 auto",backgroundColor:"rgba(194, 228, 106, 1)",borderColor:"#409EFF",borderRadius:"88rpx",color:"#fff",borderWidth:"0",width:"60%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},on:{click:function(r){arguments[0]=r=e.$handleEvent(r),e.onSubmitTap.apply(void 0,arguments)}}},[e._v("提交")])],1)],1),t("w-picker",{ref:"clicktime",attrs:{mode:"dateTime",step:"1",current:!1,hasSecond:!1,themeColor:"#333333"},on:{confirm:function(r){arguments[0]=r=e.$handleEvent(r),e.clicktimeConfirm.apply(void 0,arguments)}}})],1)},n=[];t.d(r,"b",(function(){return a})),t.d(r,"c",(function(){return n})),t.d(r,"a",(function(){return i}))},"9c94":function(e,r,t){"use strict";t.r(r);var i=t("6c9e"),a=t("23d1");for(var n in a)"default"!==n&&function(e){t.d(r,e,(function(){return a[e]}))}(n);t("a3e0");var o,c=t("f0c5"),d=Object(c["a"])(a["default"],i["b"],i["c"],!1,null,"0805f51c",null,!1,i["a"],o);r["default"]=d.exports},a3e0:function(e,r,t){"use strict";var i=t("ef0a"),a=t.n(i);a.a},cac9:function(e,r,t){"use strict";var i=t("4ea4");Object.defineProperty(r,"__esModule",{value:!0}),r.default=void 0,t("a481"),t("c5f6"),t("f559"),t("ac6a"),t("96cf");var a=i(t("3b8d")),n=i(t("e2b1")),o={data:function(){return{cross:"",ruleForm:{baokanmingcheng:"",fengmian:"",baokanleixing:"",dingyuejiage:"",baokanxiangqing:""},baokanleixingOptions:[],baokanleixingIndex:0,user:{},ro:{baokanmingcheng:!1,fengmian:!1,baokanleixing:!1,dingyuejiage:!1,baokanxiangqing:!1,clicktime:!1,clicknum:!1}}},components:{wPicker:n.default},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var e=(0,a.default)(regeneratorRuntime.mark((function e(r){var t,i,a,n;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=uni.getStorageSync("nowTable"),e.next=3,this.$api.session(t);case 3:return i=e.sent,this.user=i.data,e.next=7,this.$api.option("baokanleixing","baokanleixing",{});case 7:if(i=e.sent,this.baokanleixingOptions=i.data,this.ruleForm.userid=uni.getStorageSync("userid"),r.refid&&(this.ruleForm.refid=r.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!r.id){e.next=17;break}return this.ruleForm.id=r.id,e.next=15,this.$api.info("baokanxinxi",this.ruleForm.id);case 15:i=e.sent,this.ruleForm=i.data;case 17:if(this.cross=r.cross,!r.cross){e.next=53;break}a=uni.getStorageSync("crossObj"),e.t0=regeneratorRuntime.keys(a);case 21:if((e.t1=e.t0()).done){e.next=53;break}if(n=e.t1.value,"baokanmingcheng"!=n){e.next=27;break}return this.ruleForm.baokanmingcheng=a[n],this.ro.baokanmingcheng=!0,e.abrupt("continue",21);case 27:if("fengmian"!=n){e.next=31;break}return this.ruleForm.fengmian=a[n],this.ro.fengmian=!0,e.abrupt("continue",21);case 31:if("baokanleixing"!=n){e.next=35;break}return this.ruleForm.baokanleixing=a[n],this.ro.baokanleixing=!0,e.abrupt("continue",21);case 35:if("dingyuejiage"!=n){e.next=39;break}return this.ruleForm.dingyuejiage=a[n],this.ro.dingyuejiage=!0,e.abrupt("continue",21);case 39:if("baokanxiangqing"!=n){e.next=43;break}return this.ruleForm.baokanxiangqing=a[n],this.ro.baokanxiangqing=!0,e.abrupt("continue",21);case 43:if("clicktime"!=n){e.next=47;break}return this.ruleForm.clicktime=a[n],this.ro.clicktime=!0,e.abrupt("continue",21);case 47:if("clicknum"!=n){e.next=51;break}return this.ruleForm.clicknum=a[n],this.ro.clicknum=!0,e.abrupt("continue",21);case 51:e.next=21;break;case 53:this.styleChange();case 54:case"end":return e.stop()}}),e,this)})));function r(r){return e.apply(this,arguments)}return r}(),methods:{styleChange:function(){this.$nextTick((function(){}))},clicktimeConfirm:function(e){console.log(e),this.ruleForm.clicktime=e.result,this.$forceUpdate()},baokanleixingChange:function(e){this.baokanleixingIndex=e.target.value,this.ruleForm.baokanleixing=this.baokanleixingOptions[this.baokanleixingIndex]},fengmianTap:function(){var e=this;this.$api.upload((function(r){e.ruleForm.fengmian="upload/"+r.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=(0,a.default)(regeneratorRuntime.mark((function e(){var r,t,i,a,n,o,c,d,s,u;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(!this.ruleForm.dingyuejiage||this.$validate.isNumber(this.ruleForm.dingyuejiage)){e.next=3;break}return this.$utils.msg("订阅价格应输入数字"),e.abrupt("return");case 3:if(!this.ruleForm.clicknum||this.$validate.isIntNumer(this.ruleForm.clicknum)){e.next=6;break}return this.$utils.msg("点击次数应输入整数"),e.abrupt("return");case 6:if(!this.cross){e.next=22;break}if(a=uni.getStorageSync("statusColumnName"),n=uni.getStorageSync("statusColumnValue"),""==a){e.next=22;break}if(o=uni.getStorageSync("crossObj"),a.startsWith("[")){e.next=18;break}for(c in o)c==a&&(o[c]=n);return d=uni.getStorageSync("crossTable"),e.next=16,this.$api.update("".concat(d),o);case 16:e.next=22;break;case 18:r=Number(uni.getStorageSync("userid")),t=o["id"],i=uni.getStorageSync("statusColumnName"),i=i.replace(/\[/,"").replace(/\]/,"");case 22:if(!t||!r){e.next=44;break}return this.ruleForm.crossuserid=r,this.ruleForm.crossrefid=t,s={page:1,limit:10,crossuserid:r,crossrefid:t},e.next=28,this.$api.list("baokanxinxi",s);case 28:if(u=e.sent,!(u.data.total>=i)){e.next=34;break}return this.$utils.msg(uni.getStorageSync("tips")),e.abrupt("return",!1);case 34:if(!this.ruleForm.id){e.next=39;break}return e.next=37,this.$api.update("baokanxinxi",this.ruleForm);case 37:e.next=41;break;case 39:return e.next=41,this.$api.add("baokanxinxi",this.ruleForm);case 41:this.$utils.msgBack("提交成功");case 42:e.next=52;break;case 44:if(!this.ruleForm.id){e.next=49;break}return e.next=47,this.$api.update("baokanxinxi",this.ruleForm);case 47:e.next=51;break;case 49:return e.next=51,this.$api.add("baokanxinxi",this.ruleForm);case 51:this.$utils.msgBack("提交成功");case 52:case"end":return e.stop()}}),e,this)})));function r(){return e.apply(this,arguments)}return r}(),optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var r=new Date,t=r.getFullYear(),i=r.getMonth()+1,a=r.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),i=i>9?i:"0"+i,a=a>9?a:"0"+a,"".concat(t,"-").concat(i,"-").concat(a)},toggleTab:function(e){this.$refs[e].show()}}};r.default=o},ef0a:function(e,r,t){var i=t("ef8c");"string"===typeof i&&(i=[[e.i,i,""]]),i.locals&&(e.exports=i.locals);var a=t("4f06").default;a("5d5718bc",i,!0,{sourceMap:!1,shadowMode:!1})},ef8c:function(e,r,t){var i=t("24fb");r=i(!1),r.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.container[data-v-0805f51c]{padding:%?20?%}.content[data-v-0805f51c]:after{position:fixed;top:0;right:0;left:0;bottom:0;content:"";background-image:url(http://codegen.caihongy.cn/20220228/7f3a57dc79b24af5ae7ad139ab383f91.png);background-attachment:fixed;background-size:cover;background-position:50%}uni-textarea[data-v-0805f51c]{border:%?1?% solid #eee;border-radius:%?20?%;padding:%?20?%}.title[data-v-0805f51c]{width:%?180?%}.avator[data-v-0805f51c]{width:%?150?%;height:%?60?%}.right-input[data-v-0805f51c]{-webkit-box-flex:1;-webkit-flex:1;flex:1;text-align:left;padding:0 %?24?%}.cu-form-group.active[data-v-0805f51c]{-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between}.btn[data-v-0805f51c]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;-webkit-flex-wrap:wrap;flex-wrap:wrap;padding:%?20?% 0}.cu-form-group[data-v-0805f51c]{padding:0 %?24?%;background-color:initial;min-height:inherit}.cu-form-group + .cu-form-group[data-v-0805f51c]{border:0}.cu-form-group uni-input[data-v-0805f51c]{padding:0 %?30?%}.uni-input[data-v-0805f51c]{padding:0 %?30?%}.cu-form-group uni-textarea[data-v-0805f51c]{padding:%?30?%;margin:0}.cu-form-group uni-picker[data-v-0805f51c]::after{line-height:%?80?%}.select .uni-input[data-v-0805f51c]{line-height:%?80?%}.input .right-input[data-v-0805f51c]{line-height:%?60?%}',""]),e.exports=r}}]);