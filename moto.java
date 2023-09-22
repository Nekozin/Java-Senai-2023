public class moto {

    //Criação dos atributos
    int cilindradas;
    String combustivel;
    boolean ligada;
    double velocidadeMax=30;
    double velocidadeAtual;
    double velocidadeAtualizada;

    //Criação dos métodos (ações)

    void ligar(){
        ligada=true;
        System.out.println("A moto está ligada");
    }

    void desligar(){
        ligada=false;
        System.out.println("A moto está desligada");
    }

    void buzinar(){
        System.out.println("BIBI!!!!!!!!!!!!");
    }

    int acelerar(double quantidade){
        velocidadeAtualizada=velocidadeAtual+quantidade;
        velocidadeAtual=velocidadeAtualizada;
        if(velocidadeAtual>velocidadeMax){
            System.out.println("Quebra tua cara, não a moto");
            System.out.println(" ");
            return 0;
        } else{
            System.out.println("Continue assim");
            System.out.println(" ");
            return 1;
        }
    }
}