import java.util.Scanner;

public class ExerciseMain1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        UserIMC usuario = new UserIMC(num);
        usuario.getImc();
    }
}
