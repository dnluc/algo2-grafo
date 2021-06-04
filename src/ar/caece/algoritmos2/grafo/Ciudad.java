package ar.caece.algoritmos2.grafo;

import java.util.LinkedList;
import java.util.List;

public class Ciudad {

	private String nombre;
	
	private int islaId;
	
	private int ciudadId;
	
	private List<Ciudad> caminos;
	
	private List<Ciudad> helipuertos;

	
	public Ciudad() {
		caminos = new LinkedList<>();
		helipuertos = new LinkedList<>();
	}
	
	
	public int getIslaId() {
		return islaId;
	}

	public void setIslaId(int islaId) {
		this.islaId = islaId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Ciudad> getCaminos() {
		return caminos;
	}

	public List<Ciudad> getHelipuertos() {
		return helipuertos;
	}

	public void agregarCamino(Ciudad ciudad) {
		caminos.add(ciudad);
		
	}

	public void agregarHelipuerto(Ciudad ciudad) {
		helipuertos.add(ciudad);
		
	}
	

	public int getCiudadId() {
		return ciudadId;
	}


	public void setCiudadId(int ciudadId) {
		this.ciudadId = ciudadId;
	}


	@Override
	public String toString() {
		
		return islaId + '-' + nombre;
	}

	
	
	
}
