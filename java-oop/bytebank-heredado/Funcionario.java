package bytebank;
//La clase al ser abstracta no puede ser instanciada como tal, porque al ser abstracta es como una representación conceptual no más y no una física. 


//

public abstract class Funcionario {

	private String nombre;
	private String documento;
	private double salario;

	public Funcionario() {

	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// Todo método abstracto debe ser implementado por la clase que la extiende
	// No tienen implemetación , sólo firma y se debe implementar en las clases hijas
	
	//Para definir métodos abstractos es necesario que la clase sea abstracta
	
	public abstract double getBonificacion();


}
