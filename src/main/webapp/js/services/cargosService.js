angular.module('omnicontrol').factory('Cargos', function($resource){
    return $resource("/omnicontrol/api/cargo/:id"); // todo servico criado com uma factory deve retornar um objeto
});

/* AngularJS também possui a função service com o mesmo
propósito, porém, no lugar de retornar um objeto, ela retorna uma
função. Na própria documentação do AngularJS, eles sugerem o uso de
factory, pois service entrará em desuso */