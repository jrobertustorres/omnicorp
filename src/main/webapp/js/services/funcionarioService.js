angular.module('omnicontrol').factory('Funcionario', function($resource/*, $http*/){
	return $resource("/omnicontrol/api/funcionario/:id"); // todo servico criado com uma factory deve retornar um objeto
//	return $resource('/omnicontrol/api/funcionario/:id', {}, {
//	      save: { method: 'POST', headers: { 'Content-Type': 'application/x-www-form-urlencoded' } }
//	    });
//	return $http.post('/omnicontrol/api/funcionario/:id')
	


	
});
