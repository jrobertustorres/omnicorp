angular.module('omnicontrol').controller('contaPagarController', function ($scope, $routeParams, ContaPagar, Select) {

    if ($routeParams.idContasPagar) {
    	ContaPagar.get({
        		id: $routeParams.idContasPagar
            }, function (contasPagar) {
                $scope.contasPagar = contasPagar;
            },
            function (erro) {
                console.log(erro);
            });
    } else {
        $scope.contasPagar  = new ContaPagar();
    }
    
    Select.getOptions('/omnicontrol/api/centrocusto/').then(function(result){
    	$scope.optionsCentroCusto = result.data;
    	}, function(error){
    		console.log("Ocorreu um erro.");
    	});

    $scope.salvar = function () {
        $scope.contasPagar .$save().then(function () {
            $scope.contasPagar = new ContaPagar();
        }).catch(function (erro) {
            console.log('Não foi possivel salvar');
        });

        /*
		 * O centro de custo criado através de $resource possui características
		 * adicionadas dinamicamente pelo serviço centro de custo que até agora
		 * nem sabíamos que existiam. Esta é uma das vantagens de trabalharmos
		 * com $resource. Qualquer objeto retornado através dele é incrementado
		 * com uma série de funções voltadas para persistência, em nosso caso,
		 * persistência ligada a REST Endpoints. A função $save gera por debaixo
		 * dos panos uma requisição do tipo POST que envia para
		 * http://localhost/centroCusto os dados do centro de custo.
		 */
    }
});