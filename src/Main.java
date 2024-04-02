import java.util.Scanner;

public class Main {

    public static void menu_conta(){
        System.out.println("Menu Inicial");
        System.out.println("**************************************************");
        System.out.println("(1) Criar Conta");
        System.out.println("(2) Entrar na Conta");
        System.out.println("(0) Sair");
    }
    public static void main(String[] args){
        Conta[] conta = new Conta[1000];
        int N=5;
        int i=0;
        while(N!=0){
            N=5;
            menu_conta();
            while(N!=1 && N!=2 && N!=0){
                Scanner n = new Scanner(System.in);
                N = n.nextInt();
                if(N!=1 && N!=2 && N!=0){
                    System.out.println("Erro. Tente Novamente:");
                }
            }
            switch(N){
                case 0:
                    System.out.printf("Finalizando");
                    break;
                case 1:
                    //caso1
                    conta[i] = new Conta();
                    conta[i].dono = new Cliente();
                    System.out.println("Insira seu nome completo:");
                    Scanner n1 = new Scanner(System.in);
                    conta[i].dono.Nome = n1.next();
                    System.out.println("Insira seu CPF:");
                    Scanner n2 = new Scanner(System.in);
                    conta[i].dono.CPF = n2.next();
                    System.out.println("Insira seu endereço completo:");
                    Scanner n3 = new Scanner(System.in);
                    conta[i].dono.Endereco = n3.nextLine();
                    System.out.println("Insira sua idade:");
                    Scanner n4 = new Scanner(System.in);
                    conta[i].dono.Idade = n4.nextInt();
                    System.out.println("Insira seu sexo (m ou f):");
                    Scanner n5 = new Scanner(System.in);
                    conta[i].dono.Sexo = n5.next().charAt(0);
                    conta[i].saldo = 0;
                    conta[i].numero = 1111 + i;
                    conta[i].limite = 1000;
                    System.out.println("Conta Criada.");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    conta[i].imprimir();
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    i++;
                    break;
                case 2:
                    System.out.println("Insira o número da conta:");
                    Scanner l = new Scanner(System.in);
                    i= l.nextInt() - 1111;
                    System.out.printf("");
                    int m=1;
                    while(m!=0){
                        conta[i].menu_conta();
                        Scanner n = new Scanner(System.in);
                        m = n.nextInt();
                        switch(m){
                            case 1:
                                System.out.println("Qual a quantia a ser depositada?");
                                Scanner m1 = new Scanner(System.in);
                                float N1 = m1.nextFloat();
                                conta[i].deposita(N1);
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                break;
                            case 2:
                                System.out.println("Qual o valor a ser sacado?");
                                Scanner m2 = new Scanner(System.in);
                                float N2 = m2.nextFloat();
                                if(conta[i].saca(N2)){
                                    System.out.println("Feito.");
                                }else{
                                    System.out.println("Saldo insuficiente.");
                                }
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                break;
                            case 3:
                                System.out.println("Insira o número da conta para a qual você irá transferir:");
                                Scanner i3 = new Scanner(System.in);
                                int I3 = i3.nextInt()-1111;
                                System.out.println("Qual o valor a ser transferido?");
                                Scanner m3 = new Scanner(System.in);
                                float N3 = m3.nextFloat();
                                if(conta[i].transfere(conta[I3],N3)){
                                    System.out.println("Feito.");
                                }else{
                                    System.out.println("Saldo insuficiente.");
                                }
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                break;
                            case 4:
                                conta[i].imprimir();
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                break;
                            case 5:
                                conta[i].extrato();
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                break;
                            case 0:
                                System.out.println("Saindo.");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                break;
                            default:
                                System.out.println("Erro Grotesco.");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("Erro Grotesco.");
                    break;
            }

        }
    }
}


/*
        Cliente cliente = new Cliente();
        cliente.Nome = "Maria";
        cliente.CPF = "137.420.420-69";
        cliente.Endereco = "Brasil, Minas Gerais, Belo Horizonte, Bairro X, Rua Y, Número Z";
        cliente.Idade = 18;
        cliente.Sexo = 'f';
        Conta conta = new Conta();
        conta.dono = cliente;
        conta.saldo = 150000000.20;
        conta.numero = 3737;
        conta.limite =9999999.0;
        conta.imprimir();
        System.out.println(' ');
        conta.saca(1000);
        conta.deposita(500);
        conta.imprimir();
        System.out.println(' ');
        conta.extrato();*/