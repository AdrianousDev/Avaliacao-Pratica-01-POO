
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;
    private List<Quarto> quartos;

    public Hotel(String nome) {
        this.nome = nome;
        this.quartos = new ArrayList<>();
        
        Quarto quarto = new Quarto(101, 1);
        this.adicionarQuarto(quarto);
    }

    public String getNome() {
    	return this.nome;
    }
    
    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }
}
