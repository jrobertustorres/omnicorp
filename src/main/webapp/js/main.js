var app = angular.module('omnicontrol', ['ngRoute', 'ngResource']);

app.config(function ($routeProvider) {
    $routeProvider.when('/cargos', {
        templateUrl: 'partials/cargos.html',
        controller: 'cargosController'
    });
    
    $routeProvider.when('/cargo', {
        templateUrl: 'partials/cargo.html',
        controller: 'cargoController'
    });
    
    $routeProvider.when('/cargo/:idCargo', {
        templateUrl: 'partials/cargo.html',
        controller: 'cargoController'
    });

    $routeProvider.when('/empresas', {
        templateUrl: 'partials/empresas.html',
        controller: 'empresasController'
    });
    
    $routeProvider.when('/empresa', {
        templateUrl: 'partials/empresa.html',
        controller: 'empresaController'
    });
    
    $routeProvider.when('/empresa/:idEmpresa', {
        templateUrl: 'partials/empresa.html',
        controller: 'empresaController'
    });
    
    $routeProvider.when('/funcionarios', {
        templateUrl: 'partials/funcionarios.html',
        controller: 'funcionariosController'
    });
    
    $routeProvider.when('/funcionario', {
        templateUrl: 'partials/funcionario.html',
        controller: 'funcionarioController'
    });
    
    $routeProvider.when('/funcionario/:idFuncionario', {
        templateUrl: 'partials/funcionario.html',
        controller: 'funcionarioController'
    });
    
    $routeProvider.when('/centrosCusto', {
        templateUrl: 'partials/centrosCusto.html',
        controller: 'centrosCustoController'
    });
    
    $routeProvider.when('/centroCusto', {
        templateUrl: 'partials/centroCusto.html',
        controller: 'centroCustoController'
    });
    
    $routeProvider.when('/centroCusto/:idCentroCusto', {
        templateUrl: 'partials/centroCusto.html',
        controller: 'centroCustoController'
    });
    
    $routeProvider.when('/gruposProdutos', {
        templateUrl: 'partials/gruposProdutos.html',
        controller: 'gruposProdutosController'
    });
    
    $routeProvider.when('/grupoProduto', {
        templateUrl: 'partials/grupoProduto.html',
        controller: 'grupoProdutoController'
    });
    
    $routeProvider.when('/grupoProduto/:idGrupoProduto', {
        templateUrl: 'partials/grupoProduto.html',
        controller: 'grupoProdutoController'
    });
    
    $routeProvider.when('/tiposNegociacoes', {
        templateUrl: 'partials/tiposNegociacoes.html',
        controller: 'tiposNegociacoesController'
    });
    
    $routeProvider.when('/tipoNegociacao', {
        templateUrl: 'partials/tipoNegociacao.html',
        controller: 'tipoNegociacaoController'
    });
    
    $routeProvider.when('/tipoNegociacao/:idTipoNegociacao', {
        templateUrl: 'partials/tipoNegociacao.html',
        controller: 'tipoNegociacaoController'
    });
    
    $routeProvider.when('/fornecedores', {
        templateUrl: 'partials/fornecedores.html',
        controller: 'fornecedoresController'
    });
    
    $routeProvider.when('/fornecedor', {
        templateUrl: 'partials/fornecedor.html',
        controller: 'fornecedorController'
    });
    
    $routeProvider.when('/fornecedor/:idFornecedor', {
        templateUrl: 'partials/fornecedor.html',
        controller: 'fornecedorController'
    });
    
    $routeProvider.when('/tiposOperacoes', {
        templateUrl: 'partials/tiposOperacoes.html',
        controller: 'tiposOperacoesController'
    });
    
    $routeProvider.when('/tipoOperacao', {
        templateUrl: 'partials/tipoOperacao.html',
        controller: 'tipoOperacaoController'
    });
    
    $routeProvider.when('/tipoOperacao/:idTipoOperacao', {
        templateUrl: 'partials/tipoOperacao.html',
        controller: 'tipoOperacaoController'
    });
    
    $routeProvider.when('/produtos', {
        templateUrl: 'partials/produtos.html',
        controller: 'produtosController'
    });
    
    $routeProvider.when('/produto', {
        templateUrl: 'partials/produto.html',
        controller: 'produtoController'
    });
    
    $routeProvider.when('/produto/:idProduto', {
        templateUrl: 'partials/produto.html',
        controller: 'produtoController'
    });
    
    $routeProvider.when('/cabecalhoNotas', {
        templateUrl: 'partials/cabecalhoNotas.html',
        controller: 'cabecalhoNotasController'
    });
    
    $routeProvider.when('/nota', {
        templateUrl: 'partials/nota.html',
        controller: 'cabecalhoNotaController'
    });
    
    $routeProvider.when('/nota/:idCabecalhoNota', {
        templateUrl: 'partials/nota.html',
        controller: 'cabecalhoNotaController'
    });
    
    $routeProvider.when('/home', {
        templateUrl: 'partials/home.html',
        controller: 'produtoController'
    });
    
    $routeProvider.when('/login', {
    	templateUrl: 'partials/login.html',
    	controller: 'produtoController'
    });
    
    $routeProvider.otherwise({
        redirectTo: '/login'
    });
});