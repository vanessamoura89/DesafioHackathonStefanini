import { inherit } from "@uirouter/core";

export default class CodigoController {

    constructor(CodigoService) {
        var vm = this;
        this.name = 'Codigo';

        init();

        function init() {
            donoService.getDonos().then(function abc(resp) {
                vm.codigo = resp.data;
            });
        }
    }

}
CodigoController.$inject = ['codigoService'];