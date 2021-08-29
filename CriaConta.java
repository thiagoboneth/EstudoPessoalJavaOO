public class CriaConta {
    public static void main(String[] args) {

//instanciamento de contas

        Conta contaDoThiago = new Conta(2460,627898);
        Conta contaDaCamila = new Conta(5920,678765);

        contaDoThiago.setTitular(new ContaCliente("Thiago","542.099.234-23","Programador"));
        contaDaCamila.setTitular(new ContaCliente("Camila","726.098.872-30","Professora"));

//movimentos das contas

        contaDoThiago.depositar(1000);
        System.out.println(contaDoThiago.getSaldo());

        contaDoThiago.transfere(500, contaDaCamila);
        System.out.println(contaDaCamila.getSaldo());

        contaDaCamila.sacar(300);

        System.out.println("O banco tem o total de " + Conta.getTotalContasCriadas() + " contas criadas com sucesso!");
    }
}