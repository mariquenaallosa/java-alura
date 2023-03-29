// entidad cuenta
public class Cuenta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	private static int total = 0;

	// Contructor
	public Cuenta() {

	}

	public Cuenta(int agencia) {
		if (agencia <= 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Se van creando: " + total + " cuentas.");

	}

	// NO retorna valor
	public void depositar(double saldo) {
		// Esta cuenta Esta cuenta
		// this account this account
		// this object

		this.saldo += saldo;
	}

	// Retorna valor
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			cuenta.saldo += valor;
			return true;
		} else {
			return false;
		}

	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return Cuenta.total;
	}
	
	public void setAgencia(int nuevaAgencia) {
		if (nuevaAgencia > 0) {
			this.agencia = nuevaAgencia;
		} else {
			System.out.println("No están permitidos números negativos");
		}
	}

	public void setNumero(int nuevoNumero) {
		if (nuevoNumero > 0) {
			this.numero = nuevoNumero;
		} else {
			System.out.println("No están permitidos números negativos");

		}
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}