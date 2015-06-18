angular.module('omnicontrol').controller('empresaController', function ($scope, $routeParams, EmpresaResource) {

    if ($routeParams.idEmpresa) {
    	EmpresaResource.get({
        		id: $routeParams.idEmpresa
            }, function (empresa) {
                $scope.empresa = empresa;
            },
            function (erro) {
                console.log(erro);
            });
    } else {
        $scope.empresa = new EmpresaResource();
    }

    $scope.salvar = function () {
        $scope.empresa.$save().then(function () {
            $scope.empresa = new EmpresaResource();
        }).catch(function (erro) {
            console.log('Não foi possivel salvar');
        });
    }
});