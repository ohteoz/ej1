import java.sql.ClientInfoStatus;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Creación de Alumno");

        System.out.println("¿Cuantos alumnos quieres crear?: ");
        int numAlumnos = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < numAlumnos; i++) {

        }


        System.out.println("Introduce el curso: ");
        String curso = sc.nextLine();

        System.out.println("Introduce el numero del curso: ");
        int numero = sc.nextInt();

        System.out.println("Introduce la capacidad del curso: ");
        int capacidadMax = sc.nextInt();

        Clase c1 = new Clase(curso, numero, capacidadMax);
        alumno a1 = new alumno("Teo", "Pons Millán",18, "35602872E", c1);
        System.out.println(a1);
        System.out.println(a1.getClase().getNumero());



    }

}