// Tipos de variáveis em Java
/*
 * String -> Armazena texto
 * char -> Armazena uma única letra
 * int ->Números inteiros
 * float -> Números decimais
 * double -> Números decimais. Maior precisão.
 */
 /* Regras para criação de váriavel
 * Toda váriavel DEVE começar com letra minúscula
 * Não pode haver espaço no nome da váriavel
 * nomeAluno, enderecoCliente, produtoAdquirido
 */



 public class Exemplo01{
    
    public static void main(String[] args) {

        String nome = "Dimas Vianna";
        int idade = 16;
        boolean chuva = true; //Em váriaveis booleanas eu uso true ou false
        char letra = 'D'; //Todo char deve estar com aspas simples ''
        double salario = 7673.74;
        float altura = (float) 1.80; //Estou convertendo um double para float
        
        System.out.println("Meu nome é: " + nome);
        System.out.println("Minha idade é: " + idade);
        System.out.println("Está chovendo? " + chuva);
        System.out.println("Inicial do meu nome: " + letra);
        System.out.println("Meu salário é: " + salario);
        System.out.println("Eu tenho: " + altura + "metros");
    }
 }