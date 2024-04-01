import java.util.Date;

public class Conta {

    //atributos
    int numero;
    Cliente dono;
    double saldo;
    double limite;
    Operacao[] operacoes = new Operacao[1000];
    int indice;

    //metodos
    boolean saca (double valor){
        if (this.saldo < valor){
            return false;
        }
        else {
            this.saldo = this.saldo - valor;
            operacoes[indice]= new Operacao('s',valor);
            indice++;
            return true;
        }
    }

    void deposita (double quantidade){
        this.saldo += quantidade;
        operacoes[indice]= new Operacao('v',quantidade);
        indice++;
    }

    boolean transfere (Conta destino , double valor){
        boolean retirou = this.saca(valor);
        if (!retirou){
            // não deu pra sacar!
            return false ;
        }
        else {
            destino.deposita(valor);
            return true ;
        }
    }

    void imprimir(){
        System.out.println("Nome: " + this.dono.Nome);
        System.out.println("CPF: " + this.dono.CPF);
        System.out.println("Endereço: " + this.dono.Endereco);
        System.out.println("Idade: " + this.dono.Idade);
        System.out.println("Sexo: " + this.dono.Sexo);
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("Limite: " + this.limite);
    }

    void extrato(){
        for(int i=0;i<indice;i++){
            System.out.print(operacoes[0].data);
            System.out.print(operacoes[0].tipo);
            System.out.println(operacoes[0].valor);

        }
    }
    public Conta(){
        indice = 0;
    }

}