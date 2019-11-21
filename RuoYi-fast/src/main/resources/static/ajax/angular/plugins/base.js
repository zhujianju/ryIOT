var app=angular.module('jfiot',[]);

/*
 * 定义要给过滤器
 * */
app.filter('trustHtml',['$sce',function($sce){
    return function(data){
        return $sce.trustAsHtml(data);
    }
}]);