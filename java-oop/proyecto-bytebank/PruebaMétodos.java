public class PruebaMétodos {
	
	public static void main(String[] args) {
		
		Cuenta cuentaDiego = new Cuenta();
		cuentaDiego.saldo = 300;
		System.out.println(cuentaDiego.saldo);
		cuentaDiego.depositar(500);
		System.out.println(cuentaDiego.saldo);
	
		cuentaDiego.retirar(100);
		System.out.println(cuentaDiego.saldo);		
	
	
	
		Cuenta cuentaJimena = new Cuenta();
		cuentaJimena.saldo = 1000;
		System.out.println("Saldo Diego: " + cuentaDiego.saldo);
		System.out.println("Saldo Jimena: " + cuentaJimena.saldo);	
		
		boolean puedeTransferir = cuentaJimena.transferir(400, cuentaDiego);
		
		if(puedeTransferir) {
			System.out.println("transferencia exitosa");
		}else {
			System.out.println("transferencia fallida");
		}
		
		
		System.out.println(cuentaDiego.saldo);
		
		
	
	}
	

}
