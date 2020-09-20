
public class Triangulo extends Poligono {

	private int lado_uno;
	private int lado_dos;
	private int lado_tres;
	
		public Triangulo(int lado_uno, int lado_dos, int lado_tres) {
		super(3);
		this.lado_uno = lado_uno;
		this.lado_dos = lado_dos;
		this.lado_tres = lado_tres;
	}
	public double area() {
		double p = (double)((lado_uno+lado_dos+lado_tres)/2);
		return (double)(p*(p-lado_uno)*(p-lado_dos)*(p-lado_tres));
	}
	
}
