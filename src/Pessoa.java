import java.util.Date;

public abstract class Pessoa  {

    private String nome;
    private String cpf;
    private Integer idade;
    private Date dataNascimento;

    public Pessoa(String nome, String cpf, Integer idade, Date dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
    }

    //#region Getters e Setters da Classe(Encapsulamento)
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
    //#endregion
}
