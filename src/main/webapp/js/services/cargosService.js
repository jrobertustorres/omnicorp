angular.module('omnicontrol').factory('Cargos', function($resource){
    return $resource("/omnicontrol/api/cargo/:id"); // todo servico criado com uma factory deve retornar um objeto
});

/* AngularJS também possui a função service com o mesmo
propósito, porém, no lugar de retornar um objeto, ela retorna uma
função. Na própria documentação do AngularJS, eles sugerem o uso de
factory, pois service entrará em desuso */

/* O cargo criado através de $resource possui características adicionadas dinamicamente pelo serviço
cargo que até agora nem sabíamos que existiam. Esta é uma das vantagens de trabalharmos com $resource. 
Qualquer objeto retornado através dele é incrementado com uma série de funções voltadas para persistência, 
em nosso caso, persistência ligada a REST Endpoints. A função $save gera por debaixo dos panos uma requisição 
do tipo POST que envia para http://localhost/api/cargo os dados do cargo. */