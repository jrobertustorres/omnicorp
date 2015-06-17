angular.module('omnicontrol').controller('tipoNegociacaoController', function ($scope, $routeParams, TipoNegociacao) {

	if ($routeParams.idTipoNegociacao) {
    	TipoNegociacao.get({
        		id: $routeParams.idTipoNegociacao
            }, function (tipoNegociacao) {
                $scope.tipoNegociacao = tipoNegociacao;
            },
            function (erro) {
                console.log(erro);
            });
    } else {
        $scope.tipoNegociacao = new TipoNegociacao();
    }

    $scope.salvar = function () {
        $scope.tipoNegociacao.$save().then(function () {
            $scope.tipoNegociacao = new TipoNegociacao();
        }).catch(function (erro) {
            console.log('Não foi possivel salvar');
        });

        /* O centro de custo criado através de $resource possui características adicionadas dinamicamente pelo serviço
        centro de custo que até agora nem sabíamos que existiam. Esta é uma das vantagens de trabalharmos com $resource. 
        Qualquer objeto retornado através dele é incrementado com uma série de funções voltadas para persistência, 
        em nosso caso, persistência ligada a REST Endpoints. A função $save gera por debaixo dos panos uma requisição 
        do tipo POST que envia para http://localhost/centroCusto os dados do centro de custo. */
    }
});