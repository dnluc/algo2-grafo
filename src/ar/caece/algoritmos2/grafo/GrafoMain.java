package ar.caece.algoritmos2.grafo;

import java.util.List;

public class GrafoMain {

	public static void main(String[] args) {
		

		Archipielago archipielago =  (new TestGrafo()).CrearGrafo();
		
		RecorreGrafo recorreGrafo = new RecorreGrafo();
		
		List<List<CiudadVisitada>> caminos = recorreGrafo.recorrer(archipielago, 3, "B", 1 , "A", 100); // 3 -> 10
		
		for (List<CiudadVisitada> camino : caminos) {
			System.out.println(camino);	
		}
		
	}

}
