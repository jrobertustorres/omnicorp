angular.module('omnicontrol').factory('ContaPagar', function($resource){
    return $resource("/omnicontrol/api/contapagar/:id"); // todo servico criado com uma factory deve retornar um objeto
});
