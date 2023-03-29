
public class PruebaConstructor {
	
	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta(-44);
		Cuenta cuenta2 = new Cuenta(353);
		Cuenta cuenta3 = new Cuenta(33);
		
		System.out.println(Cuenta.getTotal());
	}
}
