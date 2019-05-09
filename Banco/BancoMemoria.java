package Banco ;

import Entidade.Codigo;
import Persistencia.CodigoDAO;
import Persistencia.Conexao;


@SuppressWarnings("unused")
public class BancoMemoria {

    
    public static void main(String[] args) {

Codigo codigo = new Codigo();
codigo.setCodigo_id("N2334");
codigo.setNome("Mariane");
codigo.setSexo("F");



     
CodigoDAO daocodigoDAO = new CodigoDAO();

    }
    
    
}

