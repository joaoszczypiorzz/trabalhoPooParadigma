import java.util.List;

public class Restaurante implements Administrativo{
    private String endereco;
    private List<Funcionario> funcionarios;
    private String nome;

    @Override
    public String listarFuncionarios(List<Funcionario> funcionarios) {
        return "";
    }

    @Override
    public String listarClientesFidelizados(List<Cliente> clientes) {
        return "";
    }

    @Override
    public void addFuncionario(Funcionario funcionario, List<Funcionario> listFuncionarios) {

    }

    public Restaurante(String endereco, List<Funcionario> funcionarios, String nome) {
        this.endereco = endereco;
        this.funcionarios = funcionarios;
        this.nome = nome;
    }

    //#region Getter e Setter da classe(Encapsulamento)
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //#endregion
}
