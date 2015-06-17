angular.module('omnicontrol').controller('tiposOperacoesController', function ($scope, TipoOperacao) {
	
    $scope.tiposOperacoes = [];

    function buscaTiposOperacoes() {
    	TipoOperacao.query(function (tiposOperacoes) {
            $scope.tiposOperacoes = tiposOperacoes;
        }, function (erro) {
            console.log('Não foi possivel obter a lista de tipos de operacoes.');
        });
    };

    buscaTiposOperacoes();

    $scope.remove = function (tipoOperacao) {
    	TipoOperacao.delete({
            id: tipoOperacao.idTipoOperacao
        }, buscaTiposOperacoes, function (erro) {
            console.log(erro);
        });
    };
});