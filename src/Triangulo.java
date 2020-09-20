
public class Triangulo extends Poligono {

	private double lado_uno;
	private double lado_dos;
	private double lado_tres;
	
		public Triangulo(double lado_uno, double lado_dos, double lado_tres) {
		super(3);
		this.lado_uno = lado_uno;
		this.lado_dos = lado_dos;
		this.lado_tres = lado_tres;
	}
		
	public double getLado_uno() {
			return lado_uno;
		}

		public double getLado_dos() {
			return lado_dos;
		}

		public double getLado_tres() {
			return lado_tres;
		}

	@Override
		public String toString() {
			return "\n"+super.toString()+ "\nlado_uno= " + lado_uno + "\nlado_dos= " + lado_dos + "\nlado_tres= " + lado_tres;
		}

	@Override
	public double area() {
		double p = (lado_uno+lado_dos+lado_tres)/2;
		return Math.sqrt(p*(p-lado_uno)*(p-lado_dos)*(p-lado_tres));
	}
	
}
