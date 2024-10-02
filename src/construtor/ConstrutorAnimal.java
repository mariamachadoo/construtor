package construtor;

public class ConstrutorAnimal {

	public static void main(String[] args) {

		Animal animal1 = new Animal("");
		Animal animal2 = new Animal("cinza", 60);
		Animal animal3 = new Animal("roxo", 90);
		
		
		System.out.println(animal2.getCor());
		System.out.println(animal2.getTamanho());
		
		System.out.println(animal3.getCor());
		System.out.println(animal3.getTamanho());

	}
}