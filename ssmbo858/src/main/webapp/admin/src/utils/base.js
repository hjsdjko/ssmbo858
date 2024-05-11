const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmbo858/",
            name: "ssmbo858",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmbo858/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于微信平台的报刊订阅小程序"
        } 
    }
}
export default base
