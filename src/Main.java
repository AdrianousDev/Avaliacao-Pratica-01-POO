import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// CRIACAO E TESTE DE HOTEL
		System.out.print("Nome do hotel: ");
		String nomeHotel = sc.nextLine();
		Hotel hotelTeste = new Hotel(nomeHotel);
		System.out.println("Hotel: " + hotelTeste.getNome());
		Quarto quartoInicial = hotelTeste.getQuartos().get(0);
		System.out.println("Quarto inicial: ");
		quartoInicial.init();
		
		
		// CRIACAO DE CARGO E FUNCIONARIO
		System.out.print("\nNome do cargo: ");
		String nomeCargo = sc.nextLine();
		Cargo desenrolador = new Cargo(nomeCargo);
		
		System.out.print("Nome do funcionário: ");
		String nomeFuncionario = sc.nextLine();
		
		System.out.print("Salário do funcionário: ");
		double salarioFuncionario = sc.nextDouble();
		sc.nextLine();
		
		Funcionario BrunoFuncionario = new Funcionario(nomeFuncionario, salarioFuncionario, desenrolador);
		
		
		// TESTE DE FUNCIONARIOS
		System.out.println("===== Funcionarios =====");
		BrunoFuncionario.init();
		
		System.out.print("Novo salário: ");
		double novoSalario = sc.nextDouble();
		sc.nextLine();
		
		BrunoFuncionario.mudarSalario(novoSalario);
		
		
		// CRIACAO E TESTE DE HOSPEDES
		System.out.println("\n===== Hospedes =====");
		
		System.out.print("Nome do hóspede: ");
		String nomeHospede = sc.nextLine();
		
		System.out.print("Endereço: ");
		String enderecoHospede = sc.nextLine();
		
		System.out.print("Documento: ");
		String documentoHospede = sc.nextLine();
		
		Hospede BrunoHospede = new Hospede(nomeHospede, enderecoHospede, documentoHospede);
		BrunoHospede.init();
		
		
		// CRIACAO E TESTE DE VEICULO
		System.out.println("\n===== Veiculo =====");
		
		System.out.print("Placa: ");
		String placa = sc.nextLine();
		
		System.out.print("Modelo: ");
		String modelo = sc.nextLine();
		
		Veiculo carro = new Veiculo(placa, modelo);
		carro.init();
		
		
		// CRIACAO E TESTE DE RESERVA
		System.out.println("\n===== Reserva =====");
		
		System.out.print("Data de entrada: ");
		String dataEntrada = sc.nextLine();
		
		System.out.print("Data de saída: ");
		String dataSaida = sc.nextLine();
		
		Reserva reserva = new Reserva(dataEntrada, dataSaida);
		
		List<Hospede> hospedes = new ArrayList<>();
		hospedes.add(BrunoHospede);
		
		reserva.checkin(hospedes);
		reserva.setVeiculo(carro);
		
		reserva.init();
		
		reserva.checkout();
		reserva.cancelar();
		
		
		// CRIACAO E TESTE DE QUARTO
		System.out.println("\n===== Quarto =====");
		
		List<Quarto> quartos = hotelTeste.getQuartos();
		
		quartos.get(0).adicionarReserva(reserva);
		
		quartos.get(0).init();
		
		sc.close();
	}
}