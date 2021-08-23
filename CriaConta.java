public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.titular = "Thiago";
        primeiraConta.agencia = 1020;
        primeiraConta.numero = 304050;
        primeiraConta.saldo = 1000.00;

        System.out.println(primeiraConta.titular);
    }
}
