import java.util.Scanner;

public class AppImovel {

	static Imovel imovel;
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Id..............: ");
		int id = ler.nextInt();
		ler.nextLine();
		System.out.println("Tipo [C/I/R]....: ");
		String tipo = ler.nextLine();
		tipo = tipo.toUpperCase();
		System.out.println("Leitura Inicial: ");
		int leitura = ler.nextInt();
		
		// Declara e instancia o objeto
		imovel = new Imovel(id, tipo, leitura);
		
		for (int i = 0; i < 5; i++) {
		System.out.printf("\n\nLeitura %d: ",(i+1));
		leitura = ler.nextInt();
		imovel.registrarLeitura(leitura);
		imovel.calcularConta();
		mostrarConta();
		}
		
		ler.close();
	}
	public static void mostrarConta() {
		System.out.println("\nConta");
		System.out.printf("\nId : %d", imovel.getId());
		System.out.printf("\nTipo : %s", imovel.getTipo());
		System.out.printf("\nLeitura Anterior : %d", imovel.getLeituraAnterior());
		System.out.printf("\nLeitura Atual : %d", imovel.getLeituraAtual());
		System.out.printf("\nConsumo: %d", imovel.getConsumo());
		System.out.printf("\nValor da Conta : R$ %.2f", imovel.getValorConta());
		
		
	}
	
	

 }
