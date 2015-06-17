angular.module('omnicontrol').controller('tiposNegociacoesController', function ($scope, TipoNegociacao) {
	
    $scope.tiposNegociacoes = [];

    function buscaTipoNegociacao() {
    	TipoNegociacao.query(function (tiposNegociacoes) {
            $scope.tiposNegociacoes = tiposNegociacoes;
        }, function (erro) {
            console.log('Não foi possivel obter a lista de grupo de produtos.');
        });
    };

    buscaTipoNegociacao();

    $scope.remove = function (tipoNegociacao) {
    	TipoNegociacao.delete({
            id: tipoNegociacao.idTipoNegociacao
        }, buscaTipoNegociacao, function (erro) {
            console.log(erro);
        });
    };
});