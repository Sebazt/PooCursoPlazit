import java.util.Scanner;

public class PpalPrimo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int inicio, fin, contador = 0;
    System.out.println("un numero inicial :");
    inicio = sc.nextInt();
    System.out.println("un numero final :");
    fin = sc.nextInt();

    NumeroPrimo num1 = new NumeroPrimo();


    for(int i = inicio; i <= fin; i++){
        boolean total = num1.esPrimo(i);
        if(total){
            contador++;
            //System.out.print(String.valueOf(i) + ",");
            System.out.print(i+" ");
            }
        }
        System.out.printf("\nTotal: %d", contador);
    }
}
