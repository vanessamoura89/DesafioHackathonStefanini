import angular from 'angular';

class CodigoService {

    constructor($http) {
        this.$http = $http;
        //const apiBase = "http://localhost:9090/projeto/api";
        const apiBase = "http://localhost:8080";
        this.path = apiBase + "/codigo";
    }

    getCodigo() {
        return this.$http.get(this.path);
    }
}

export default angular.module('services.codigo-service', [])
    .service('codigoService', CodigoService)
    .name;