angular.module('cadastrarUsuario', [])
		.controller('ControUser',function($scope, $http) {

					var vm = this;

					vm.user = null;

					vm.nomes = [
					{name : 'Raul'},					
					{name : 'Cicero'},
					{name : 'Luis Inacio'},
					{name : 'Camoes'},
					{name : 'Zebedeu'},
					{name : 'Maria'},
					{name : 'João'},
					{name : 'Pedro'},
					{name : 'Tiago'},
					{name : 'Samuel'},
					{name : 'Tito'}

					];					

					

					$scope.usuario = function(user) {
						vm.nomes.push({
							name : vm.user
						});
						
						var Url = {
							method : 'POST',
							url : 'http://localhost:8080/service/math/cadastrar',
							headers : {
								'Content-Type' : 'application/json'
							},
							data : {
								'requestBeanCadastrarUsuario' : {'nome' : vm.user	}
							}
							
							
							
						};
						
						

	$http(Url).then( function(evt) {
		
		$scope.valor = evt.data.responseBeanCadastrarUsuario.usuarios;

				$scope.a;

					});
			};

	});