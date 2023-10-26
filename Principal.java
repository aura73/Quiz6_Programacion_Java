import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/**
 * primero le pedimos al usuario que escriba el nombre de la figura, el color y el tipo de figura
 */

        System.out.print("Digite el nombre de la figura: ");
        String nombre = scanner.nextLine();


        System.out.print("Digite el color de la figura: ");
        String color = scanner.nextLine();


        System.out.println("Digite el tipo de figura: \n 1:Circulo \n 2:Rectángulo \n 3:Triángulo ");
        int tipoFigura = scanner.nextInt();

        // se crean variables de swich
        double radio, lado1, lado2, base, altura;

        switch (tipoFigura) {
            case 1: // Circulo
                System.out.print("Digite el radio del Circulo: ");
                radio = scanner.nextDouble();
                //crea el objeto circulo con los atributos necesarios
                Circulo circulo = new Circulo(nombre, color, radio);

                System.out.println("Área del Círculo: " + circulo.obtenerArea());
                System.out.println("Perímetro del Circulo: " + circulo.obtenerPerimetro());
                break;

            case 2: // Rectángulo
                System.out.print("Digite el valor del lado1 del rectángulo: ");
                lado1 = scanner.nextDouble();
                System.out.print("Digite el valor del lado2 del rectángulo: ");
                lado2 = scanner.nextDouble();
                //crea el objeto circulo con los atributos necesarios
                Rectangulo rectangulo = new Rectangulo(nombre, color, lado1, lado2);

                System.out.println("area del rectángulo: " + rectangulo.obtenerArea());
                System.out.println("Perímetro del rectángulo: " + rectangulo.obtenerPerimetro());
                break;

            case 3: // Triangulo
                System.out.print("Digite el valor de la base del triangulo: ");
                base = scanner.nextDouble();
                System.out.print("Digite el valor de la altura del triángulo: ");
                altura = scanner.nextDouble();
                //crea el objeto circulo con los atributos necesarios
                Triangulo triangulo = new Triangulo(nombre, color, base, altura);

                System.out.println("Digiterea del triángulo: " + triangulo.obtenerArea());
                System.out.println("Perímetro del triángulo: " + triangulo.obtenerPerimetro());
                break;

            default:
                System.out.println("Opción no válida.");
        }

    }
}