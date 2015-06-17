angular.module('omnicontrol').controller('cargosController', function ($scope, Cargos) {
	
    $scope.cargos = [];

    function buscaCargos() {
    	Cargos.query(function (cargos) {
            $scope.cargos = cargos;
            //console.log(cargos);
        }, function (erro) {
            console.log('Não foi possivel obter a lista de cargos.');
        });
    };

    buscaCargos();

    $scope.remove = function (cargo) {
    	Cargos.delete({
            id: cargo.idCargo
        }, buscaCargos, function (erro) {
            console.log(erro);
        });
    };
});