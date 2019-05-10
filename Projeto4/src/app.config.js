routing.$inject = ['$stateProvider', '$urlRouterProvider'];

export default function routing($stateProvider, $urlRouterProvider) {
    let homeState = {
        name: 'home',
        url: '/home',
        templateUrl: './modulos/home/home.view.html',
        controller: 'HomeController',
        controllerAs: 'vm'
    }
    $stateProvider.state(homeState);

    let donoState = {
        name: 'codigo',
        url: '/codigo',
        templateUrl: './modulos/codigo/codigo.view.html',
        controller: 'CodigoController',
        controllerAs: 'vm'
    }
    $stateProvider.state(codigoState);

    $urlRouterProvider.otherwise('/home')
}