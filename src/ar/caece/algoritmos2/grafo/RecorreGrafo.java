package ar.caece.algoritmos2.grafo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RecorreGrafo {

	
	public List<List<String>>  recorrer(Archipielago archipielago, int islalaIdOrigen, 
			String nombreCiudadOrigen, int islalaIdDestino, 
			String nombreCiudadDestino) {
			
		
		Isla islaOrigen = archipielago.obtenerIsla(islalaIdOrigen);
		Ciudad ciudadOrigen = islaOrigen.obtenerCiudad(nombreCiudadOrigen);
		
		Set<Integer> ciudadesVisitadas =  new HashSet<>();
		List<String> camino =  new ArrayList<>();
		List<List<String>> caminos =  new ArrayList<>();
		
		recorrer(ciudadOrigen, islalaIdDestino, nombreCiudadDestino, ciudadesVisitadas, camino, caminos, TipoCamino.INICIO);
		
		return caminos;
	
	}
	
	
	private void recorrer(Ciudad ciudadOrigen, int islalaIdDestino, 
			String nombreCiudadDestino, Set<Integer> ciudadesVisitadas, List<String> camino, List<List<String>> caminos, TipoCamino tipoCamino) {
		
		
		if (!ciudadesVisitadas.contains(ciudadOrigen.getCiudadId())) {
		
			ciudadesVisitadas.add(ciudadOrigen.getCiudadId());
			
			camino.add( "(" + tipoCamino.toString().substring(0, 1) + ") -> " + ciudadOrigen.getIslaId()  + ciudadOrigen.getNombre());
			
			
			if (ciudadOrigen.getIslaId() != islalaIdDestino || !ciudadOrigen.getNombre().equals(nombreCiudadDestino)) {
				
				for (Ciudad ciudad : ciudadOrigen.getCaminos()) {
					
					recorrer(ciudad, islalaIdDestino, 
							nombreCiudadDestino, ciudadesVisitadas, camino, caminos, TipoCamino.CARRETERA);
					
				}
				
				for (Ciudad ciudad : ciudadOrigen.getHelipuertos()) {
					
					recorrer(ciudad, islalaIdDestino, 
							nombreCiudadDestino, ciudadesVisitadas, camino, caminos, TipoCamino.HELICOPTERO);
					
				}
			} else {
				
				caminos.add(new ArrayList<>(camino));
				
			}
				
		}
	}

	
	
}
