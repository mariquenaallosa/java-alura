package bytebank;

public class SistemaInterno {

	private String clave = "12345";

	public boolean autentica(Gerente gerente) {
		boolean autentico = gerente.iniciarSesion(clave);
		
		if (autentico) {
			System.out.println("Login exitoso");
			return true;
		} else {
			System.out.println("Error en login");
			return false;
		}

	}
}
