import DAO.clienteDAO;
import DAO.pedidoDAO;
import DAO.produtoDAO;
import entidade.Cliente;
import entidade.Pedido;
import entidade.Produto;
import util.connection;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {

        //chamando o metodo para fazer a conexao com o banco
        connection conn = new connection();

        //inserção do cliente
        /*clienteDAO clienteDao = new clienteDAO();

        Cliente cliente = new Cliente();
        cliente.setNome("gabriel");
        cliente.setCep("32323232");
        cliente.setPhone("4999923232");
        cliente.setEmail("ghachmann");

        clienteDao.createCliente(cliente);

        //insercao do produto
        produtoDAO produtoDao = new produtoDAO();

        Produto produto = new Produto();
        produto.setStatus(1);
        produto.setNome("cre");
        produto.setTipo("cre");
        produto.setPreço(5);
        produto.setDescriçao("Cre");
        produto.setAvaliaçao(10);

        produtoDao.createProduto(produto);*/

        pedidoDAO pedidoDao = new pedidoDAO();

        Pedido pedido = new Pedido();
        pedido.setDataentrega("25/12/2024");
        pedido.setDatapedido("20/12/2024");
        pedido.setCliente(1);
        pedido.setProduto(1);

        pedidoDao.createPedido(pedido);

        conn.closeConnection();
    }
}
