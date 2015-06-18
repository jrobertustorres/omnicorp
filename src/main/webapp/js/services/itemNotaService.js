angular.module('omnicontrol').factory('ItemNota', function($resource){//EmpresaResource é criado aqui
    return $resource("/omnicontrol/api/itemnota/:id"); // todo servico criado com uma factory deve retornar um objeto
});
