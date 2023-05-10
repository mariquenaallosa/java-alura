
public class Flujo {
	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fin main");
	}

	public static void metodo1() {
		System.out.println("Inicio de metodo1");
		metodo2();
		System.out.println("Fin de metodo1");
	}

	public static void metodo2() {
		System.out.println("Inicio de metodo2");
		/*
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try { // intenta esto
				
				if(i==3) {
					int num= 0;
					int resultado = i/num;
					System.out.println(resultado);
				}

				String test = null;
				System.out.println(test.toString());

			} catch (ArithmeticException | NullPointerException exception) { // Atrapa este error
				System.out.println("Atrapo excepcion");
				System.out.println(exception.getMessage());
				exception.printStackTrace();
			} 

		} 
		*/

		
		
		/*
		 * 		ArithmeticException ae = new ArithmeticException();
				throw ae;  // con esto hago que explote
		 * 
		 * */
		
		// Tradicionalmente no se hace como muestra arriba , sino que lo que hacemos es lanzar directamente la excepcion
		Cuenta cuenta  = new Cuenta();
		 throw new ArithmeticException();
		 
		 // Thow sólo se puede hacer de objetos que son exepciones , no va a funcionar con otro tipo de objeto
	}
}
