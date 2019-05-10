import angular from 'angular';
import uirouter from 'angular-ui-router';

import CodigoController from './codigo.controller';

import CodigoService from '../../servicos/codigo.service';

export default angular.module('myApp.codigo', [uirouter, codigoService])
    .controller('CodigoController', CodigoController)
    .name;