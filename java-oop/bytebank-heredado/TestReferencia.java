package bytebank;

public class TestReferencia {

	public static void main(String[] args) {
		
		// Elemento más genérico puede ser adaptado al elemento más específico
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Diego");
		
		
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		
		gerente.iniciarSesion("2222");
	}
	
}
