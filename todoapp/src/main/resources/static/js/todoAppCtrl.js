    app.controller("TodoAppCtrl",['$scope', '$http','TodoService', function($scope, $http,TodoService){
    	 var REST_SERVICE_URI = 'http://localhost:9999/';  
    console.log("todo");
        var self = this;
    self.userStory={discription:'',status:'Pending'};
    self.userStories=[];
    
    $scope.addTask =function(){
        $http.post(REST_SERVICE_URI+'addTask', self.userStory)
        .then(
        function (response) {
            
        }
    );
        
        
    }
    
   
    $scope.pendingTask= function pendingTask(){
    $http.get(REST_SERVICE_URI+'pendingTask')
    .then(
    function (response) {
     $scope.tasks= response.data;
     $scope.showPendingTask=true;
     $scope.showCompleteTask=false;
    }
);
      
    }
    
    $scope.completeTask= function completeTask(){
        $http.get(REST_SERVICE_URI+'completeTask')
        .then(
        function (response) {
         $scope.tasks= response.data;
         $scope.showCompleteTask=true;
         $scope.showPendingTask=false;
         
        
        }
    );
          
        }
    
    $scope.edit=function(userStory){
    	userStory.status="Completed"
        $http.post(REST_SERVICE_URI+'updateTask',userStory)
        .then(
        function (response) {
        }
    );	
    }
    
    $scope.delete=function(storyId){
 
  	  $http.get(REST_SERVICE_URI+'deleteTask/'+storyId)
  	    .then(
  	    function (response) {
  	    	pendingTask();
  	    });
  }
    
    
}])
