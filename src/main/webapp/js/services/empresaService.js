angular.module('omnicontrol').factory('EmpresaResource', function($resource){//EmpresaResource é criado aqui
    return $resource("/omnicontrol/api/empresa/:id"); // todo servico criado com uma factory deve retornar um objeto
});
