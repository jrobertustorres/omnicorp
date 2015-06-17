angular.module('omnicontrol').controller('produtoController', function ($scope, $routeParams, Produto, Select) {

    if ($routeParams.idProduto) {
    	Produto.get({
        		id: $routeParams.idProduto
            }, function (produto) {
                $scope.produto = produto;
            },
            function (erro) {
                console.log(erro);
            });
    } else {
        $scope.produto = new Produto();
    }
    
//    $scope.optionGrupo = [];
    Select.getOptions('/omnicontrol/api/grupoproduto/').then(function(result){
    	$scope.optionsGrupo = result.data;
    	console.log(result.data);
    	}, function(error){
    		console.log("Ocorreu um erro.");
    	});

    $scope.salvar = function () {
        $scope.produto.$save().then(function () {
            $scope.produto = new Produto();
        }).catch(function (erro) {
            console.log('Não foi possivel salvar');
        });
    }
});