angular.module('omnicontrol').controller('itensNotaController', function ($scope, ItemNota) {
	
    $scope.itensNota = [];

    function buscaItensNota() {
    	ItemNota.query(function (itensNota) {
            $scope.itensNota = itensNota;
        }, function (erro) {
            console.log('Não foi possivel obter a lista de itens da nota.');
        });
    };

    buscaItensNota();

    $scope.remove = function (itemNota) {
    	ItemNota.delete({
            id: itemNota.idItemNota
        }, buscaItensNota, function (erro) {
            console.log(erro);
        });
    };
});