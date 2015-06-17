angular.module('omnicontrol').controller('fornecedorController', function ($scope, $routeParams, Fornecedor) {

    if ($routeParams.idFornecedor) {
    	Fornecedor.get({
        		id: $routeParams.idFornecedor
            }, function (fornecedor) {
                $scope.fornecedor = fornecedor;
            },
            function (erro) {
                console.log(erro);
            });
    } else {
        $scope.fornecedor = new Fornecedor();
    }

    $scope.salvar = function () {
        $scope.fornecedor.$save().then(function () {
            $scope.fornecedor = new Fornecedor();
        }).catch(function (erro) {
            console.log('Não foi possivel salvar');
        });
    }
});