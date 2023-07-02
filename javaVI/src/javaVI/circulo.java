package javaVI;

public class circulo extends FiguraGeometrica {

	public circulo(int puntoX, int puntoY) {
		super(puntoX, puntoY);
	}

	@Override
	public void dibujar() {
		System.out.println("Dibujando un circulo");
	}

	@Override
	public int superficie() {
		int result = this.puntoX * this.puntoY;
		return result;
	}
}