package ar.caece.algoritmos2.grafo;

import java.util.HashMap;
import java.util.Map;

public class Isla {

	private int islaId;
	
	private Map<String, Ciudad> ciudades;
	
	public Isla() {
		ciudades = new HashMap<>();
	}

	public Ciudad obtenerCiudad(String nombreCiudad) {
		return ciudades.get(nombreCiudad);
	}

	public void agregarCiudad(Ciudad ciudad) {
		ciudades.put(ciudad.getNombre(), ciudad);
	}

	public int getIslaId() {
		return islaId;
	}

	public void setIslaId(int islaId) {
		this.islaId = islaId;
	}
	
}
