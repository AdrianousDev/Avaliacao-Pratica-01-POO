
import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private String dataEntrada;
    private String dataSaida;
    private List<Hospede> hospedes;
    private Veiculo veiculo;

    public Reserva(String dataEntrada, String dataSaida) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.hospedes = new ArrayList<>();
    }

    public String getDataEntrada() {
    	return this.dataEntrada;
    }
    
    public String getDataSaida() {
    	return this.dataSaida;
    }
    
    public List<Hospede> getHospedes() {
    	return this.hospedes;
    }
    
    public void checkin(List<Hospede> hospedes) {
        this.hospedes = hospedes;
    }

    public void checkout() {
        System.out.println("Checkout realizado");
    }

    public void cancelar() {
        System.out.println("Reserva cancelada");
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
}
