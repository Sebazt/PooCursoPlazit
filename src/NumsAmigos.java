import java.util.Scanner;

public class NumsAmigos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int d = Integer.toString(num).length(); //dimensión de los numeros una vez se convierten en string
        int total = 0;

        if(d>3){
            for (int i = 0 ; i< d; i++){
                String numero = String.valueOf(Integer.toString(num).charAt(i));
                System.out.println(numero);
                total+=Integer.parseInt(numero);
            }
        }
        System.out.println(total);



        int num2 = sc.nextInt();
        int d2 = Integer.toString(num2).length();
        int total2 = 0;

        if(d2>3){
            for (int j = 0 ; j < d2; j++){
                String numero2 = String.valueOf(Integer.toString(num2).charAt(j));
                total2+=Integer.parseInt(numero2);
            }
        }
        System.out.println(total2);


        if(total == total2){
            System.out.println("AMIGOS");
        }else{
            System.out.println("NO AMIGOS");
        }
    }
}
