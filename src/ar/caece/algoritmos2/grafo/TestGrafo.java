package ar.caece.algoritmos2.grafo;

public class TestGrafo {

	
	public Archipielago CrearGrafo() {
		
		//ISLA 1
		Ciudad ciudad1 = new Ciudad();
		ciudad1.setCiudadId(1);
		ciudad1.setIslaId(1);
		ciudad1.setNombre("A");
			
		Ciudad ciudad2 = new Ciudad();
		ciudad2.setCiudadId(2);
		ciudad2.setIslaId(1);
		ciudad2.setNombre("B");
		
		Ciudad ciudad3 = new Ciudad();
		ciudad3.setCiudadId(3);
		ciudad3.setIslaId(1);
		ciudad3.setNombre("C");

		Isla isla1 = new Isla();
		isla1.setIslaId(1);
		isla1.agregarCiudad(ciudad1);
		isla1.agregarCiudad(ciudad2);
		isla1.agregarCiudad(ciudad3);
		
		//ISLA 2
		
		Ciudad ciudad4 = new Ciudad();
		ciudad4.setCiudadId(4);
		ciudad4.setIslaId(2);
		ciudad4.setNombre("J");
	
		Ciudad ciudad5 = new Ciudad();
		ciudad5.setCiudadId(5);
		ciudad5.setIslaId(2);
		ciudad5.setNombre("A");
		
		Ciudad ciudad6 = new Ciudad();
		ciudad6.setCiudadId(6);
		ciudad6.setIslaId(2);
		ciudad6.setNombre("P");
		
		Ciudad ciudad7 = new Ciudad();
		ciudad7.setCiudadId(7);
		ciudad7.setIslaId(2);
		ciudad7.setNombre("F");

		Ciudad ciudad8 = new Ciudad();
		ciudad8.setCiudadId(8);
		ciudad8.setIslaId(2);
		ciudad8.setNombre("D");
		
		Isla isla2 = new Isla();
		isla2.setIslaId(2);
		isla2.agregarCiudad(ciudad4);
		isla2.agregarCiudad(ciudad5);
		isla2.agregarCiudad(ciudad6);
		isla2.agregarCiudad(ciudad7);
		isla2.agregarCiudad(ciudad8);

		//ISLA 3
		Ciudad ciudad9 = new Ciudad();
		ciudad9.setCiudadId(9);
		ciudad9.setIslaId(3);
		ciudad9.setNombre("A");
	
		Ciudad ciudad10 = new Ciudad();
		ciudad10.setCiudadId(10);
		ciudad10.setIslaId(3);
		ciudad10.setNombre("B");
		
		Ciudad ciudad11 = new Ciudad();
		ciudad11.setCiudadId(11);
		ciudad11.setIslaId(3);
		ciudad11.setNombre("C");
		
		Ciudad ciudad12 = new Ciudad();
		ciudad12.setCiudadId(12);
		ciudad12.setIslaId(3);
		ciudad12.setNombre("E");

		Isla isla3 = new Isla();
		isla3.setIslaId(3);
		isla3.agregarCiudad(ciudad9);
		isla3.agregarCiudad(ciudad10);
		isla3.agregarCiudad(ciudad11);
		
		
		//Archipielago
		
		Archipielago archipielago = new Archipielago();
		
		archipielago.agregarIsla(isla1);
		archipielago.agregarIsla(isla2);
		archipielago.agregarIsla(isla3);
		
		//CAMINOS ISLA1
	
		ciudad1.agregarCamino(ciudad2);
		ciudad1.agregarCamino(ciudad3);
		
		ciudad2.agregarCamino(ciudad1);
		ciudad2.agregarCamino(ciudad3);
		
		ciudad3.agregarCamino(ciudad1);
		ciudad3.agregarCamino(ciudad2);
		
		//CAMINOS ISLA2
		
		ciudad4.agregarCamino(ciudad5);
			
		ciudad5.agregarCamino(ciudad4);
		ciudad5.agregarCamino(ciudad6);
		ciudad5.agregarCamino(ciudad7);
		ciudad5.agregarCamino(ciudad8);
		
		ciudad6.agregarCamino(ciudad5);
		
		ciudad7.agregarCamino(ciudad5);
		
		ciudad8.agregarCamino(ciudad5);
	
		
		//CAMINOS ISLA3

		ciudad9.agregarCamino(ciudad12);
		ciudad9.agregarCamino(ciudad10);
		
		ciudad10.agregarCamino(ciudad9);
		ciudad10.agregarCamino(ciudad11);
		ciudad10.agregarCamino(ciudad12);

		ciudad11.agregarCamino(ciudad12);
		ciudad11.agregarCamino(ciudad10);

		ciudad12.agregarCamino(ciudad9);
		ciudad12.agregarCamino(ciudad10);
		ciudad12.agregarCamino(ciudad11);
		
		//HELIPUERTOS
		
		ciudad2.agregarHelipuerto(ciudad12);
		ciudad2.agregarHelipuerto(ciudad7);
		
		ciudad12.agregarHelipuerto(ciudad2);
		ciudad12.agregarHelipuerto(ciudad7);
		
		ciudad7.agregarHelipuerto(ciudad2);
		ciudad7.agregarHelipuerto(ciudad12);
		
		
		return archipielago;
		
	}
	
	
	
}
