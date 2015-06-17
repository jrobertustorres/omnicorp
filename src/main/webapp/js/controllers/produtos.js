angular.module('omnicontrol').controller('produtosController', function ($scope, Produto) {
	
    $scope.produtos = [];

    function buscaProdutos() {
    	Produto.query(function (produtos) {
            $scope.produtos = produtos;
        }, function (erro) {
            console.log('Não foi possivel obter a lista de produtos.');
        });
    };

    buscaProdutos();

    $scope.remove = function (produto) {
    	Produto.delete({
            id: produto.idProduto
        }, buscaProdutos, function (erro) {
            console.log(erro);
        });
    };
});