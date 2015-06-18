angular.module('omnicontrol').controller('cabecalhoNotaController', function ($scope, $routeParams, CabecalhoNota, Select) {

    if ($routeParams.idCabecalhoNota) { 
    	CabecalhoNota.get({
        		id: $routeParams.idCabecalhoNota
            }, function (cabecalhoNota) {
                $scope.cabecalhoNota = cabecalhoNota;
            },
            function (erro) {
                console.log(erro);
            });
    } else {
        $scope.cabecalhoNota = new CabecalhoNota();
    }
    
    Select.getOptions('/omnicontrol/api/tiponegociacao/').then(function(result){
    	$scope.optionsTipoNegociacao = result.data;//pega o resultado e disponibiliza ao angular.
    	}, function(error){
    		console.log("Ocorreu um erro.");
    	});
    
    Select.getOptions('/omnicontrol/api/tipooperacao/').then(function(result){
    	$scope.optionsTipoOperacao = result.data;//pega o resultado e disponibiliza ao angular.
    }, function(error){
    	console.log("Ocorreu um erro.");
    });
    
    Select.getOptions('/omnicontrol/api/fornecedor/').then(function(result){
    	$scope.optionsFornecedor = result.data;//pega o resultado e disponibiliza ao angular.
    }, function(error){
    	console.log("Ocorreu um erro.");
    });
    
    Select.getOptions('/omnicontrol/api/centrocusto/').then(function(result){
    	$scope.optionsCentroCusto = result.data;//pega o resultado e disponibiliza ao angular.
    }, function(error){
    	console.log("Ocorreu um erro.");
    });

    $scope.salvar = function () {
        $scope.cabecalhoNota.$save().then(function () {
            $scope.cabecalhoNota = new CabecalhoNota();
        }).catch(function (erro) {
            console.log('Não foi possivel salvar');
        });

        /* O contato criado através de $resource possui características adicionadas dinamicamente pelo serviço
        Contato que até agora nem sabíamos que existiam. Esta é uma das vantagens de trabalharmos com $resource. 
        Qualquer objeto retornado através dele é incrementado com uma série de funções voltadas para persistência, 
        em nosso caso, persistência ligada a REST Endpoints. A função $save gera por debaixo dos panos uma requisição 
        do tipo POST que envia para http://localhost/contatos os dados do contato. */
    }
});