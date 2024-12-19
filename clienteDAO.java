package DAO;

import entidade.Cliente;
import util.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class clienteDAO {

    public Cliente createCliente(Cliente cliente){
        try{
            //abrindo conexao com o banco
            Connection conn = connection.openConnection();

            //query a ser executada
            String sql = "insert into cliente (nome, cep, phone, email)" + "values (?,?,?,?)";

            //statement = reponsavel por executar a query
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getCep());
            statement.setString(3, cliente.getPhone());
            statement.setString(4, cliente.getEmail());

            statement.executeUpdate();

        }catch (SQLException e){
            System.out.println("Problemas ao salvar" + e.getMessage());
        }
        return cliente;
    }
}
