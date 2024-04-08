import java.util.Date;

public class Conta {

    //atributos
    private int totalContas=0;
    private int numero;
    private Cliente dono;
    private double saldo = 0;
    private double limite;
    Operacao[] operacoes = new Operacao[1000];
    private int indice;

    //metodos


    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public Cliente getDono() {
        return this.dono;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return this.limite;
    }

    public double getSaldo() {
        return this.saldo;
    }

    boolean saca (double valor){
        if (this.saldo < valor){
            return false;
        }
        else {
            this.saldo = this.saldo - valor;
            operacoes[indice]= new Operacao('s',valor);totalContas++;
            indice++;
            return true;
        }
    }

    void deposita (double quantidade){
        this.saldo += quantidade;
        operacoes[indice]= new Operacao('d',quantidade);
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
        System.out.println("Informações");
        System.out.println("**********************************");
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
        System.out.println("Extrato");
        System.out.println("**********************************");
        for(int i=0;i<indice;i++){
            System.out.print(operacoes[i].getDate());
            System.out.print(' ');
            System.out.print(operacoes[i].getTipo());
            System.out.print(' ');
            System.out.println(operacoes[i].getValor());

        }
    }
    public Conta(){
        indice = 0;
        totalContas++;
    }

}