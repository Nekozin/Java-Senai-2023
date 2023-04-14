import java.util.Scanner;

public class quadrado {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int lado;

        System.out.println("Insira o lado do quadrado: ");
        lado=sc.nextInt();

        int area=lado*lado;

        System.out.println("Á area do quadrado é: "+area);
        sc.close();
    
    }

}