
public class Imovel {
	
	private int  id; 
	private String tipo;
	private int leituraAnterior;
	private int leituraAtual;
	private int consumo;
	private double valorConta;
	
	public Imovel (int id, String tipo, int leitura) {
		this.id = id;
		this.tipo = tipo;
		this.leituraAnterior = leitura;
		this.leituraAtual = leitura;
	}

	
	public int getId() {
		return id;
	}


	public String getTipo() {
		return tipo;
	}


	public int getLeituraAnterior() {
		return leituraAnterior;
	}


	public int getLeituraAtual() {
		return leituraAtual;
	}


	public int getConsumo() {
		return consumo;
	}


	public double getValorConta() {
		return valorConta;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public void registrarLeitura(int leitura) {
	this.leituraAnterior = this.leituraAtual;
	this.leituraAtual = leitura;
		
		if(this.leituraAtual > this.leituraAnterior){
			this.consumo = this.leituraAtual - leituraAnterior;
		}
		else {
			this.consumo = 9999 - this.leituraAnterior + this.leituraAtual;
		}
				
	}
	
	public void calcularConta() {
		
		this.consumo = leituraAtual - leituraAnterior;
		
		if(this.tipo.equals("C") ) {
			this.valorConta = this.consumo * .7;
		}
		else if(this.tipo.equals("I")) {
			this.valorConta = this.consumo * .4;
		}
		else if(this.tipo.equals("R")){
			this.valorConta = this.consumo * .5;
		}
		
	}
	
}
