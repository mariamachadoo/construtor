package construtor;

public class Carro {
	private String placa;
	private int numChassi;
	
	public Carro() {
	}
	
	public Carro(String placa) {
		this.placa = placa;
	}
	
	public Carro(String placa, int numChassi) {
		this.placa = placa;
		this.numChassi = numChassi;
		}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getnumChassi() {
		return numChassi;
		
	}
	public void setnumChassi(int numChassie) {
		this.numChassi = numChassi;
	}

}
