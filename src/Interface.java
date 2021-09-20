import java.util.Scanner;
public class Interface {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Produto produto =  new Produto();
		
		int codigo;
		String descricao;
		float precoCusto;
		
		System.out.println("Descrição : ");
		produto.setDescricao(ler.nextLine());
		System.out.println("Quantidade produzida: ");
		produto.producao(ler.nextInt());
		System.out.println("Quantidade saída: ");
		produto.saida(ler.nextInt());
		
		
		System.out.println(produto.producao());
		System.out.println(produto.saida());
		
		
	}

}
