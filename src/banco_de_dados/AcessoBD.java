
package banco_de_dados;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mayke
 */
public class AcessoBD {
    
    private String servidor;
    private String banco;
    private String usuario;
    private String senha;
    private Connection conexao;
    
    public AcessoBD(){
        this.servidor = "localhost";
        this.banco = "grupo_nassau";
        this.usuario = "root";
        this.senha = "12091996";
    }
    public boolean conectar(){
        try{
            this.conexao = (Connection) DriverManager.getConnection("jdbc:mysql://"+this.servidor+"/"+this.banco,this.usuario,this.senha);
            return true; //coneta com o banco
        }//se não conseguir, gera um erro de exceção
        catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }//retorna ao atributo conexao
    public Connection getConnection(){
        return conexao;
    }
}
