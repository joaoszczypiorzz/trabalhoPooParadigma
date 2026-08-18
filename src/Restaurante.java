import java.util.List;

public class Restaurante implements Administrativo{
    private String endereco;
    private List<Funcionario> funcionarios;
    private String nome;

    @Override
    public void listarFuncionarios(List<Funcionario> funcionarios) {
        if(funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário encontrado");
        }

        for(Funcionario func : funcionarios) {
            System.out.println(func);
        }
    }

    @Override
    public void listarClientesFidelizados(List<Cliente> clientes) {
        if(clientes.isEmpty()) {
            System.out.println("Nenhum cliente encontrado");
        }

        // Listando apenas clientes fidelizados
        for(Cliente cli : clientes) {
            if(cli.getFidelizado()) {
                System.out.println(cli);
            }
        }
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
