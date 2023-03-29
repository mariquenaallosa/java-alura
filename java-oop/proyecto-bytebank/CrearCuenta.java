
public class CrearCuenta {

	public static void main(String[] args) {
		// Variable            valor
		// la varibale es la referencia a un lugar en la variable
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.depositar(1000);
		// primeraCuenta.pais = "Peru"; NO COMPILA
		
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.depositar(500);
		System.out.println(segundaCuenta.getSaldo());
		System.out.println(primeraCuenta.getSaldo());
		
		
		// Al pedir los objetos vemos que tienen diferentes espacios en memoria 
				System.out.println(primeraCuenta);
				System.out.println(segundaCuenta);
				
				if(primeraCuenta == segundaCuenta) {
					System.out.println("Son el mismo objeto");
				} else {
					System.out.println("Son objetos diferentes");
				}
				
				
		
		
		
	}
}
