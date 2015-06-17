angular.module('omnicontrol').controller('funcionarioController', function ($scope, $routeParams, Funcionario, Select) {

    if ($routeParams.idFuncionario) {
    	Funcionario.get({
        		id: $routeParams.idFuncionario
            }, function (funcionario) {
                $scope.funcionario = funcionario;
            },
            function (erro) {
                console.log(erro);
            });
    } else {
        $scope.funcionario = new Funcionario();//limpa o campo e cria um novo usuário deixando já em modo de inclusao
    }
    
    Select.getOptions('/omnicontrol/api/empresa/').then(function(result){
    	$scope.optionsEmpresa = result.data;//pega o resultado e disponibiliza ao angular.
    	}, function(error){
    		console.log("Ocorreu um erro.");
    	});
    
    Select.getOptions('/omnicontrol/api/cargo/').then(function(result){
    	$scope.optionsCargo = result.data;
//    	console.log(result.data);
    }, function(error){
    	console.log("Ocorreu um erro.");
    });

    	
    $scope.salvar = function () {
        $scope.funcionario.$save().then(function () {
            $scope.funcionario = new Funcionario();
        });
    }
});