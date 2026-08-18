import java.util.List;

public interface Administrativo {

     void listarFuncionarios(List<Funcionario> funcionarios);
     void listarClientesFidelizados(List<Cliente> clientes);
     void addFuncionario(Funcionario funcionario, List<Funcionario> listFuncionarios);
}
