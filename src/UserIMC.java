import java.util.Scanner;

public class UserIMC {
    double usersNum;

    public UserIMC(double numero){
        this.usersNum=numero;
    }
    Scanner sc = new Scanner(System.in);

    public void getImc(){
        for(int i = 1; i<=this.usersNum; i++){
            double weight = sc.nextDouble();
            double height = sc.nextDouble();

            double imc = (weight/Math.pow(height,2));
            System.out.print(String.format("%.2f",imc));
            System.out.print(" ");
        }
    }
}
