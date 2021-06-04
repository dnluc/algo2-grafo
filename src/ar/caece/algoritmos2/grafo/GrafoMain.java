package ar.caece.algoritmos2.grafo;

import java.util.HashSet;
import java.util.List;

public class GrafoMain {

	public static void main(String[] args) {
		

		Archipielago archipielago =  (new TestGrafo()).CrearGrafo();
		
		RecorreGrafo recorreGrafo = new RecorreGrafo();
		
		List<List<String>> caminos = recorreGrafo.recorrer(archipielago, 1, "C", 2 , "D"); // 3 -> 10
	
		for (List<String> camino : caminos) {
			System.out.println(camino);	
			
		}
		
	}

}
