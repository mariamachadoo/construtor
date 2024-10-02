package construtor;

public class ConstrutorConsulta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consulta consulta1 = new Consulta();
		Consulta consulta2 = new Consulta("Maria", "João", 12/05/2002);
		Consulta consulta3 = new Consulta("Gabriel", "Joabe", 12/07/2007);
		
		System.out.println(consulta2.getNomePcnt());
		System.out.println(consulta2.getNomeDents());
		System.out.println(consulta2.getData());
		
		System.out.println(consulta3.getNomePcnt());
		System.out.println(consulta3.getNomeDents());
		System.out.println(consulta3.getData());

	}

}
