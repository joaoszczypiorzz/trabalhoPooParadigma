import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Date dataPadrao = new Date();

        List<Funcionario> funcionarios = new ArrayList<>(Arrays.asList(
                new Funcionario("João Silva", "111.111.111-11", 30, dataPadrao, "F001", 2500.00, dataPadrao),
                new Funcionario("Maria Souza", "222.222.222-22", 28, dataPadrao, "F002", 2800.00, dataPadrao),
                new Funcionario("Carlos Dias", "333.333.333-33", 35, dataPadrao, "F003", 3200.00, dataPadrao),
                new Funcionario("Ana Costa", "444.444.444-44", 25, dataPadrao, "F004", 2100.00, dataPadrao),
                new Funcionario("Pedro Santos", "555.555.555-55", 40, dataPadrao, "F005", 4000.00, dataPadrao)
        ));

        List<Cliente> clientes = new ArrayList<>(Arrays.asList(
                new Cliente("Lucas Almeida", "666.666.666-66", 22, dataPadrao, "Cartão de Crédito", true, false),
                new Cliente("Fernanda Lima", "777.777.777-77", 34, dataPadrao, "Dinheiro", false, true),
                new Cliente("Roberto Justo", "888.888.888-88", 45, dataPadrao, "PIX", true, true),
                new Cliente("Camila Rocha", "999.999.999-99", 29, dataPadrao, "Cartão de Débito", false, false),
                new Cliente("Bruno Mendes", "000.000.000-00", 38, dataPadrao, "PIX", true, false)
        ));

        Restaurante restaurante = new Restaurante("Rua Central, 123", funcionarios, "Restaurante Sabor & Arte");

        System.out.println("\n=== Listando Todos os Funcionários ===");
        restaurante.listarFuncionarios(funcionarios);

        System.out.println("\n=== Listando Clientes Fidelizados ===");
        restaurante.listarClientesFidelizados(clientes);

        System.out.println("=== Testando Adição de Funcionário ===");
        Funcionario novoFuncionario = new Funcionario("Tiago Mendes", "123.456.789-00", 20, dataPadrao, "F006", 1500.0, dataPadrao);
        restaurante.addFuncionario(novoFuncionario, funcionarios);
    }
}