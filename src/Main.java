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
        conta.setDono(cliente);
        conta.setNumero(3737);
        conta.setLimite(9999999.0);
        conta.imprimir();
        System.out.println(' ');
        conta.saca(1000);
        conta.deposita(500);
        conta.imprimir();
        System.out.println(' ');
        conta.extrato();

    }
}