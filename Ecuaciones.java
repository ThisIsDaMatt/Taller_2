import java.util.Scanner;

public class Ecuaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        double z;
        int opcion;

        System.out.print("Ingrese un valor para x: ");
        x = sc.nextDouble();
        System.out.print("Ingrese un valor para z: ");
        z = sc.nextDouble();
        System.out.print("Elija una ecuación:" + "\n" + "- Ecuación 1" + "\n" + "- Ecuación 2");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                y = (3*x)/((1)+((3*x)/(3*(z)*(z)+(2)))) / (1)/(((1)/(1+z))+(3*(x)*(x))+(2*z)+(3));      
                break;
            case 2:
                break;
            default:
                System.out.println("Opción inválida, intente de nuevo.");
        }
    }    
}
