public class CriaConta {
    public static void main(String[] args) {
        ContaCliente primeiraConta = new ContaCliente();
        primeiraConta.nome = "Thiago Boneth";
        primeiraConta.cpf = "531.082.561-20";
        primeiraConta.profissao = "Programador";

        Conta contaThiago = new Conta();
        contaThiago.depositar(100);

        contaThiago.titular = primeiraConta;
        System.out.println(contaThiago.titular.nome);

    }
}