import java.util.Scanner;

public class ExerciseMain3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int weeks = sc.nextInt();
    Insecto insecto = new Insecto(weeks);
    insecto.cantidadInsectos(weeks);
        System.out.println("Este es el total de acuerdo al número de semanas "+weeks);
    insecto.getTotal();
    }
}
