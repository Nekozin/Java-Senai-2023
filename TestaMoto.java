import java.util.Scanner;

public class TestaMoto {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean comb=true, opc=true, opc2=true, red=true;
        String[] palavrasChave = {"Alcool", "Gasolina","alcool","gasolina"};

        moto yamaha=new moto();
        yamaha.velocidadeMax=120;
        yamaha.velocidadeAtual=25;
        yamaha.ligar();
        System.out.println("A velocidade atual da yamaha é "+yamaha.velocidadeAtual+" km/h");
        System.out.println(" ");

        moto kawasaki=new moto();
        kawasaki.velocidadeAtual=0;
        kawasaki.velocidadeMax=240;
        
        moto honda=new moto();
        honda.velocidadeAtual=0;
        honda.velocidadeMax=160;

        do{
            System.out.println("Qual moto quer ligar? (1-Kawasaki, 2-Honda)");
            int motoca=sc.nextInt();

            if(motoca==1){
                kawasaki.ligar();
                do {
                    System.out.println("Qual o combustível utilizado pela sua kawasaki? (Alcool ou Gasolina)");
                    kawasaki.combustivel = sc.next();
                    comb = false;
                    boolean palavraValida = false;
                    System.out.println("A opção escolhida foi " + kawasaki.combustivel + "? (1=sim, 2=não)");
                    int resp = sc.nextInt();
                    System.out.println(" ");
                    for (String palavra : palavrasChave) {
                        if (kawasaki.combustivel.equalsIgnoreCase(palavra)) {

                            if (resp == 2) {
                                comb = true;
                            } else {
                                comb = false;
                                palavraValida = true;
                                break;
                            }
                        }
                    } if (!palavraValida) {
                        System.out.println("Escolha uma opção válida");
                        System.out.println(" ");
                        comb=true;
                    }
                } while (comb);

                do{
                    System.out.println("O que gostaria de fazer agora?:");
                    System.out.println("1-acelerar a kawasaki");
                    System.out.println("2-buzinar");
                    System.out.println("3-desligar a kawasaki");
                    int esc=sc.nextInt();

                    if(esc==1){
                        System.out.println("A velocidade atual da Kawasaki é "+kawasaki.velocidadeAtual+"km/h");
                        System.out.println("O quanto gostaria de acelerar? (Em km/h)");
                        double vel=sc.nextDouble();
                        kawasaki.acelerar(vel);
                        System.out.println("A velocidade atual da Kawasaki é "+kawasaki.velocidadeAtual+"km/h");
                        if(kawasaki.acelerar(vel)==0){
                            System.out.println("A sua Kawasaki parou");
                            kawasaki.desligar();
                            opc=false;
                            red=false;
                        }
                        System.out.println(" ");
                    } if(esc==2){
                        kawasaki.buzinar();
                        System.out.println(" ");
                    } if(esc==3){
                        kawasaki.desligar();
                        opc=false;
                        System.out.println(" ");
                    } else{ 
                        System.out.println("Escolha alguma das opções, por favor");
                    }
                }while(opc);
            }

            if(motoca==2){
                honda.ligar();
                do {
                    System.out.println("Qual o combustível utilizado pela sua kawasaki? (Alcool ou Gasolina)");
                    kawasaki.combustivel = sc.next();
                    comb = false;
                    boolean palavraValida = false;
                    System.out.println("A opção escolhida foi " + kawasaki.combustivel + "? (1=sim, 2=não)");
                    int resp = sc.nextInt();
                    System.out.println(" ");
                    for (String palavra : palavrasChave) {
                        if (kawasaki.combustivel.equalsIgnoreCase(palavra)) {

                            if (resp == 2) {
                                comb = true;
                            } else {
                                comb = false;
                                palavraValida = true;
                                break;
                            }
                        }
                    } if (!palavraValida) {
                        System.out.println("Escolha uma opção válida");
                        System.out.println(" ");
                        comb=true;
                    }
                } while (comb);

                do{
                    System.out.println("O que gostaria de fazer agora?:");
                    System.out.println("1-acelerar a honda");
                    System.out.println("2-buzinar");
                    System.out.println("3-desligar a honda");
                    int esc2=sc.nextInt();

                    if(esc2==1){
                        System.out.println("A velocidade atual da honda é "+honda.velocidadeAtual+"km/h");
                        System.out.println("O quanto gostaria de acelerar? (Em km/h)");
                        double vel2=sc.nextDouble();
                        honda.acelerar(vel2);
                        System.out.println("A velocidade atual da honda é "+honda.velocidadeAtual+"km/h");
                        if(honda.acelerar(vel2)==0){
                            System.out.println("A sua Honda parou");
                            honda.desligar();
                            opc2=false;
                            red=false;
                        }
                        System.out.println(" ");
                    } if(esc2==2){
                        honda.buzinar();
                        System.out.println(" ");
                    } if(esc2==3){
                        honda.desligar();
                        opc2=false;
                    }
                }while(opc2);
            }}while(red);
    }
}