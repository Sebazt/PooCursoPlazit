import java.util.Scanner;

public class menorNum {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int data = sc.nextInt();
    int num;
    int menor = 0;
    for(int i = 0; i<data;i++){
        System.out.println("Ingresa un número chamo");
        num = sc.nextInt();
        if(i==0){
            menor = num;
        }else{
            if(num<menor){
              menor = num;
            }
        }

    }
        System.out.println("Menor mmgvo "+menor);


}}