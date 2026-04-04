
import java.util.ArrayList;
import java.util.List;

public class Quarto {
    private int numero;
    private int andar;
    private List<Reserva> reservas;

    public Quarto(int numero, int andar) {
        this.numero = numero;
        this.andar = andar;
        this.reservas = new ArrayList<>();
    }
    
    public int getNumero() {
    	return this.numero;
    }
    
    public int getAndar() {
    	return this.andar;
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
    
    public void init() {
    	System.out.println("Numero: " + this.getNumero());
		System.out.println("Andar: " + this.getAndar());
		System.out.println("Qtd reservas: " + this.getReservas().size());
    } 
}
