
public class CrearCuenta {

	public static void main(String[] args) {
		// Variable            valor
		// la varibale es la referencia a un lugar en la variable
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 1000;
		// primeraCuenta.pais = "Peru"; NO COMPILA
		
		System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 500;
		System.out.println(segundaCuenta.saldo);
		System.out.println(primeraCuenta.saldo);
		
		
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
