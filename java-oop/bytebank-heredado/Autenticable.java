package bytebank;
// La interfce no puede tener m�todos implementados
// Una interfaz no puede extender de una clase, pero puede extender de otra interfaz
public interface Autenticable {
	

	public void setClave(String clave);

	public boolean iniciarSesion(String contrase�a);


}
