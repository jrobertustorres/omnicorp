angular.module('omnicontrol').factory('CabecalhoNota', function($resource){
    return $resource("/omnicontrol/api/cabecalhonota/:id"); // todo servico criado com uma factory deve retornar um objeto
});
