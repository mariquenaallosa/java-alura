package bytebank;

public class TestCuenta {

	
	public static void main(String[] args) {
		
		CuentaCorriente cc = new CuentaCorriente(1,1);
		CuentaAhorro ca = new CuentaAhorro(2, 3);
		
		
		cc.depositar(2000);
		cc.transferir(1000, ca);
		
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}
}
