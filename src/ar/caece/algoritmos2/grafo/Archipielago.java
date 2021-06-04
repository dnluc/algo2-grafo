package ar.caece.algoritmos2.grafo;

import java.util.HashMap;
import java.util.Map;

public class Archipielago {

	Map<Integer, Isla> islas;
	
	public Archipielago() {
		islas = new HashMap<>();
	}

	public Isla obtenerIsla(int islaId) {
		return islas.get(islaId);
	}
	
	public void agregarIsla(Isla isla) {
		islas.put(isla.getIslaId(), isla);
	}
	
}
