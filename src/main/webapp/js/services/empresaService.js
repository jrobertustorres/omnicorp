angular.module('omnicontrol').factory('Empresa', function($resource){
    return $resource("/omnicontrol/api/empresa/:id"); // todo servico criado com uma factory deve retornar um objeto
});
