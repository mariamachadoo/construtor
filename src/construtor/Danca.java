package construtor;

public class Danca {

	public String nome;
	public String alta;
	public String baixa;
	public String estilo;

	public Danca(String nome, String alta, String baixa, String estilo) {
		this.nome = nome;
		this.alta = alta;
		this.baixa = baixa;
		this.estilo = estilo;
	}

	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String getalta() {
		return alta;
	}
	public void setalta(String alta) {
		this.alta = alta;
	}
	public String getbaixa() {
		return baixa;
	}
	public void setbaixa(String baixa) {
		this.baixa = baixa;
	}
	public String getestilo() {
		return estilo;
	}
	public void setestilo(String estilo) {
		this.estilo = estilo;
	}



}


