package FigurasGeometricas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        FiguraGeometrica circulo = new Circulo(radio);

        System.out.print("Ingrese el largo del rectángulo: ");
        double largo = scanner.nextDouble();
        System.out.print("Ingrese el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();
        FiguraGeometrica rectangulo = new Rectangulo(largo, ancho);

        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        FiguraGeometrica cuadrado = new Cuadrado(lado);

        System.out.print("Ingrese la base del triángulo rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo rectángulo: ");
        double altura = scanner.nextDouble();
        FiguraGeometrica trianguloRectangulo = new TrianguloRectangulo(base, altura);
        double hipotenusa = Math.sqrt(base * base + altura * altura);

        System.out.println("\nCírculo:");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        System.out.println("\nRectángulo:");
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());

        System.out.println("\nCuadrado:");
        System.out.println("Área: " + cuadrado.calcularArea());
        System.out.println("Perímetro: " + cuadrado.calcularPerimetro());

        System.out.println("\nTriángulo Rectángulo:");
        System.out.println("Área: " + trianguloRectangulo.calcularArea());
        System.out.println("Perímetro: " + trianguloRectangulo.calcularPerimetro());
        System.out.println("Hipotenusa: " + hipotenusa);

        scanner.close();
    }
}
