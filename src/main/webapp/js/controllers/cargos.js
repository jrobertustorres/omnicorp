angular.module('omnicontrol').controller('cargosController', function ($scope, Cargos) {
	
    $scope.cargos = []; 
    var EDIT_MODE = "edit";
    var mode;
    function buscaCargos() {
    	Cargos.query(function (cargos) {
            $scope.cargos = cargos;
            //console.log(cargos);
        }, function (erro) {
            console.log('Não foi possivel obter a lista de cargos.');
        });
    };

    buscaCargos();

    $scope.isEditNoteMode = function ()
    {
        return EDIT_MODE === mode;
    };

    $scope.addNote = function (cargo)
    {
        $scope.idCargo = cargo;
        mode = EDIT_MODE;
    };

    $scope.cancel = function ()
    {
        mode = undefined;
    };
    
    $scope.remove = function (cargo) {
    	Cargos.delete({
            id: cargo
//            id: cargo.idCargo
        }, buscaCargos, function (erro) {
            console.log(erro);
        });
    	mode = undefined;
    };
});