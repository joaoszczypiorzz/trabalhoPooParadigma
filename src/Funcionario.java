import java.util.Date;

public class Funcionario extends Pessoa{

    private String identificacao;
    private Double salario;
    private Date dataAdmissao;

    public Funcionario(String nome, String cpf, Integer idade, Date dataNascimento, String identificacao, Double salario, Date dataAdmissao) {
        super(nome, cpf, idade, dataNascimento);
        this.identificacao = identificacao;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }



    //#region Getter e Setters da Classe(Encapsulamento)
    public String getIdentificacao() {
        return identificacao;
    }
    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Date getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "identificacao='" + identificacao + '\'' +
                ", salario=" + salario +
                ", dataAdmissao=" + dataAdmissao +
                '}';
    }
    //#endregion
}
