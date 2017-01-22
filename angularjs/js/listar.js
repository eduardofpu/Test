angular.module('listarUsuario',  [])
    .controller('ControListar',	function($scope, $http) {
							
			
 var vm = this;
 vm.user = null;
 vm.users = null;

		vm.addUsers = function() {
			
			 vm.nomes.push({
					name : vm.user
					});
		}
		
		
		vm.addUsers2 = function() {
			
			 vm.ns.push({
					names : vm.users
					});
		}

		$scope.usuario = function(user) {
			
			
			var Url = {
				method : 'POST',
				url : 'http://localhost:8080/service/math/listar',
				headers : {	'Content-Type' : 'application/json'	},
				data : {							
				}
		};		
					

	     $http(Url).then( function(evt) {
	    	
		   vm.nomes = [   
						
						{name: evt.data.responseBeanLastListar.nomes}

						]; 
	            });
	        };
	        
	        
	        
	        $scope.usuarios = function(users) {
				
				
				var Url2 = {
					method : 'POST',
					url : 'http://localhost:8080/service/math/listacompleta',
					headers : {	'Content-Type' : 'application/json'	},
					data : {							
					}
			};
						

		     $http(Url2).then( function(evt) {
		    	
			   vm.ns = [   
							
							{names: evt.data.responseBeanListaCompleta.listfull}

							]; 
		            });
		        };     

});