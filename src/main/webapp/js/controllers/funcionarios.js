angular.module('omnicontrol').controller('funcionariosController', function ($scope, Funcionario) {
	
    $scope.funcionarios = [];

    function buscaFuncionarios() {
    	Funcionario.query(function (funcionarios) {
            $scope.funcionarios = funcionarios;
        }, function (erro) {
            console.log('Não foi possivel obter a lista de funcionarios.');
        });
    };

    buscaFuncionarios();

    $scope.remove = function (funcionario) {
    	Funcionario.delete({
            id: funcionario.idFuncionario
        }, buscaFuncionarios, function (erro) {
            console.log(erro);
        });
    };
});