package bytebank;
// entidad cuenta
public abstract class Cuenta {

	protected double saldo;
	private int agencia = 1;
	private int numero;
	private Cliente titular = new Cliente();

	private static int total ;
	
	public Cuenta () {};

	// Contructor
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
	
	public Cuenta(int agencia, int numero) {
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
	public abstract void depositar(double saldo);
	
	
	// Retorna valor
	public void retirar(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("No tienes saldo");
		}
		this.saldo -= valor;
	}

	public boolean transferir(double valor, Cuenta destino) {
		if (this.saldo >= valor) {
			try {
				this.retirar(valor);
			} catch (SaldoInsuficienteException e) {
				e.printStackTrace();
			}
			destino.depositar(valor);
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