(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/center/center"],{6524:function(e,n,c){"use strict";var t;c.d(n,"b",(function(){return u})),c.d(n,"c",(function(){return o})),c.d(n,"a",(function(){return t}));var u=function(){var e=this,n=e.$createElement;e._self._c},o=[]},"71c9":function(e,n,c){"use strict";(function(e){c("c56d");t(c("66fd"));var n=t(c("bf86"));function t(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,c("543d")["createPage"])},afe6:function(e,n,c){"use strict";c.r(n);var t=c("b9ee"),u=c.n(t);for(var o in t)"default"!==o&&function(e){c.d(n,e,(function(){return t[e]}))}(o);n["default"]=u.a},b9ee:function(e,n,c){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var t=o(c("a34a")),u=o(c("5945"));function o(e){return e&&e.__esModule?e:{default:e}}function r(e,n,c,t,u,o,r){try{var a=e[o](r),i=a.value}catch(s){return void c(s)}a.done?n(i):Promise.resolve(i).then(t,u)}function a(e){return function(){var n=this,c=arguments;return new Promise((function(t,u){var o=e.apply(n,c);function a(e){r(o,t,u,a,i,"next",e)}function i(e){r(o,t,u,a,i,"throw",e)}a(void 0)}))}}var i={data:function(){return{isH5Plus:!0,user:{},tableName:"",role:"",menuList:[],iconArr:["cuIcon-same","cuIcon-deliver","cuIcon-evaluate","cuIcon-shop","cuIcon-ticket","cuIcon-cascades","cuIcon-discover","cuIcon-question","cuIcon-pic","cuIcon-filter","cuIcon-footprint","cuIcon-pulldown","cuIcon-pullup","cuIcon-moreandroid","cuIcon-refund","cuIcon-qrcode","cuIcon-remind","cuIcon-profile","cuIcon-home","cuIcon-message","cuIcon-link","cuIcon-lock","cuIcon-unlock","cuIcon-vip","cuIcon-weibo","cuIcon-activity","cuIcon-friendadd","cuIcon-friendfamous","cuIcon-friend","cuIcon-goods","cuIcon-selection"]}},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var n=this;return a(t.default.mark((function c(){var o,r,a;return t.default.wrap((function(c){while(1)switch(c.prev=c.next){case 0:return n.role=e.getStorageSync("role"),o=e.getStorageSync("nowTable"),c.next=4,n.$api.session(o);case 4:r=c.sent,n.user=r.data,n.tableName=o,a=u.default.list(),n.menuList=a;case 9:case"end":return c.stop()}}),c)})))()},onShow:function(){var n=this;return a(t.default.mark((function c(){var o,r,a;return t.default.wrap((function(c){while(1)switch(c.prev=c.next){case 0:return e.removeStorageSync("useridTag"),n.role=e.getStorageSync("role"),o=e.getStorageSync("nowTable"),c.next=5,n.$api.session(o);case 5:r=c.sent,n.user=r.data,n.tableName=o,a=u.default.list(),n.menuList=a;case 10:case"end":return c.stop()}}),c)})))()},methods:{onPageTap:function(n){e.setStorageSync("useridTag",1),e.navigateTo({url:n,fail:function(){e.switchTab({url:n})}})}}};n.default=i}).call(this,c("543d")["default"])},bf86:function(e,n,c){"use strict";c.r(n);var t=c("6524"),u=c("afe6");for(var o in u)"default"!==o&&function(e){c.d(n,e,(function(){return u[e]}))}(o);c("f5ae");var r,a=c("f0c5"),i=Object(a["a"])(u["default"],t["b"],t["c"],!1,null,null,null,!1,t["a"],r);n["default"]=i.exports},eeb2:function(e,n,c){},f5ae:function(e,n,c){"use strict";var t=c("eeb2"),u=c.n(t);u.a}},[["71c9","common/runtime","common/vendor"]]]);