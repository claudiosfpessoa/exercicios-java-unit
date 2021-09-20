
public class Produto {
	
	private int codigo;
	private String descricao;
	private float custoProduto;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getCustoProduto() {
		return custoProduto;
	}

	public void setCustoProduto(float custoProduto) {
		this.custoProduto = custoProduto;
	}

	public int getEstoque() {
		return estoque;
	}
	
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	private int estoque;

	void cadastrarProduto(int codigo, String descricao,float custoProduto ) {
	
		this.codigo = codigo;
		this.descricao = descricao;
		this.custoProduto = custoProduto;
		this.estoque = 0;
	
	
	}
	
	int consultarEstoque(){
		return this.estoque;
	}
	void producao(int qtdeProduzida) {
		this.estoque = this.estoque + qtdeProduzida;
		
	}
	void saida(int qtdeSaida) {
		this.estoque = this.estoque - qtdeSaida;
		
	}

	public char[] saida() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] producao1() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] producao() {
		// TODO Auto-generated method stub
		return null;
	}
}
