
public class PruebaEncapsulamiento {

	
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta();
		Cliente cliente = new Cliente();
		cliente.setNombre("Diego");
		cliente.setDocumento("39726491"); 
		
		// Asignar el cliente a la cuenta
		cuenta.setTitular(cliente);
		
		// otra manera de hacerlo
		Cliente titular = cuenta.getTitular();
		
		// Todo esto hace referencia al mismo objeto en memoria
		
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());
	}
}
