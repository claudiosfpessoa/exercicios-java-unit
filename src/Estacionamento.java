
public class Estacionamento {
	private int codigo;
	private String nome;
	private String cidade;
	private int qtdeVagas;
	private String situacao;
	private int horasFranquiaInicial;
	private double valorFranquiaInicial;
	private double valorAdicionalHora;

	public Estacionamento(int codigo, String nome, String cidade, int qtdeVagas, int horasFranquiaInicial,
			double valorFranquiaInicial, double valorAdicionalHora) {
		this.codigo = codigo;
		this.nome = nome;
		this.cidade = cidade;
		this.qtdeVagas = qtdeVagas;
		this.horasFranquiaInicial = horasFranquiaInicial;
		this.valorFranquiaInicial = valorFranquiaInicial;
		this.valorAdicionalHora = valorAdicionalHora;
		this.situacao = "Desativado";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getQtdeVagas() {
		return qtdeVagas;
	}

	public void setQtdeVagas(int qtdeVagas) {
		this.qtdeVagas = qtdeVagas;
	}

	public int getHorasFranquiaInicial() {
		return horasFranquiaInicial;
	}

	public void setHorasFranquiaInicial(int horasFranquiaInicial) {
		this.horasFranquiaInicial = horasFranquiaInicial;
	}

	public void setValorFranquiaInicial(double valorFranquiaInicial) {
		this.valorFranquiaInicial = valorFranquiaInicial;
	}

	public double getValorAdicionalHora() {
		return valorAdicionalHora;
	}

	public void setValorAdicionalHora(double valorAdicionalHora) {
		this.valorAdicionalHora = valorAdicionalHora;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getSituacao() {
		return situacao;
	}

	public void ativar() {
		this.situacao = "Ativado";
	}

	public void desativar() {
		this.situacao = "Desativado";
	}
	
	public double getValorFranquiaInicial() {
		return valorFranquiaInicial;
	}

	@Override
	public String toString() {
		
		return
		"\nCódigo......................: " + this.codigo +
		"\nNome........................: " + this.nome +
		"\nCidade......................: " + this.cidade +
		"\nSituação....................: " + this.situacao +
		"\nQuant. de vagas.............: " + this.qtdeVagas +
		"\nFranquia inicial (horas)....: " + this.horasFranquiaInicial +
		"\nValor da franquia inicial R$: " + String.format("%.2f", this.valorFranquiaInicial) +
		"\nValor por hora adicional  R$: " + String.format("%.2f", this.valorAdicionalHora) + "\n";
	}

}
