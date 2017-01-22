angular.module('listarUsuario',  [])
    .controller('ControListar',	function($scope, $http) {
							
			
 var vm = this;

		$scope.usuario = function() {	
			
			var Url = {
				method : 'POST',
				url : 'http://localhost:8080/service/math/listar',
				headers : {	'Content-Type' : 'application/json'	},
				
		};		
		
					

	     $http(Url).then( function(evt) {   
	    	
	    	 vm.lastnome = [evt.data.responseBeanLastListar.nomes];    	
		  
	       });
	   };
	   
	   
	   $scope.usuarios = function() {			
			
			var Url2 = {
				method : 'POST',
				url : 'http://localhost:8080/service/math/listacompleta',
				headers : {	'Content-Type' : 'application/json'	},
						
				};				

		  $http(Url2).then( function(evt) {
		    	
			 vm.nomes = [evt.data.responseBeanListaCompleta.listfull]; 
			 
		   });
	   };     

});