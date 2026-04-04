
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
        System.out.println("Novo salario: " + this.getSalario());
    }

    public double getSalario() {
        return salario;
    }

    public Cargo getCargo() {
        return cargo;
    }
    
    public void init() {
    	System.out.println("Nome: " + this.getNome());
		System.out.println("Cargo: " + this.getCargo().getNome());
		System.out.println("Antigo salario: " + this.getSalario());
    }
}
