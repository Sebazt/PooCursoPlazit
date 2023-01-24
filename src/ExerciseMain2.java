import java.util.Scanner;
import java.text.DecimalFormat;

public class ExerciseMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa cantidad de usuarion");
        int numUser = sc.nextInt();

        User users[] = new User[numUser];

        for (int i = 0; i < numUser; i++) {
            System.out.println("Ingrese el capital de usuario" + (i + 1));
            double capital = sc.nextDouble();
            System.out.println("Ingrese el dia del año para el usuario" + (i + 1));
            int day = sc.nextInt();
            System.out.println("Ingrese interes para el usuario" + (i + 1));
            double entero = sc.nextDouble();
            double dia = (double)day;
            double interes = (capital * entero /100) * ((360-dia)/360);
            System.out.println(interes);
            User user = new User(capital, day, interes);
            users[i] = user;
        }
        double capitalTotal = 0;
        double interesTotal = 0;
        for (int i = 0; i < users.length; i++) {
            capitalTotal += users[i].getCapitalInicial();
            interesTotal += users[i].getInteresesTotales();
        }

        System.out.println(String.format("%.2f",capitalTotal));
        System.out.println(String.format("%.2f",interesTotal));

    }
}
