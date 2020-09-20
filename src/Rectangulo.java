
public class Rectangulo extends Poligono {

	private int lado_uno;
	private int lado_dos;
	
	public Rectangulo(int lado_uno, int lado_dos) {
		super(2);
		this.lado_uno = lado_uno;
		this.lado_dos = lado_dos;
	}

	public int getLado_uno() {
		return lado_uno;
	}
	public int getLado_dos() {
		return lado_dos;
	}

	public double area() {
	
	return (double)lado_uno*lado_dos;
	}
	
	
}
