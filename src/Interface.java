import java.util.Scanner;
public class Interface {

	private static int codigo;
	private static String descricao;
	private static float precoCusto;

	public static void main(String[] args) {
		Produto produto =  new Produto();
		
		System.out.println("Descrição : ");
		produto.setDescricao(extracted().nextLine());
		System.out.println("Quantidade produzida: ");
		produto.producao(extracted().nextInt());
		System.out.println("Quantidade saída: ");
		produto.saida(extracted().nextInt());
		
		
		System.out.println(produto.producao());
		System.out.println(produto.saida());
		
		
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

	public static int getCodigo() {
		return codigo;
	}

	public static void setCodigo(int codigo) {
		Interface.codigo = codigo;
	}

	public static String getDescricao() {
		return descricao;
	}

	public static void setDescricao(String descricao) {
		Interface.descricao = descricao;
	}

	public static float getPrecoCusto() {
		return precoCusto;
	}

	public static void setPrecoCusto(float precoCusto) {
		Interface.precoCusto = precoCusto;
	}

}
