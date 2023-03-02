// entidad cuenta
public class Cuenta{
	
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	
	public void depositar(double saldo){
		// Esta cuenta    Esta cuenta
		// this account  this account
		// this object
		
		this.saldo        =       this.saldo     + saldo;
	}
}