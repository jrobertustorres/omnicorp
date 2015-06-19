angular.module('omnicontrol').controller('cabecalhoNotaController', function ($scope, $routeParams, CabecalhoNota, Select, ItemNota) {

    if ($routeParams.idCabecalhoNota) { 
    	refresh();
    } else {
        $scope.cabecalhoNota = new CabecalhoNota();
    }
    
    $scope.salvar = function () {
        $scope.cabecalhoNota.$save().then(function () {
//            $scope.cabecalhoNota = new CabecalhoNota();
        }).catch(function (erro) {
            console.log('Não foi possivel salvar');
        });
    }
    
    var EDIT_MODE = "edit";
    var mode = undefined;
    
    $scope.isAddItemMode = function ()
    {
        return EDIT_MODE === mode;
    };
   
    
    $scope.addItem = function ()
    {   
    	$scope.itemNota = new ItemNota();
    	$scope.itemNota.cabecalhoNota =  $scope.cabecalhoNota;
        mode = EDIT_MODE;
    };
    
    $scope.$watch('itemNota.valorUnitario * itemNota.quantidade', function (value) {
        $scope.itemNota.valorTotal = value;
    });
    
    $scope.salvarItem = function () {
        $scope.itemNota.$save().then(function () {
        	$scope.cabecalhoNota.itemNotas.push($scope.itemNota);
            $scope.itemNota = new ItemNota();
            refresh();
            
        }).catch(function (erro) {
            console.log('Não foi possivel salvar');
        });
    }
    
    function refresh(){
    	  CabecalhoNota.get({
      		id: $routeParams.idCabecalhoNota
          }, function (cabecalhoNota) {
              $scope.cabecalhoNota = cabecalhoNota;
              mode = undefined;
          },
          function (erro) {
              console.log(erro);
          });
    }
    
    
    $scope.cancel = function ()
    {
        mode = undefined;
    };
    
    $scope.removeItem = function (itemNota) {
    	ItemNota.delete({
            id: itemNota.idItemNota
        }, refresh, function (erro) {
            console.log(erro);
        });
    };
    
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

    Select.getOptions('/omnicontrol/api/produto/').then(function(result){
    	$scope.optionsProduto = result.data;
    }, function(error){
    	console.log("Ocorreu um erro.");
    });
    
});



/* O contato criado através de $resource possui características adicionadas dinamicamente pelo serviço
Contato que até agora nem sabíamos que existiam. Esta é uma das vantagens de trabalharmos com $resource. 
Qualquer objeto retornado através dele é incrementado com uma série de funções voltadas para persistência, 
em nosso caso, persistência ligada a REST Endpoints. A função $save gera por debaixo dos panos uma requisição 
do tipo POST que envia para http://localhost/contatos os dados do contato. */

