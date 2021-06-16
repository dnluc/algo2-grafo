package ar.caece.algoritmos2.grafo;

public class CiudadVisitada {

	private Ciudad ciudad;
	private TipoCamino tipoCamino;

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public TipoCamino getTipoCamino() {
		return tipoCamino;
	}

	public void setTipoCamino(TipoCamino tipoCamino) {
		this.tipoCamino = tipoCamino;
	}
	
	@Override
	public String toString() {
		
		//return String.valueOf(this.getTipoCamino() + " -> " + String.valueOf(this.ciudad.getCiudadId()));
		return String.valueOf(this.getTipoCamino() + " -> " +
		String.valueOf(this.ciudad.getIslaId()) + " " + String.valueOf(this.ciudad.getNombre()));
	}
	
	
}
