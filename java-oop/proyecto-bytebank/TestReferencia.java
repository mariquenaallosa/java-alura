
public class TestReferencia {

	public static void main(String[] args) {
		
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 200;
		System.out.println("El saldo de la primera cuenta al iniciar es: " + primeraCuenta.saldo);
		
		Cuenta segundaCuenta = primeraCuenta;
		
		segundaCuenta.saldo= 100;
		
		System.out.println("El saldo de la segunda cuenta ahora es: " + segundaCuenta.saldo + " y la primera cuenta tiene un saldo de: "+ primeraCuenta.saldo);
		// Apuntan al mismo espacio en memoria entonces se modifican ambos valores
		
		
		primeraCuenta.saldo += 300;
		System.out.println("El saldo de la segunda cuenta ahora es: " + segundaCuenta.saldo + " y la primera cuenta tiene un saldo de: "+ primeraCuenta.saldo);
		
		// Al pedir los objetos vemos que tienen el mismo espacio en memoria 
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if(primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto");
		}
		
	}
}
