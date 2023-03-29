
public class TestReferencia3 {

	
	public static void main(String[] args) {
		
		Cuenta cuentaDiego = new Cuenta();
		
		//Así no se puede hacer porque tira una excepcion ya que no instancio el cliente que necesito para vincular
		//cuentaDiego.titular.nombre = "Diego";

		
		// De esta forma si, y me lo crea como null porque son String
		Cliente titular = new Cliente() ;
		titular.setNombre("Diego");
		cuentaDiego.setTitular(titular);
		
		
		
		
		System.out.println(cuentaDiego.getTitular().getNombre());
		
		
	}
}
