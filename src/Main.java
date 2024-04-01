public class Main {
    public static void main(String[] args){

        //exemplo de uso da função imprimir()
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

    }
}