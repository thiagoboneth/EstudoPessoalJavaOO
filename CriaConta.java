public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.titular = "Thiago";
        primeiraConta.agencia = 1020;
        primeiraConta.numero = 304050;
        primeiraConta.saldo = 1000.00;

        primeiraConta.depositar(1000);

        System.out.println(primeiraConta.titular);
        System.out.println("Cliente " + primeiraConta.titular + " Saldo " + primeiraConta.saldo);

        primeiraConta.sacar(500);

        System.out.println(primeiraConta.saldo);
    }
}
