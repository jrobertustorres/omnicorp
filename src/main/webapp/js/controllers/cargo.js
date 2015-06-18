angular.module('omnicontrol').controller('cargoController', function ($scope, $routeParams, Cargos) {

    if ($routeParams.idCargo) { 
        Cargos.get({
        		id: $routeParams.idCargo
            }, function (cargo) {
                $scope.cargo = cargo;
            },
            function (erro) {
                console.log(erro);
            });
    } else {
        $scope.cargo = new Cargos();
    }

    $scope.salvar = function () {
        $scope.cargo.$save().then(function () {
            $scope.cargo = new Cargos();
        }).catch(function (erro) {
            console.log('Não foi possivel salvar');
        });

        /* O contato criado através de $resource possui características adicionadas dinamicamente pelo serviço
        Contato que até agora nem sabíamos que existiam. Esta é uma das vantagens de trabalharmos com $resource. 
        Qualquer objeto retornado através dele é incrementado com uma série de funções voltadas para persistência, 
        em nosso caso, persistência ligada a REST Endpoints. A função $save gera por debaixo dos panos uma requisição 
        do tipo POST que envia para http://localhost/contatos os dados do contato. */
    }
});