import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println();
		
		// CRIACAO E TESTE DE HOTEL
		Hotel hotelTransilvanica = new Hotel("Hotel Transilvânia");
		System.out.println("Hotel: " + hotelTransilvanica.getNome());
		
		
		// CRIACAO DE CARGO E FUNCIONARIO
		Cargo desenrolador = new Cargo("O cara que desenrola as coisa, amigo do drácula.");
		Funcionario BrunoFuncionario = new Funcionario("Bruno J. Adriano", 20000.0, desenrolador);
		
		
		// TESTE DE FUNCIONARIOS
		System.out.println("===== Funcionarios =====");
		System.out.println("Nome: " + BrunoFuncionario.getNome());
		System.out.println("Cargo: " + BrunoFuncionario.getCargo().getNome());
		System.out.println("Antigo salario: " + BrunoFuncionario.getSalario());
		BrunoFuncionario.mudarSalario(30000.0);
		System.out.println("Novo salario: " + BrunoFuncionario.getSalario());
		
		
		// CRIACAO E TESTE DE HOSPEDES
		System.out.println("\n===== Hospedes =====");
		Hospede BrunoHospede = new Hospede("Bruno J. Adriano só que hospede", "Rua ali perto", "000.000.000-00");
		System.out.println("Nome: " + BrunoHospede.getNome());
		System.out.println("Endereço: " + BrunoHospede.getEndereco());
		System.out.println("Documento: " + BrunoHospede.getDocumento());
		
		
		// CRIACAO E TESTE DE VEICULO
		System.out.println("\n===== Veiculo =====");
		Veiculo carro = new Veiculo("ABC-1234", "Fuscão Preto");
		System.out.println("Placa: " + carro.getPlaca());
		System.out.println("Modelo: " + carro.getModelo());
		
		
		// CRIACAO E TESTE DE RESERVA
		System.out.println("\n===== Reserva =====");
		Reserva reserva = new Reserva("01/04/2026", "05/04/2026");
		
		List<Hospede> hospedes = new ArrayList<>();
		hospedes.add(BrunoHospede);
		
		reserva.checkin(hospedes);
		reserva.setVeiculo(carro);
		
		System.out.println("Data entrada: " + reserva.getDataEntrada());
		System.out.println("Data saida: " + reserva.getDataSaida());
		System.out.println("Qtd hospedes: " + reserva.getHospedes().size());
		System.out.println("Veiculo da reserva: " + reserva.getVeiculo().getModelo());
		
		reserva.checkout();
		reserva.cancelar();
		
		
		// CRIACAO E TESTE DE QUARTO
		System.out.println("\n===== Quarto =====");
		Quarto quarto007 = new Quarto(007, 7);
		
		quarto007.adicionarReserva(reserva);
		
		System.out.println("Numero: " + quarto007.getNumero());
		System.out.println("Andar: " + quarto007.getAndar());
		System.out.println("Qtd reservas: " + quarto007.getReservas().size());
	}
}