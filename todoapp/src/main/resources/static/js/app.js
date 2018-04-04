

var app = angular.module('todoApp',[]);
console.log("hello");
    app.controller("TodoAppCtrl",function($scope){
        
    console.log("todo");
    $scope.addTask =function(){
        console.log($scope.addItem);
    }
})