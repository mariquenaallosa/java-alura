package bytebank;

public class CuentaCorriente extends Cuenta implements Tributacion {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean retirar(double valor) {
		double comision = 0.2;
		return super.retirar(valor + comision);
	}

	@Override
	public void depositar(double saldo) {
		this.saldo = this.saldo + saldo;
		
	}

	@Override
	public double getValorImpuesto() {
		return super.saldo * 0.01;
	}
}
