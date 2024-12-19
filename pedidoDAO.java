package DAO;

import entidade.Pedido;
import util.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class pedidoDAO {

    public Pedido createPedido(Pedido pedido){
        try{
            Connection conn = connection.openConnection();

            String sql = "INSERT INTO pedido (dataentrega, datapedido, cliente, produto)" +
                    "VALUES (?,?,?,?)";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, pedido.getDataentrega());
            statement.setString(2, pedido.getDatapedido());
            statement.setString(3, String.valueOf(pedido.getCliente()));
            statement.setString(4, String.valueOf(pedido.getProduto()));
            statement.executeUpdate();

        }catch (SQLException e){
            System.out.println("Problemas ao salvar Pedido " + e.getMessage());
        }
        return pedido;
    }
}
