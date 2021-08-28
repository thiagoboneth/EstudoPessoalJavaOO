public class CriaConta {
    public static void main(String[] args) {
//instanciamento de contas
        Conta contaDoThiago = new Conta();
        Conta contaDaCamila = new Conta();


        contaDoThiago.setTitular(new ContaCliente());
        contaDoThiago.getTitular().setNome("Thiago");
        contaDoThiago.getTitular().setCpf("542.099.234-23");
        contaDoThiago.getTitular().setProfissao("Programador");
        contaDoThiago.setAgencia(2350);
        contaDoThiago.setNumero(456789);

        contaDaCamila.setTitular(new ContaCliente());
        contaDaCamila.getTitular().setNome("Camila");
        contaDaCamila.getTitular().setCpf("726.098.872-30");
        contaDaCamila.getTitular().setProfissao("Professora");
        contaDaCamila.setAgencia(2560);
        contaDaCamila.setNumero(782987);

//movimentos das contas

        contaDoThiago.depositar(1000);
        System.out.println(contaDoThiago.getSaldo());

        contaDoThiago.transfere(500, contaDaCamila);
        System.out.println(contaDaCamila.getSaldo());

        contaDaCamila.sacar(300);

    }
}