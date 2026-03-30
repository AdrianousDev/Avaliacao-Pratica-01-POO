
public class Funcionario extends Pessoa{
    private double salario;
    private Cargo cargo;

    public Funcionario(String nome, double salario, Cargo cargo) {
        super(nome);
        this.salario = salario;
        this.cargo = cargo;
    }
    
    public void mudarSalario(double novoSalario) {
        this.salario = novoSalario;
    }

    public double getSalario() {
        return salario;
    }

    public Cargo getCargo() {
        return cargo;
    }
}
