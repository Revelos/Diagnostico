package com.gm.mundopc;

public class Orden {
	private Integer idOrden;
	private Computadora computadoras[];
	private static Integer contadorOrdenes=0;
	private static Integer contadorComputador=0;
	private Integer contadorCompuradoras;
	private Integer maxComputadoras=10;
	
	public Orden() {
		computadoras = new Computadora[maxComputadoras];
		contadorCompuradoras=0;
		this.idOrden=Orden.contadorOrdenes+1;
		Orden.contadorOrdenes=Orden.contadorOrdenes+1;
	}
	
	public void agregarComputadoras(Computadora computadora) {
		if(contadorCompuradoras<=5) {
		computadora.setIdComputadora(Orden.contadorComputador+1);
		this.computadoras[contadorCompuradoras]=computadora;
		contadorCompuradoras=contadorCompuradoras+1;
		Orden.contadorComputador=Orden.contadorComputador+1;
		}else {
			System.out.println("Ha llegado al maximo de productos por agregar en orden #"+idOrden);
		}
	}
	
	public Double[] calcularTotal() {
		Double[] total= {0.0,0.0};
		for (Computadora computadora : computadoras) {
			if(computadora==null) return total;
			total[0]=total[0]+computadora.getPrecio();
			total[1]=total[1]+1;
		}
		return total;
	};

	public void mostrarOrden() {
		System.out.println("\n\n\t************* Orden # "+idOrden+" *************");
		for (Computadora computadora : computadoras) {
			if(computadora==null)break;
			System.out.println(computadora.toString());
		}
		Double[] total= calcularTotal();
		System.out.println("Items:   "+total[1]+" ");
		System.out.println("TOTAL:  $ "+Math.round(total[0]*100)/100d+" ");
	}
	
}
