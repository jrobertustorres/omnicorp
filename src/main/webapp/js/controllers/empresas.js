angular.module('omnicontrol').controller('empresasController', function ($scope, EmpresaResource) {//EmpresaResource é injetado com o objeto criado pelo factory
	
    $scope.empresas = [];

    function buscaEmpresas() {
    	EmpresaResource.query(function (empresas) {
            $scope.empresas = empresas;
        }, function (erro) {
            console.log('Não foi possivel obter a lista de empresas.');
        });
    };

    buscaEmpresas();

    $scope.remove = function (empresa) {
    	EmpresaResource.delete({
            id: empresa.idEmpresa
        }, buscaEmpresas, function (erro) {
            console.log(erro);
        });
    };
});