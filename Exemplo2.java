/*Constante -> Variável em Java em que não posso alterar o valor
 * Usamos a palavra chave FINAL.
 */

public class Exemplo2 {

    public static final int TAXA = 10;
    public static final double PI = 3.14;

    // public -> A constante pode ser acessada em qualquer parte do código
    // static -> Essa constante é compartilhada entre todas as classes do meu programa
    // final -> Não posso alterar o valor

public static void main(String[] args) {
    System.out.println("A taxa da loja é da: "+TAXA+"%");
    System.out.println("PI vale: "+PI);
}    
}