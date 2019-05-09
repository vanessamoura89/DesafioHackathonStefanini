import { inherit } from "@uirouter/core";

export default class CodigoController {

  constructor(codigoService) {
    var vm = this;
    this.name = 'Codigo';

    init();

    function init(){
      codigoService.getCodigo().then(function abc(resp) {
        vm.codigo = resp.data;
      });
    }

   // function init(){
   //   codigoService.postCodigo().then(function abc(resp){
   //     vm.salvar = resp.data;
   //   })
   // }
  }
  
}
CodigoController.$inject = ['codigoService'];