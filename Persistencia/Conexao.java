package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import Entidade.Codigo;
import Entidade.Teste;




public class Conexao {
    String urldobanco="jdbc:hsqldb:file:BancoMemoria/";
    String nomedobanco="BANCOCALCULO";
   
    PreparedStatement pstm = null;
    
    public Connection conectar(){
        
        Connection conexao=null;
        
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            conexao=DriverManager.getConnection(urldobanco+nomedobanco);
            System.out.println("Conectado!!!!!");
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("Sr.usuário não foi possivel instanciar  o seu driver, acesse outro driver ");
        }
    
    return conexao;
}
    public void fecharconexaocomoBD(){
        try {
            conectar().createStatement().executeUpdate("SHUTDOWN");
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("Nao foi possivel encerrar a conexão com o banco de dados");
        }
    }
	public void salvar(CodigoDAO<Codigo> entidade) {
		// TODO Auto-generated method stub
		
	}
	public Codigo buscarPorID(String Codigo_id) {
		// TODO Auto-generated method stub
		return null;
	}
	public void update(CodigoDAO<Codigo> entidade) {
		// TODO Auto-generated method stub
		
	}
	public List<Teste> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
		
	public void delete(Codigo entidade) {
		// TODO Auto-generated method stub
		
	}

		
	}
    
