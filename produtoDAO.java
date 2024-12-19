package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entidade.Produto;
import util.connection;

public class produtoDAO {

    public Produto createProduto(Produto produto){
        try{
            //abrindo conexao com o banco
            Connection conn = connection.openConnection();

            //query a ser executada
            String sql = "INSERT INTO produto (status, nome, tipo, preço, descriçao, avaliaçao)" + "VALUES (?,?,?,?,?,?)";

            //statement = responsavel por executar a query
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, String.valueOf(produto.getStatus()));
            statement.setString(2, produto.getNome());
            statement.setString(3, produto.getTipo());
            statement.setString(4, String.valueOf(produto.getPreço()));
            statement.setString(5, produto.getDescriçao());
            statement.setString(6, String.valueOf(produto.getAvaliaçao()));

            statement.executeUpdate();

        }catch (SQLException e){
            System.out.println("Problemas ao salvar o produto" + e.getMessage());
        }
        return produto;
    }
}
