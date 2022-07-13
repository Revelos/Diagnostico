package com.gm.mundopc;

public class Computadora {
	private Integer idComputadora;
	private String nombre;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	private Double precio;
	
	
	public Computadora() {}
	public Computadora (String nombre,Monitor monitor,Teclado teclado,Raton raton,Double precio) {
		this.nombre=nombre;
		this.monitor=monitor;
		this.teclado= teclado;
		this.raton=raton;
		this.precio=precio;
	}
	
	
	public Integer getIdComputadora() {
		return idComputadora;
	}
	public void setIdComputadora(Integer idComputadora) {
		this.idComputadora = idComputadora;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public Teclado getTeclado() {
		return teclado;
	}
	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}
	public Raton getRaton() {
		return raton;
	}
	public void setRaton(Raton raton) {
		this.raton = raton;
	}
	
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "\nComputadora [idComputadora=" + idComputadora + ", nombre=" + nombre + ", precio=$ "+precio+"]\n\t* " + monitor.toString()
				+ "\n\t* " + teclado.toString() + "\n\t* " + raton.toString() ;
	}
	
	

}
