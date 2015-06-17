angular.module('omnicontrol').factory('Produto', function($resource){
    return $resource("/omnicontrol/api/produto/:id"); // todo servico criado com uma factory deve retornar um objeto
});
