package bytebank;
// Si la clase fuera normal yo me veo obligada a implementar los métodos abstractos 
// Pero si la clase es abstracta, no estoy obligada a implementar los métodos abstractos pero a su vez ya no puedo instanciar un objeto de esa clase 
public class Contador extends Funcionario {

	
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando desde la clase contador");
		return 200;
	}
}
