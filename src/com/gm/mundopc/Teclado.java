package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
	
	private Integer idTeclado;
	private static Integer contadorTeclados=0;
	
	public Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idTeclado=Teclado.contadorTeclados+1;
		Teclado.contadorTeclados=Teclado.contadorTeclados+1;
	}

	@Override
	public String toString() {
		return "Teclado [idTeclado=" + idTeclado + ", getTipoEntrada()=" + getTipoEntrada() + ", getMarca()="
				+ getMarca() + "]";
	}

	

	
}
