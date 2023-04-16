package bytebank;

public class TestTributacion {
	public static void main(String[] args) {
		
		CuentaCorriente cc = new CuentaCorriente(222,333);
		cc.depositar(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
		CalculadoraDeImpuesto calc = new CalculadoraDeImpuesto();
		
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImpuesto());
	}
}
