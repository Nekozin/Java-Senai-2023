/*Programa que calcula média dos alunos */

//importação necessária para utilizar o Scanner

//SEMPRE PRECISO COLOCAR A LINHA ABAIXO
import java.util.Scanner; //Para que eu possa trabalhar com entrada de dados via teclado

public class media {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); //Sempre escrever assim 
        String nome;
        int rm;
        double nota1, nota2, nota3, media; //Declaração das variáveis

        System.out.println("Digite a 1ª nota: ");
        nota1=sc.nextDouble();
        System.out.println("Digite a 2ª nota: ");
        nota2=sc.nextDouble();
        System.out.println("Digite a 3ª nota: ");
        nota3=sc.nextDouble();
        System.out.println("Digite o RM: ");
        rm=sc.nextInt();
        System.out.println("Digite o nome do aluno: ");
        nome=sc.next();
        media=(nota1+nota2+nota3)/3;
        System.out.println("O aluno "+nome+" com a RM "+rm+" obteve média: "+media);
        sc.close();
        
    }
    
}
