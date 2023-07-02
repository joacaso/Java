package javaVI;

public class rectangulo extends FiguraGeometrica {

	public rectangulo(int puntoX, int puntoY) {
		super(puntoX, puntoY);
	}

	@Override
	public void dibujar() {
		System.out.println("Dibujando un rectangulo");
	}

	@Override
	public int superficie() {
		int result = this.puntoX * this.puntoY;
		return result;
	}
}