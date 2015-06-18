angular.module('omnicontrol').controller('cabecalhoNotasController', function ($scope, CabecalhoNota) {
	
    $scope.cabecalhoNotas = [];

    function buscaCabecalhoNotas() {
    	CabecalhoNota.query(function (cabecalhoNotas) {
            $scope.cabecalhoNotas = cabecalhoNotas;
        }, function (erro) {
            console.log('Não foi possivel obter a lista de notas.');
        });
    };

    buscaCabecalhoNotas();

    $scope.remove = function (cabecalhoNota) {
    	cabecalhoNotas.delete({
            id: cabecalhoNota.idCabecalhoNota
        }, buscaCabecalhoNotas, function (erro) {
            console.log(erro);
        });
    };
});