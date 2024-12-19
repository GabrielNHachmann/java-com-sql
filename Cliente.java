package entidade;

public class Cliente {

    private int idcliente;
    private String nome;
    private String cep;
    private String phone;
    private String email;

    public Cliente() {
    }

    public Cliente(String cep, String email, int idcliente, String nome, String phone) {
        this.cep = cep;
        this.email = email;
        this.idcliente = idcliente;
        this.nome = nome;
        this.phone = phone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
