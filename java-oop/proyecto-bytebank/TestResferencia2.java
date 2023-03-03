
public class TestResferencia2 {
	
	public static void main(String[] args) {
		
		Cliente diego = new Cliente();
		diego.nombre = "Diego";
		diego.documento = "34567846";
		diego.telefono = "9993948372";
		
		
		Cuenta cuentaDiego = new Cuenta();
		cuentaDiego.agencia = 1 ;
		cuentaDiego.numero = 453;
		cuentaDiego.saldo = 200;
		cuentaDiego.titular = diego;
		
		
		System.out.println(cuentaDiego.titular.documento);
		
		// Llevan a la misma referencia
		System.out.println(cuentaDiego.titular);
		System.out.println(diego);
	}

}
