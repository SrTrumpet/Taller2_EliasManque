
package Clases;

/**
 *
 * @author Elias M. Olivares
 */
public class Login {
	
	private String usuario;
	private String password;
	
	public Login(String usuario, String password) {
		this.password = password;
		this.usuario = usuario;
	}

	
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
    
}
