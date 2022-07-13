package com.gm.mundopc;

public class Monitor {

	private Integer idMonitor;
	private String marca;
	private Double tamano;
	private static Integer contadorMonitores=0;
	
	public Monitor() {}
	public Monitor (String marca,Double tamano) {
		this.marca=marca;
		this.tamano=tamano;
		this.idMonitor=Monitor.contadorMonitores+1;
		Monitor.contadorMonitores=Monitor.contadorMonitores+1;
	}
	
	@Override
	public String toString() {
		return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamano=" + tamano +"]";
	}
	
	public Integer getIdMonitor() {
		return idMonitor;
	}
	public void setIdMonitor(Integer idMonitor) {
		this.idMonitor = idMonitor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getTamano() {
		return tamano;
	}
	public void setTamano(Double tamano) {
		this.tamano = tamano;
	}
	
	
	
}
