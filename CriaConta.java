public class CriaConta {
    public static void main(String[] args) {
        Conta contaDoThiago = new Conta();

        contaDoThiago.titular =new ContaCliente();
        System.out.println(contaDoThiago.mostraSaldo());

        contaDoThiago.titular.nome = "Thiago";
        System.out.println(contaDoThiago.titular.nome);
        contaDoThiago.depositar(50);
        System.out.println(contaDoThiago.mostraSaldo());
    }
}