(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/baokanxinxi/add-or-update"],{"2f6f":function(e,n,t){"use strict";t.r(n);var a=t("409b"),r=t("77e0");for(var i in r)"default"!==i&&function(e){t.d(n,e,(function(){return r[e]}))}(i);t("a9b3");var o,u=t("f0c5"),c=Object(u["a"])(r["default"],a["b"],a["c"],!1,null,"19c4611d",null,!1,a["a"],o);n["default"]=c.exports},"409b":function(e,n,t){"use strict";t.d(n,"b",(function(){return r})),t.d(n,"c",(function(){return i})),t.d(n,"a",(function(){return a}));var a={wPicker:function(){return Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(t.bind(null,"2cc9"))}},r=function(){var e=this,n=e.$createElement;e._self._c},i=[]},"491d":function(e,n,t){"use strict";(function(e){t("c56d");a(t("66fd"));var n=a(t("2f6f"));function a(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,t("543d")["createPage"])},6251:function(e,n,t){},"659e":function(e,n,t){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var a=r(t("a34a"));function r(e){return e&&e.__esModule?e:{default:e}}function i(e,n,t,a,r,i,o){try{var u=e[i](o),c=u.value}catch(s){return void t(s)}u.done?n(c):Promise.resolve(c).then(a,r)}function o(e){return function(){var n=this,t=arguments;return new Promise((function(a,r){var o=e.apply(n,t);function u(e){i(o,a,r,u,c,"next",e)}function c(e){i(o,a,r,u,c,"throw",e)}u(void 0)}))}}var u=function(){Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(function(){return resolve(t("2cc9"))}.bind(null,t)).catch(t.oe)},c={data:function(){return{cross:"",ruleForm:{baokanmingcheng:"",fengmian:"",baokanleixing:"",dingyuejiage:"",baokanxiangqing:""},baokanleixingOptions:[],baokanleixingIndex:0,user:{},ro:{baokanmingcheng:!1,fengmian:!1,baokanleixing:!1,dingyuejiage:!1,baokanxiangqing:!1,clicktime:!1,clicknum:!1}}},components:{wPicker:u},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(n){var t=this;return o(a.default.mark((function r(){var i,o,u,c;return a.default.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return i=e.getStorageSync("nowTable"),r.next=3,t.$api.session(i);case 3:return o=r.sent,t.user=o.data,r.next=7,t.$api.option("baokanleixing","baokanleixing",{});case 7:if(o=r.sent,t.baokanleixingOptions=o.data,t.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(t.ruleForm.refid=n.refid,t.ruleForm.nickname=e.getStorageSync("nickname")),!n.id){r.next=17;break}return t.ruleForm.id=n.id,r.next=15,t.$api.info("baokanxinxi",t.ruleForm.id);case 15:o=r.sent,t.ruleForm=o.data;case 17:if(t.cross=n.cross,!n.cross){r.next=53;break}u=e.getStorageSync("crossObj"),r.t0=a.default.keys(u);case 21:if((r.t1=r.t0()).done){r.next=53;break}if(c=r.t1.value,"baokanmingcheng"!=c){r.next=27;break}return t.ruleForm.baokanmingcheng=u[c],t.ro.baokanmingcheng=!0,r.abrupt("continue",21);case 27:if("fengmian"!=c){r.next=31;break}return t.ruleForm.fengmian=u[c],t.ro.fengmian=!0,r.abrupt("continue",21);case 31:if("baokanleixing"!=c){r.next=35;break}return t.ruleForm.baokanleixing=u[c],t.ro.baokanleixing=!0,r.abrupt("continue",21);case 35:if("dingyuejiage"!=c){r.next=39;break}return t.ruleForm.dingyuejiage=u[c],t.ro.dingyuejiage=!0,r.abrupt("continue",21);case 39:if("baokanxiangqing"!=c){r.next=43;break}return t.ruleForm.baokanxiangqing=u[c],t.ro.baokanxiangqing=!0,r.abrupt("continue",21);case 43:if("clicktime"!=c){r.next=47;break}return t.ruleForm.clicktime=u[c],t.ro.clicktime=!0,r.abrupt("continue",21);case 47:if("clicknum"!=c){r.next=51;break}return t.ruleForm.clicknum=u[c],t.ro.clicknum=!0,r.abrupt("continue",21);case 51:r.next=21;break;case 53:t.styleChange();case 54:case"end":return r.stop()}}),r)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},clicktimeConfirm:function(e){console.log(e),this.ruleForm.clicktime=e.result,this.$forceUpdate()},baokanleixingChange:function(e){this.baokanleixingIndex=e.target.value,this.ruleForm.baokanleixing=this.baokanleixingOptions[this.baokanleixingIndex]},fengmianTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.fengmian="upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=this;return o(a.default.mark((function t(){var r,i,o,u,c,s,l,f,g,d;return a.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(!n.ruleForm.dingyuejiage||n.$validate.isNumber(n.ruleForm.dingyuejiage)){t.next=3;break}return n.$utils.msg("订阅价格应输入数字"),t.abrupt("return");case 3:if(!n.ruleForm.clicknum||n.$validate.isIntNumer(n.ruleForm.clicknum)){t.next=6;break}return n.$utils.msg("点击次数应输入整数"),t.abrupt("return");case 6:if(!n.cross){t.next=22;break}if(u=e.getStorageSync("statusColumnName"),c=e.getStorageSync("statusColumnValue"),""==u){t.next=22;break}if(s=e.getStorageSync("crossObj"),u.startsWith("[")){t.next=18;break}for(l in s)l==u&&(s[l]=c);return f=e.getStorageSync("crossTable"),t.next=16,n.$api.update("".concat(f),s);case 16:t.next=22;break;case 18:r=Number(e.getStorageSync("userid")),i=s["id"],o=e.getStorageSync("statusColumnName"),o=o.replace(/\[/,"").replace(/\]/,"");case 22:if(!i||!r){t.next=44;break}return n.ruleForm.crossuserid=r,n.ruleForm.crossrefid=i,g={page:1,limit:10,crossuserid:r,crossrefid:i},t.next=28,n.$api.list("baokanxinxi",g);case 28:if(d=t.sent,!(d.data.total>=o)){t.next=34;break}return n.$utils.msg(e.getStorageSync("tips")),t.abrupt("return",!1);case 34:if(!n.ruleForm.id){t.next=39;break}return t.next=37,n.$api.update("baokanxinxi",n.ruleForm);case 37:t.next=41;break;case 39:return t.next=41,n.$api.add("baokanxinxi",n.ruleForm);case 41:n.$utils.msgBack("提交成功");case 42:t.next=52;break;case 44:if(!n.ruleForm.id){t.next=49;break}return t.next=47,n.$api.update("baokanxinxi",n.ruleForm);case 47:t.next=51;break;case 49:return t.next=51,n.$api.add("baokanxinxi",n.ruleForm);case 51:n.$utils.msgBack("提交成功");case 52:case"end":return t.stop()}}),t)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,t=n.getFullYear(),a=n.getMonth()+1,r=n.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),a=a>9?a:"0"+a,r=r>9?r:"0"+r,"".concat(t,"-").concat(a,"-").concat(r)},toggleTab:function(e){this.$refs[e].show()}}};n.default=c}).call(this,t("543d")["default"])},"77e0":function(e,n,t){"use strict";t.r(n);var a=t("659e"),r=t.n(a);for(var i in a)"default"!==i&&function(e){t.d(n,e,(function(){return a[e]}))}(i);n["default"]=r.a},a9b3:function(e,n,t){"use strict";var a=t("6251"),r=t.n(a);r.a}},[["491d","common/runtime","common/vendor"]]]);