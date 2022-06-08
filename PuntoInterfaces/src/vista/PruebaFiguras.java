package vista;

import modelo.*;

public class PruebaFiguras {

    public static void main(String[] args) {

        Figura cu1 = new Cuadrado("Gris");
        Figura cu2 = new Cuadrado("Rosado");
        Figura tr1 = new Triangulo("Amarillo");
        Figura cir1 = new Circulo("Naranja");
        Figura cir2 = new Circulo("Café");

        Pizarra Piz = new Pizarra();

        cu1.cambiaColor("Blanco");
        System.out.println("Color Actual: " + cu1.queColor());

        cu2.cambiaColor("Moradp");
        System.out.println("Color Actual: " + cu2.queColor());

        tr1.cambiaColor("Rojo");
        System.out.println("Color Actual: " + tr1.queColor());

        cir1.cambiaColor("Azul");
        System.out.println("Color Actual: " + cir1.queColor());

        cir2.cambiaColor("Verde menta");
        System.out.println("Color Actual: " + cir2.queColor());

        Piz.mostrarFiguras();

        Piz.añadirFigura(cu1);
        Piz.añadirFigura(cu2);
        Piz.añadirFigura(tr1);
        Piz.añadirFigura(cir1);
        Piz.añadirFigura(cir2);

        Piz.mostrarFiguras();

        Piz.dibujarFiguras();

        Piz.borrarFiguras();

        Piz.mostrarFiguras();

    }

}
