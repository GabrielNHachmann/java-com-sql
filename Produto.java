package entidade;

import java.util.Date;

public class Produto {

    private int idproduto;
    private int status;
    private String nome;
    private String tipo;
    private double preço;
    private String descriçao;
    private int avaliaçao;

    public Produto() {
    }

    public Produto(int avaliaçao, String descriçao, int idproduto, String nome, double preço, int status, String tipo) {
        this.avaliaçao = avaliaçao;
        this.descriçao = descriçao;
        this.idproduto = idproduto;
        this.nome = nome;
        this.preço = preço;
        this.status = status;
        this.tipo = tipo;
    }

    public int getAvaliaçao() {
        return avaliaçao;
    }

    public void setAvaliaçao(int avaliaçao) {
        this.avaliaçao = avaliaçao;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
