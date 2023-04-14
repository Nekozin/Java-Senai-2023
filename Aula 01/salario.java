import java.util.Scanner;

public class salario {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String nome, endereco, telefone;
        int idade, horat, vph;

        System.out.println("Para se cadastrar digite seu nome: ");
        nome=sc.nextLine();
        System.out.println("Endereço: ");
        endereco=sc.nextLine();
        System.out.println("Idade: ");
        idade=sc.nextInt();
        System.out.println("Telefone (com DDD local): ");
        telefone=sc.next();
        System.out.println("Horas trabalhadas: ");
        horat=sc.nextInt();
        System.out.println("Valor recebido por hora: ");
        vph=sc.nextInt();

        int salario=vph*horat;

        System.out.println("O funcionário "+nome+" está recebendo atualmente "+salario+" por hora.");
        sc.close();
    
}

}
