package bytebank;
//La clase al ser abstracta no puede ser instanciada como tal, porque al ser abstracta es como una representaci�n conceptual no m�s y no una f�sica. 


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
	
	// Todo m�todo abstracto debe ser implementado por la clase que la extiende
	// No tienen implemetaci�n , s�lo firma y se debe implementar en las clases hijas
	
	//Para definir m�todos abstractos es necesario que la clase sea abstracta
	
	public abstract double getBonificacion();


}
