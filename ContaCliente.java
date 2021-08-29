public class ContaCliente {
    private String nome;
    private String cpf;
    private String profissao;

    public ContaCliente(String nome, String cpf, String profissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }
}
