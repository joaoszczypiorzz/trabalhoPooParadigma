import java.util.List;

public interface Administrativo {

     String listarFuncionarios(List<Funcionario> funcionarios);
     String listarClientesFidelizados(List<Cliente> clientes);
     void addFuncionario(Funcionario funcionario, List<Funcionario> listFuncionarios);
}
