package javaVI;

public class triangulo extends FiguraGeometrica {

    public triangulo(int puntoX, int puntoY) {
		super(puntoX, puntoY);
	}

	@Override
    public void dibujar() {
        System.out.println("Dibujando un triangulo");
    }
	
	@Override
	public int superficie() {
		int result = (this.puntoX * this.puntoY)/2;
		return result;
	}
}