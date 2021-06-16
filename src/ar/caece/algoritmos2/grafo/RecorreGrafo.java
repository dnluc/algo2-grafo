package ar.caece.algoritmos2.grafo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RecorreGrafo {

	
	public List<List<CiudadVisitada>> recorrer(Archipielago archipielago, int islalaIdOrigen, 
			String nombreCiudadOrigen, int islalaIdDestino, 
			String nombreCiudadDestino, int maximoCaminos) {
			
		
		Isla islaOrigen = archipielago.obtenerIsla(islalaIdOrigen);
		Ciudad ciudadOrigen = islaOrigen.obtenerCiudad(nombreCiudadOrigen);
		
		List<Ciudad> ciudadesVisitadas =  new ArrayList<>();
		List<CiudadVisitada> camino =  new ArrayList<>();
		List<List<CiudadVisitada>> caminos = new ArrayList<>();
		
		recorrer(ciudadOrigen, islalaIdDestino, nombreCiudadDestino, ciudadesVisitadas, camino, caminos, maximoCaminos, TipoCamino.INICIO);
		
		return caminos;
	
	}
	
	
	private void recorrer(Ciudad ciudadOrigen, int islalaIdDestino, 
			String nombreCiudadDestino, List<Ciudad> ciudadesVisitadas, List<CiudadVisitada> camino,
			List<List<CiudadVisitada>> caminos, int maximoCaminos, TipoCamino tipoCamino) {
		

		
		if (!ciudadesVisitadas.contains(ciudadOrigen) && caminos.size() < maximoCaminos) {

			CiudadVisitada ciudadVisitada = new CiudadVisitada();
			ciudadVisitada.setCiudad(ciudadOrigen);
			ciudadVisitada.setTipoCamino(tipoCamino);
			
			camino.add(ciudadVisitada);
			ciudadesVisitadas.add(ciudadOrigen);
			
			if (ciudadOrigen.getIslaId() != islalaIdDestino || !ciudadOrigen.getNombre().equals(nombreCiudadDestino)) {
				
				for (Ciudad ciudad : ciudadOrigen.getCaminos()) {
					
					recorrer(ciudad, islalaIdDestino, 
							nombreCiudadDestino, ciudadesVisitadas, camino, caminos, maximoCaminos, TipoCamino.CARRETERA);

				}
				
				
				
				for (Ciudad ciudad : ciudadOrigen.getHelipuertos()) {
					
					recorrer(ciudad, islalaIdDestino, 
							nombreCiudadDestino, ciudadesVisitadas, camino, caminos, maximoCaminos,  TipoCamino.HELICOPTERO);
				}
			} else {
				caminos.add(new ArrayList<>(camino));
			}
			
			camino.remove(ciudadVisitada);
			ciudadesVisitadas.remove(ciudadOrigen);
				
		}
	}

	
	
}
