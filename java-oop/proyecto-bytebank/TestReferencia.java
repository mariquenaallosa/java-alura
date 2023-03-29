
public class TestReferencia {

	public static void main(String[] args) {
		
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.depositar(200);;
		System.out.println("El saldo de la primera cuenta al iniciar es: " + primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = primeraCuenta;
		
		segundaCuenta.depositar(100);
		
		System.out.println("El saldo de la segunda cuenta ahora es: " + segundaCuenta.getSaldo() + " y la primera cuenta tiene un saldo de: "+ primeraCuenta.getSaldo());
		// Apuntan al mismo espacio en memoria entonces se modifican ambos valores
		
		
		primeraCuenta.depositar(300);
		System.out.println("El saldo de la segunda cuenta ahora es: " + segundaCuenta.getSaldo() + " y la primera cuenta tiene un saldo de: "+ primeraCuenta.getSaldo());
		
		// Al pedir los objetos vemos que tienen el mismo espacio en memoria 
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if(primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto");
		}
		
		
		
	}
}
