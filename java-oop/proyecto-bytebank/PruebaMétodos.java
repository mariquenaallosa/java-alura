public class PruebaMétodos {
	
	public static void main(String[] args) {
		
		Cuenta cuentaDiego = new Cuenta();
		cuentaDiego.depositar(400);;
		System.out.println(cuentaDiego.getSaldo());
		cuentaDiego.depositar(500);
		System.out.println(cuentaDiego.getSaldo());
	
		cuentaDiego.retirar(100);
		System.out.println(cuentaDiego.getSaldo());		
	
	
	
		Cuenta cuentaJimena = new Cuenta();
		cuentaJimena.depositar(1000);;
		System.out.println("Saldo Diego: " + cuentaDiego.getSaldo());
		System.out.println("Saldo Jimena: " + cuentaJimena.getSaldo());	
		
		boolean puedeTransferir = cuentaJimena.transferir(400, cuentaDiego);
		
		if(puedeTransferir) {
			System.out.println("transferencia exitosa");
		}else {
			System.out.println("transferencia fallida");
		}
		
		
		System.out.println(cuentaDiego.getSaldo());
		
		
	
	}
	

}
