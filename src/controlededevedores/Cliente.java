package controlededevedores;

public class Cliente {

    private String nome;
    private String telefone;
    private String observacao;
    private String codigo;
    private String endereco;
    private boolean cpf;
            
    public Cliente(){
        
    }
    
    public Cliente(String linhaCsv) {
        String[] dados = linhaCsv.replace(";", ";¨").split(";");
        for (int i = 0; i < dados.length; i++) {
            dados[i] = dados[i].replace("¨", "");
        }
        this.nome = dados[0];
        this.codigo = (dados[1]);
        this.telefone = dados[2];
        this.endereco = dados[3];
        this.observacao = dados[4];
        this.cpf = Boolean.parseBoolean(dados[5]);
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (nome.replace(" ", "").length() > 0) {
            this.nome = nome;
            return true;
        }
        return false;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean setCodigo(String codigo) {
        if (codigo.replace(" ", "").length() > 0) {
            this.codigo = codigo;
            return true;
        }
        return false;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getClinte() {
        StringBuilder sb = new StringBuilder();
        //sb.append(this.id).append(";");
        sb.append(this.nome).append(";");
        sb.append(this.codigo).append(";");
        sb.append(this.telefone).append(";");
        sb.append(this.endereco).append(";");
        sb.append(this.observacao).append(";");
        sb.append(this.cpf).append(";");
        sb.append("\n");
        return sb.toString();
    }

    void setCpf(boolean cpf) {
        this.cpf = cpf;
    }

    public boolean isCpf() {
        return cpf;
    }
    
    
}
