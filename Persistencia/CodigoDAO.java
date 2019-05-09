package Persistencia;

import Entidade.Codigo;
import Entidade.Teste;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CodigoDAO<Codigo> extends Conexao implements CodigoDAO {

	@Override
    public void salvar(CodigoDAO entidade) {
        
        
     String sqlsalvar ="INSERT INTO ( "
             + "CODIGO_ID,"
             + "NOME)"
             + "SEXO)"
             + "VALUES (?,?)";
        try {
            pstm = conectar ().prepareStatement(sqlsalvar);
            pstm.setString(1, entidade.getCodigo());
            pstm.setString(2, entidade.getTeste ());
            pstm.execute();
            pstm.close();
          
          
            fecharconexaocomoBD();
            
        } catch (SQLException ex) {
            Logger.getLogger(CodigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    private String getCodigo() {
		// TODO Auto-generated method stub
		return null;
	}


	private String getTeste() {
		// TODO Auto-generated method stub
		return null;
	}


	private String getCogido_id() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
    public Entidade.Codigo buscarPorID(String Codigo_id) {
        return null;
        
    }

    @Override
    public void update(CodigoDAO entidade) {
        
    }

    @Override
    public void delete(Entidade.Codigo entidade) {
       
    }

    @Override
    public List<Teste> listarTodos() {
        return null;
       
    }
    
}