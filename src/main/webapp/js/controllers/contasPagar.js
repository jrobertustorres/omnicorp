angular.module('omnicontrol').controller('contasPagarController', function ($scope, ContaPagar) {
	
    $scope.contasPagar = [];

    function buscaContasPagar() {
    	ContaPagar.query(function (contasPagar) {
            $scope.contasPagar = contasPagar;
        }, function (erro) {
            console.log('Não foi possivel obter a lista de contas a pagar.');
        });
    };

    buscaContasPagar();

    $scope.remove = function (contasPagar) {
    	ContaPagar.delete({ 
            id: contasPagar.idContasPagar
        }, buscaContasPagar, function (erro) {
            console.log(erro);
        });
    };
});