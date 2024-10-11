import java.util.ArrayList;

class Empregado {
    private String nome;
    private String cargo;
    private double salario;

    public Empregado(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void informacoesEmpregado() {
        System.out.println("Informações do Empregado:");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$" + salario);
    }
}

class Empresa {
    private String nomeEmpresa;
    private ArrayList<Empregado> empregados;

    public Empresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.empregados = new ArrayList<>();
    }

    public void cadastrarEmpregado(String nome, String cargo, double salario) {
        Empregado empregado = new Empregado(nome, cargo, salario);
        empregados.add(empregado);
    }

    public void mostrarEmpregados() {
        System.out.println("Empregados da " + nomeEmpresa + ":");
        for (Empregado empregado : empregados) {
            empregado.informacoesEmpregado();
            System.out.println(); 
        }
    }
}
