package bytebank;

public class TestGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		//gerente.setSalario(5000);
		
		//Funcionario gerente = new Funcionario();
		gerente.setSalario(6000);
		gerente.setClave("AluraCursosOnLine");
		
		
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("AluraCursosOnLine"));
		
		
		Gerente g1 = new Gerente();
		g1.setNombre("Marco");
		g1.setDocumento("32489234");
		g1.setSalario(5000);
		
		System.out.println(g1.getNombre());
		System.out.println(g1.getDocumento());
		System.out.println(g1.getSalario());
		
		
		g1.setClave("2222");
		boolean autentico = g1.iniciarSesion("2222");
		
		System.out.println(autentico);
		System.out.println(g1.getSalario());
		System.out.println(g1.getBonificacion());
	}
	
}
