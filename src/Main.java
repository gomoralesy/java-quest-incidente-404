import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre: ");
        String nombre = scanner.next();
        System.out.println("Ingrese carrera: ");
        String carrera = scanner.next();
        System.out.println("Ingrese edad: ");
        int edad = scanner.nextInt();

        Estudiante estudiante = new Estudiante(nombre, carrera, edad);

        if (edad < 18) {
            System.out.println("Estudiante menor de edad.");
        } else if (edad < 25) {
            System.out.println("Estudiante joven.");
        } else {
            System.out.println("Estudiante adulto.");
        }

        estudiante.mostrarInformacion();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Estudiante registrado: " + i);
        }
    }
}
