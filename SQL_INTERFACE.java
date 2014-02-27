/********************************************************************
*********************************************************************
*********************************************************************
*********************************************************************
**************************CLASSE NÃO TESTADA*************************
**************************NON TESTED CLASS***************************
*********************************************************************
*********************************************************************
*********************************************************************
********************************************************************/

adolfo@utfpr.edu.br

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

public class SQL_INTERFACE extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new FetchSQL().execute();
    }
    private class FetchSQL extends AsyncTask<Void,Void,String> {
        @Override
        protected String doInBackground() {
            String retval = "";
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                //retval = e.toString();
            }
            String url = "jdbc:postgresql://localhost/dbname?user=user&password=1234";
            Connection conn;
            try {
                DriverManager.setLoginTimeout(12);
                conn = DriverManager.getConnection(url);
                /*Statement st = conn.createStatement(); //Apenas para não perder o código teste
							 //Comentei o código
                String sql;
                sql = "SELECT 1";
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()) {
                    retval = rs.getString(1);
                }
                rs.close();
                st.close();*/
		Statement st = conn.createStatement();
		String S1;
		S1 = "SELECT * FROM " + TABELA +" where " + CONDICAO;
		ResultSet rs = st.executeQuery(S1);
		rs.close();
		st.close();

                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                retval = e.toString();
            }
            return retval;
        }


	public String lerTabela(string TABELA, string CONDICAO)
	{
	    String url = "jdbc:postgresql://localhost/dbname?user=user&password=1234";
            Connection conn;
		
            try {
	    
                DriverManager.setLoginTimeout(6);
                conn = DriverManager.getConnection(url);
                
		Statement st = conn.createStatement();
		String S1;
		S1 = "SELECT * FROM " + TABELA +" where " + CONDICAO;
		ResultSet rs = st.executeQuery(S1);
		rs.close();
		st.close();

                conn.close();

		return S1;
            } catch (SQLException e) {
                e.printStackTrace();
                retval = e.toString();
		return "error";
            }

	}

	

	public String CadastrarRestaurante(int restaurante, int prato, double preco)
	{
		
             String url = "jdbc:postgresql://localhost/dbname?user=user&password=1234";
            Connection conn;
		
            try {
	    
                DriverManager.setLoginTimeout(6);
                conn = DriverManager.getConnection(url);
                
		Statement st = conn.createStatement();
		String S1;
		S1 = "INSERT INTO RESTAURANTE VALUES("+id_restaurante+","+ id_prato+","+ id_preco")";
		ResultSet rs = st.executeQuery(S1);
		rs.close();
		st.close();

                conn.close();

		return S1;
            } catch (SQLException e) {
                e.printStackTrace();
                retval = e.toString();
		return "error";
            }

	}

	public String CadastrarContem(int id_prato, String nome_dieta)
	{
		
             String url = "jdbc:postgresql://localhost/dbname?user=user&password=1234";
            Connection conn;
		
            try {
	    
                DriverManager.setLoginTimeout(6);
                conn = DriverManager.getConnection(url);
                
		Statement st = conn.createStatement();
		String S1;
		S1 = "INSERT INTO CONTEM VALUES("+id_prato+","+ nome_dieta")";
		ResultSet rs = st.executeQuery(S1);
		rs.close();
		st.close();

                conn.close();

		return S1;
            } catch (SQLException e) {
                e.printStackTrace();
                retval = e.toString();
		return "error";
            }

	}


	public String CadastroDietas(int id_nome, int calorias_Dia)
	{
		
             String url = "jdbc:postgresql://localhost/dbname?user=user&password=1234";
            Connection conn;
		
            try {
	    
                DriverManager.setLoginTimeout(6);
                conn = DriverManager.getConnection(url);
                
		Statement st = conn.createStatement();
		String S1;
		S1 = "INSERT INTO DIETA VALUES("+id_nome+","+ calorias_Dia")";
		ResultSet rs = st.executeQuery(S1);
		rs.close();
		st.close();

                conn.close();

		return S1;
            } catch (SQLException e) {
                e.printStackTrace();
                retval = e.toString();
		return "error";
            }

	}


	public String CadastrarPrato(int id, String nome, int calorias)
	{
		
             String url = "jdbc:postgresql://localhost/dbname?user=user&password=1234";
            Connection conn;
		
            try {
	    
                DriverManager.setLoginTimeout(6);
                conn = DriverManager.getConnection(url);
                
		Statement st = conn.createStatement();
		String S1;
		S1 = "INSERT INTO PRATOS VALUES("+id+","+ nome+","+ calorias")";
		ResultSet rs = st.executeQuery(S1);
		rs.close();
		st.close();

                conn.close();

		return S1;
            } catch (SQLException e) {
                e.printStackTrace();
                retval = e.toString();
		return "error";
            }

	}

	public String CadastrarRestaurante(int id,String String nome,String endereco,String estilo,String email,String telefone,String cidade,String estado,String tipo)
	{
		
             String url = "jdbc:postgresql://localhost/dbname?user=user&password=1234";
            Connection conn;
		
            try {
	    
                DriverManager.setLoginTimeout(6);
                conn = DriverManager.getConnection(url);
                
		Statement st = conn.createStatement();
		String S1;
		S1 = "INSERT INTO PRATOS VALUES("+id+","+ nome+","+ endereco+","+estilo+","+email+","+telefone+","+cidade+","+estado+","+tipo+")";
		ResultSet rs = st.executeQuery(S1);
		rs.close();
		st.close();

                conn.close();

		return S1;
            } catch (SQLException e) {
                e.printStackTrace();
                retval = e.toString();
		return "error";
            }

	}


	public String CadastrarUsuario(int id, String tipo, String email, String senha)
	{
		
             String url = "jdbc:postgresql://localhost/dbname?user=user&password=1234";
            Connection conn;
		
            try {
	    
                DriverManager.setLoginTimeout(6);
                conn = DriverManager.getConnection(url);
                
		Statement st = conn.createStatement();
		String S1;
		S1 = "INSERT INTO USUARIO VALUES("+id+","+ tipo+","+ email+","+senha+")";
		ResultSet rs = st.executeQuery(S1);
		rs.close();
		st.close();

                conn.close();

		return S1;
            } catch (SQLException e) {
                e.printStackTrace();
                retval = e.toString();
		return "error";
            }

	}


        @Override
        protected void onPostExecute(String value) {
            resultArea.setText(value);
        }
    }
}
