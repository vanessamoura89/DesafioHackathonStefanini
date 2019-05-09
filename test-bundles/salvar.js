    
import angular from 'angular';
import uirouter from 'angular-ui-router';

import CodigoController from './codigo.controller';

import CodigoService from '../../servicos/salvar.service';

export default angular.module('myApp.codigo', [uirouter, salvarService])
  .controller('CodigoController', CodigoController)
  .name;