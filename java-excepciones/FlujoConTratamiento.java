
public class FlujoConTratamiento {
	public static void main(String[] args) {
		System.out.println("Inicio main");
		try{
			metodo1();
		}catch(MiException | ArithmeticException | NullPointerException  e) {
			e.printStackTrace();
		}
		System.out.println("Fin main");
	}

	public static void metodo1() throws MiException {
		System.out.println("Inicio de metodo1");
		metodo2();
		System.out.println("Fin de metodo1");
	}

	public static void metodo2() throws MiException {
		System.out.println("Inicio de metodo 2");
		int a = 50/0; // Aritmethic exception
		Cuenta c = null;
		c.deposita();
		 throw new ArithmeticException("Surgió un error");
	}
}
