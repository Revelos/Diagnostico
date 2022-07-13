package mundopc;

import com.gm.mundopc.*;

public class MundoPc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Raton raton1 = new Raton("USB","klipx");
		Raton raton2 = new Raton("PS/2","Logitech");
		Raton raton3 = new Raton("Jack","Genius");
		
		Teclado teclado1 = new Teclado("USB","Inphic");
		Teclado teclado2 = new Teclado("AUXI","Razer");
		Teclado teclado3 = new Teclado("USB","Acer");
		
		Monitor monitor1 = new Monitor("Acer",24.5);
		Monitor monitor2 = new Monitor("LG",30.5);
		
		Computadora computadora1 = new Computadora("ASUS",monitor1,teclado1,raton1,600.56);
		Computadora computadora2 = new Computadora("Samsung",monitor2,teclado2,raton2,1245.30);
		Computadora computadora3 = new Computadora("DELL",monitor2,teclado2,raton2,864.30);
		Computadora computadora4 = new Computadora("HP",monitor2,teclado2,raton2,200.30);
		Computadora computadora5 = new Computadora("Lenovo",monitor2,teclado3,raton3,297.90);
		Computadora computadora6 = new Computadora("iMac",monitor2,teclado2,raton2,156.30);
		
		Orden orden1 = new Orden();
		Orden orden2 = new Orden();
		Orden orden3 = new Orden();
		orden1.agregarComputadoras(computadora1);
		orden1.agregarComputadoras(computadora2);
		orden1.agregarComputadoras(computadora3);
		orden1.agregarComputadoras(computadora4);
		
		
		orden2.agregarComputadoras(computadora5);
		
		orden3.agregarComputadoras(computadora2);
		orden3.agregarComputadoras(computadora3);
		orden3.agregarComputadoras(computadora6);
		
		orden1.mostrarOrden();
		orden2.mostrarOrden();
		orden3.mostrarOrden();
		//System.out.println(computadora1.toString());
		//System.out.println(computadora2.toString());
	}

}
