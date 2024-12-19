package entidade;

import java.util.Date;

public class Pedido {

    private int idpedido;
    private String dataentrega;
    private String datapedido;
    private int cliente;
    private int produto;

    public Pedido() {
    }

    public Pedido(int cliente, String dataentrega, String datapedido, int idpedido, int produto) {
        this.cliente = cliente;
        this.dataentrega = dataentrega;
        this.datapedido = datapedido;
        this.idpedido = idpedido;
        this.produto = produto;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public String getDataentrega() {
        return dataentrega;
    }

    public void setDataentrega(String dataentrega) {
        this.dataentrega = dataentrega;
    }

    public String getDatapedido() {
        return datapedido;
    }

    public void setDatapedido(String datapedido) {
        this.datapedido = datapedido;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }
}
