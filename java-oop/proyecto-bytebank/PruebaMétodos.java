public class PruebaMétodos {
	
	public static void main(String[] args) {
		
		Cuenta cuentaDiego = new Cuenta();
		cuentaDiego.saldo = 300;
		System.out.println(cuentaDiego.saldo);
		cuentaDiego.depositar(500);
		System.out.println(cuentaDiego.saldo);
	
		cuentaDiego.retirar(100);
		System.out.println(cuentaDiego.saldo);		
	
	
	
	
	
	}
	

}
