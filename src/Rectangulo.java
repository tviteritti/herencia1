
public class Rectangulo extends Poligono {

	private double lado_uno;
	private double lado_dos;
	
	public Rectangulo(double lado_uno, double lado_dos) {
		super(2);
		this.lado_uno = lado_uno;
		this.lado_dos = lado_dos;
	}

	public double getLado_uno() {
		return lado_uno;
	}
	public double getLado_dos() {
		return lado_dos;
	}

	@Override
	public String toString() {
		return "\n"+super.toString() +"\nlado_uno= " + lado_uno + "\nlado_dos= " + lado_dos ;
	}

	@Override
	public double area() {
		return lado_uno*lado_dos;
	}
	
	
}
