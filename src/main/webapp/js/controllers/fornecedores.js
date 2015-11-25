angular.module('omnicontrol').controller('fornecedoresController', function ($scope, Fornecedor) {
	
    $scope.fornecedores = [];

    function buscaFornecedores() { 
    	Fornecedor.query(function (fornecedores) {
            $scope.fornecedores = fornecedores;
        }, function (erro) {
            console.log('Não foi possivel obter a lista de Fornecedores.');
        });
    };

    buscaFornecedores();

    $scope.remove = function (fornecedor) {
    	Fornecedor.delete({
            id: fornecedor.idFornecedor
        }, buscaFornecedores, function (erro) {
            console.log(erro);
        });
    };
});