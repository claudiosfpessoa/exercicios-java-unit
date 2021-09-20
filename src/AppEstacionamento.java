import java.util.Scanner;

public class AppEstacionamento {

	
		static Scanner ler = new Scanner(System.in);	
		static Estacionamento[] arrayEstac = new Estacionamento[5];
		static int contarEstac = 0;

		public static void main(String[] args) {
			int opcao = 0;

			do {
				System.out.println("\n*** Seletor de Opções ***");
				System.out.println();
				System.out.println("1 - Inserir estacionamento");
				System.out.println("2 - Consultar estacionamento");
				System.out.println("3 - Alterar situação do estacionamento");
				System.out.println("0 - Finalizar");
				
				System.out.print("\nOpção: ");
	    		opcao = ler.nextInt();

	    		switch (opcao) {
	    		case 1:
	    			inserirEstacionamento();
	    			break;
	    		case 2:
	    			consultarEstacionamento();
	    			break;
	    		case 3:
	    			alterarSituacaoEstacionamento();
	    			break;
	    		case 0:
					System.out.println("\n--- PROGRAMA FINALIZADO  ---");
					return;
	    		default:
					System.out.println("\n--- Opção incorreta  ---");
					break;
	    			
	    		}
			} while (true);

		
		}	
		
		public static int pesquisarEstacionamento (int codigo) {
			int posicao = -1;
			for (int i = 0; i < arrayEstac.length; i++) {
				if (arrayEstac[i] != null && arrayEstac[i].getCodigo() == codigo) {
					posicao = i;
					break;
				}
			}
			return posicao;
		}	
		
		public static void inserirEstacionamento() {
			System.out.println("\n\n*** Inserir Estacionamento ***\n");

			while (true) {
				if (contarEstac >= arrayEstac.length) {
					System.out.println("\n\n--- Repositório Cheio ---\n");
					return;
				}
				System.out.print("Código ou [0] para encerrar inserção: ");
				int codigo = ler.nextInt();
				if (codigo == 0) {
					break;
				}
				
				int codigoEncontrado = pesquisarEstacionamento(codigo);
				if (codigoEncontrado != -1) {
					System.out.println("\n\n--- Estacionamento já cadastrado ---\n");
					continue;
				}
				
				ler.nextLine();
				System.out.print("Nome........................: ");
				String nome = ler.nextLine();
				System.out.print("Cidade......................: ");
				String cidade = ler.nextLine();
				
				System.out.print("Quant. de vagas.............: ");
				int qtdeVagas = ler.nextInt();
				System.out.print("Franquia inicial (horas)....: ");
				int horasFranquiaInicial = ler.nextInt();
				
				System.out.print("Valor da franquia inicial R$:");
				double valorFranquiaInicial = ler.nextDouble();
				
				System.out.print("Valor por hora adicional  R$:");
				double valorAdicionalHora = ler.nextDouble();
				
				arrayEstac[contarEstac] = new Estacionamento(codigo, nome, cidade, qtdeVagas,
						      horasFranquiaInicial, valorFranquiaInicial, valorAdicionalHora);
				contarEstac++;
				System.out.println("\n\n--- Estacionamento Inserido ---\n");
			}
		}

		public static void consultarEstacionamento() {
			System.out.println("\n\n*** Consultar Estacionamento ***\n");
			if (contarEstac == 0) {
				System.out.println("\n\n--- Repositório Vazio ---\n");
				return;
			}
			
			while (true) {
				System.out.print("Código ou [0] para encerrar inserção: ");
				int codigo = ler.nextInt();
				if (codigo == 0) {
					break;
				}
				
				int codigoEncontrado = pesquisarEstacionamento(codigo);
				if (codigoEncontrado == -1) {
					System.out.println("\n\n--- Estacionamento não cadastrado ---\n");
					continue;
				}
				
			    System.out.println(arrayEstac[codigoEncontrado].toString());
			}
			
		}
		
		public static void alterarSituacaoEstacionamento() {
			System.out.println("\n\n*** Alterar Situação ***\n");
			if (contarEstac == 0) {
				System.out.println("\n\n--- Repositório Vazio ---\n");
				return;
			}
			
			int codigo = 0;
			while (true) {
				System.out.print("Código ou [0] para encerrar alteração: ");
				codigo = ler.nextInt();
				
				if (codigo == 0) {
					return;
				}
				
				int codigoEncontrado = pesquisarEstacionamento(codigo);
				if (codigoEncontrado == -1) {
					System.out.println("\n------ Código não cadastrado ------\n");
					continue;
				}

				System.out.println(arrayEstac[codigoEncontrado].toString());
				
				ler.nextLine();
				System.out.println("Confirma alteração da situação? [S/N]");
				char continuar = ler.nextLine().charAt(0);
				continuar = Character.toUpperCase(continuar);
				
				if (continuar == 'S') {
					if (arrayEstac[codigoEncontrado].getSituacao().equals("Ativado")) {
						arrayEstac[codigoEncontrado].desativar();
						System.out.println("\n------ Estacionamento desativado ------\n");
					}
					else if (arrayEstac[codigoEncontrado].getSituacao().equals("Desativado")) {
						arrayEstac[codigoEncontrado].ativar();
						System.out.println("\n------ Estacionamento ativado ------\n");					
					}
				}
			}
			
			
		}
	

	}


