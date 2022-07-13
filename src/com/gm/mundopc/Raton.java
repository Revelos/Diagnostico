package com.gm.mundopc;

public class Raton extends DispositivoEntrada{
	private Integer idRaton;
	private static Integer contadorRatones=0;
	
	public Raton(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idRaton=Raton.contadorRatones+1;
		Raton.contadorRatones=Raton.contadorRatones+1;
	}

	@Override
	public String toString() {
		return "Raton [idRaton=" + idRaton + ", getTipoEntrada()=" + getTipoEntrada() + ", getMarca()=" + getMarca()
				+ "]";
	}
	
	
	
	

}
