angular.module('omnicontrol').controller('tipoOperacaoController', function ($scope, $routeParams, TipoOperacao) {

    if ($routeParams.idTipoOperacao) {
    	TipoOperacao.get({
        		id: $routeParams.idTipoOperacao
            }, function (tipoOperacao) {
                $scope.tipoOperacao = tipoOperacao;
            },
            function (erro) {
                console.log(erro);
            });
    } else {
        $scope.tipoOperacao  = new TipoOperacao();
    }

    $scope.salvar = function () {
        $scope.tipoOperacao .$save().then(function () {
            $scope.tipoOperacao  = new TipoOperacao();
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