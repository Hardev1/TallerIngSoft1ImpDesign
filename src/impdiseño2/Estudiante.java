package impdiseño2;

import java.util.Set;

public class Estudiante {
	private String cedula;
	private String nombre;
	private Set<String> codigosMaterias;
	public void Estudiante(String cedula, String nombre) {
	}
	
	public boolean adicionarMateria(String codigoMateria) {
		return false;
	}
	
	public String toString() {
		return cedula;
	}
}
