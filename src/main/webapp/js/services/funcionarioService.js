angular.module('omnicontrol').factory('Funcionario', function($resource){
	return $resource("/omnicontrol/api/funcionario/:id"); // todo servico criado com uma factory deve retornar um objeto
});
