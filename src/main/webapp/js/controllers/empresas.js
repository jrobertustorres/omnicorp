angular.module('omnicontrol').controller('empresasController', function ($scope, Empresa) {
	
    $scope.empresas = [];

    function buscaEmpresas() {
    	Empresa.query(function (empresas) {
            $scope.empresas = empresas;
        }, function (erro) {
            console.log('Não foi possivel obter a lista de empresas.');
        });
    };

    buscaEmpresas();

    $scope.remove = function (empresa) {
    	Empresa.delete({
            id: empresa.idEmpresa
        }, buscaEmpresas, function (erro) {
            console.log(erro);
        });
    };
});