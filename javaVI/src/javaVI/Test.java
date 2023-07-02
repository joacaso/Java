package javaVI;

public class Test {
	public static void main(String[] args) {
		/* Empleados */
        Empleado empleado = new Empleado("Juan", "Mar del Plata", "451", "Empleado de Ventas");
        Jefe jefe = new Jefe("Pedro", "Mar del plata", "452", "Jefe de Departamento", "Ventas", 1);
        
        System.out.println(empleado.detalle());
        System.out.println(jefe.detalle());
        
        /* Figura Geometrica */
        circulo c1 = new circulo(6,7);
        rectangulo r1 = new rectangulo(6,7);
        triangulo t1 = new triangulo(6,7);
        
        System.out.println(c1.detalle());
        c1.dibujar();
        System.out.println(r1.detalle());
        r1.dibujar();
        System.out.println(t1.detalle());
        t1.dibujar();
    }
}
