package javaVI;

public class FiguraGeometrica {

	protected int puntoX;
	protected int puntoY;

	public FiguraGeometrica(int puntoX, int puntoY) {
		super();
		this.puntoX = puntoX;
		this.puntoY = puntoY;
	}

	public int getPuntoX() {
		return puntoX;
	}

	public void setPuntoX(int puntoX) {
		this.puntoX = puntoX;
	}

	public int getPuntoY() {
		return puntoY;
	}

	public void setPuntoY(int puntoY) {
		this.puntoY = puntoY;
	}

	public void dibujar() {
	}

	public int superficie() {
		return 0;
	}

	public String detalle() {
		return "\nSuperficie: " + superficie() ;
	}
}
