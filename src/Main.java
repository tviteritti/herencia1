import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcion;
		char respuesta;
		
	
			do {
				System.out.println("calcular el area de un:\n1-Rectangulo\n2-Triangulo");
				opcion=teclado.nextInt();
				switch (opcion) {
				case 1:
					areaRectangulo();
					break;
				case 2:
					areaTriangulo();
					break;
				default:
					System.out.println("error");
					break;
				}
				System.out.print("Desea calcular otra area(s/n)");
				respuesta=teclado.next().charAt(0);
			} while (respuesta=='s' || respuesta=='S');
				mostrarResultados();

	}
	
	public static void areaRectangulo() {
		System.out.println("ingrese el primer lado");
		int a =teclado.nextInt();
		System.out.println("ingrese el segundo lado");
		int b =teclado.nextInt();
		Rectangulo r = new Rectangulo(a, b);
		poligono.add(r);
		
	}
	public static void areaTriangulo() {
		System.out.println("ingrese el primer lado");
		int a =teclado.nextInt();
		System.out.println("ingrese el segundo lado");
		int b =teclado.nextInt();
		System.out.println("ingrese el tercero lado");
		int c =teclado.nextInt();
		Triangulo t = new Triangulo(a, b, c);
		poligono.add(t);
		
	}
	public static void mostrarResultados() {
		
		for (Poligono poligono2 : poligono) {
			System.out.println(poligono2.toString()+"\nArea: "+poligono2.area()+"\n");
			
		}
		
	}

}
