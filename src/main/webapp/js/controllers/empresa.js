angular.module('omnicontrol').controller('empresaController', function ($scope, $routeParams, Empresa) {

    if ($routeParams.idEmpresa) {
        Empresa.get({
        		id: $routeParams.idEmpresa
            }, function (empresa) {
                $scope.empresa = empresa;
            },
            function (erro) {
                console.log(erro);
            });
    } else {
        $scope.empresa = new Empresa();
    }

    $scope.salvar = function () {
        $scope.empresa.$save().then(function () {
            $scope.empresa = new Empresa();
        }).catch(function (erro) {
            console.log('Não foi possivel salvar');
        });
    }
});