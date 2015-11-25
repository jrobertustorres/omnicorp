angular.module('omnicontrol').controller('gruposProdutosController', function ($scope, GrupoProduto) {
	
    $scope.gruposProdutos = []; 

    function buscaGruposProdutos() {
    	GrupoProduto.query(function (gruposProdutos) {
            $scope.gruposProdutos = gruposProdutos;
        }, function (erro) {
            console.log('Não foi possivel obter a lista de grupo de produtos.');
        });
    };

    buscaGruposProdutos();

    $scope.remove = function (grupoProduto) {
    	GrupoProduto.delete({
            id: grupoProduto.idGrupoProduto
        }, buscaGruposProdutos, function (erro) {
            console.log(erro);
        });
    };
});