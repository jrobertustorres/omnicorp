angular.module('omnicontrol').controller('centrosCustoController', function ($scope, CentroCusto) {
	
    $scope.centrosCusto = [];

    function buscaCentrosCusto() {
    	CentroCusto.query(function (centrosCusto) {
            $scope.centrosCusto = centrosCusto;
            //console.log(cargos);
        }, function (erro) {
            console.log('Não foi possivel obter a lista de centros de custo.');
        });
    };

    buscaCentrosCusto();

    $scope.remove = function (centroCusto) {
    	CentroCusto.delete({
            id: centroCusto.idCentroCusto
        }, buscaCentrosCusto, function (erro) {
            console.log(erro);
        });
    };
});