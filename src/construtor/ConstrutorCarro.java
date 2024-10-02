package construtor;

public class ConstrutorCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro carro1 = new Carro();
		Carro carro2 = new Carro("ABC0000",123456789);
		Carro carro3 = new Carro("ACB0001",134256793);

		System.out.println(carro2.getPlaca());
		System.out.println(carro2.getnumChassi());

		System.out.println(carro3.getPlaca());
		System.out.println(carro3.getnumChassi());

	}

}


