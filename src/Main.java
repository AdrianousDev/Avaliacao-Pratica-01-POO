import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		// CRIACAO E TESTE DE HOTEL
		System.out.print("Nome do hotel: ");
		String nomeHotel = sc.nextLine();
		Hotel hotelTransilvanica = new Hotel(nomeHotel);
		System.out.println("Hotel: " + hotelTransilvanica.getNome());
		
		
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
		System.out.println("Nome: " + BrunoFuncionario.getNome());
		System.out.println("Cargo: " + BrunoFuncionario.getCargo().getNome());
		System.out.println("Antigo salario: " + BrunoFuncionario.getSalario());
		
		System.out.print("Novo salário: ");
		double novoSalario = sc.nextDouble();
		sc.nextLine();
		
		BrunoFuncionario.mudarSalario(novoSalario);
		System.out.println("Novo salario: " + BrunoFuncionario.getSalario());
		
		
		// CRIACAO E TESTE DE HOSPEDES
		System.out.println("\n===== Hospedes =====");
		
		System.out.print("Nome do hóspede: ");
		String nomeHospede = sc.nextLine();
		
		System.out.print("Endereço: ");
		String enderecoHospede = sc.nextLine();
		
		System.out.print("Documento: ");
		String documentoHospede = sc.nextLine();
		
		Hospede BrunoHospede = new Hospede(nomeHospede, enderecoHospede, documentoHospede);
		
		System.out.println("Nome: " + BrunoHospede.getNome());
		System.out.println("Endereço: " + BrunoHospede.getEndereco());
		System.out.println("Documento: " + BrunoHospede.getDocumento());
		
		
		// CRIACAO E TESTE DE VEICULO
		System.out.println("\n===== Veiculo =====");
		
		System.out.print("Placa: ");
		String placa = sc.nextLine();
		
		System.out.print("Modelo: ");
		String modelo = sc.nextLine();
		
		Veiculo carro = new Veiculo(placa, modelo);
		
		System.out.println("Placa: " + carro.getPlaca());
		System.out.println("Modelo: " + carro.getModelo());
		
		
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
		
		System.out.println("Data entrada: " + reserva.getDataEntrada());
		System.out.println("Data saida: " + reserva.getDataSaida());
		System.out.println("Qtd hospedes: " + reserva.getHospedes().size());
		System.out.println("Veiculo da reserva: " + reserva.getVeiculo().getModelo());
		
		reserva.checkout();
		reserva.cancelar();
		
		
		// CRIACAO E TESTE DE QUARTO
		System.out.println("\n===== Quarto =====");
		
		System.out.print("Número do quarto: ");
		int numero = sc.nextInt();
		
		System.out.print("Andar: ");
		int andar = sc.nextInt();
		
		Quarto quarto = new Quarto(numero, andar);
		
		quarto.adicionarReserva(reserva);
		
		System.out.println("Numero: " + quarto.getNumero());
		System.out.println("Andar: " + quarto.getAndar());
		System.out.println("Qtd reservas: " + quarto.getReservas().size());
		
		sc.close();
	}
}