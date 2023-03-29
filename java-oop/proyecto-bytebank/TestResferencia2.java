
public class TestResferencia2 {
	
	public static void main(String[] args) {
		
		Cliente diego = new Cliente();
		diego.setNombre("Diego");
		diego.setDocumento("34567846");
		diego.setTelefono("9993948372");
		
		
		Cuenta cuentaDiego = new Cuenta();
		cuentaDiego.setAgencia(1) ;
		cuentaDiego.setNumero(453);
		cuentaDiego.depositar(200);
		cuentaDiego.setTitular(diego);
		
		
		System.out.println(cuentaDiego.getTitular().getDocumento());
		
		// Llevan a la misma referencia
		System.out.println(cuentaDiego.getTitular());
		System.out.println(diego);
	}

}
