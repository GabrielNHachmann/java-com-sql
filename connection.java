package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {

    private static final String URL = "jdbc:mysql://localhost:3306/upfit";//localhost
    private static final String USER = "root";//usuario
    private static final String PASSWORD = "g19500202";//senha

    public static Connection connection = null;

    public static Connection openConnection(){//metodo para abrir conexao com o banco
        try{
            connection = DriverManager.getConnection(URL, USER, PASSWORD); //mensagem de sucesso
            System.out.println("conectado com sucesso");

        } catch (SQLException e){
            System.out.println("Problema ao conectar no banco" + e.getMessage());//mensagem de erro
        }
        return connection;
    }

    public static void closeConnection() {//metodo para fechar conexao
        try {
            if (!connection.isClosed()) {
                connection.close();
                System.out.println("Conexao encerrada com sucesso");//mensagem de sucesso
            }
        } catch (SQLException e) {
            System.out.println("Problema ao fechar conexao" + e.getMessage());//mensagem de erro
        }

    }
}
