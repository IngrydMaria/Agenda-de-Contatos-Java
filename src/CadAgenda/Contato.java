package CadAgenda;

public class Contato {
    private String codigo;
    private String nome;
    private String endereco;
    private String fone;
    private String celular;
    private String sexo;
    private String obs;
    private String nacionalidade;
    private String dataNascimento;
    private String cpf;
    private String email;
    private String numeroResidencial;
    private String cep;
    private String complementoEndereco;

    public Contato (String codigo, String nome, String endereco, String fone, String celular, String sexo, String obs, String nacionalidade, String dataNascimento, String cpf,String email, String numeroResidencial, String cep, String complementoEndereco ){
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.fone = fone;
        this.celular = celular;
        this.sexo = sexo;
        this.obs = obs;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.email = email;
        this.numeroResidencial = numeroResidencial;
        this.cep = cep;
        this.complementoEndereco = complementoEndereco;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public String getNome(){
        return this.nome;
    }
    public String getEndereco(){
        return  this.endereco;
    }
    public String getFone(){
        return this.fone;
    }
    public String getCelular(){
        return  this.celular;
    }
    public String getSexo(){
        return this.sexo;
    }
    public String getObs(){
        return  this.obs;
    }
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public String getDataNascimento(){
        return this.dataNascimento;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getEmail(){
        return this.email;
    }
    public String getCep(){
        return this.cep;
    }
    public String getNumeroResidencial(){
        return this.numeroResidencial;
    }
    public String getComplementoEndereco(){
        return  this.complementoEndereco;
    }
}
