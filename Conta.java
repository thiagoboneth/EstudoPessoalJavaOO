public class Conta {
    private double saldo;
    private int agencia;
    private  int numero;
    private ContaCliente titular;


    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Deposito feito com sucesso na conta "+ this.titular.getNome() + " no valor de " + valor);
    }



    public boolean sacar(double valorSaque){
        if (this.saldo >= valorSaque){
            System.out.println("Saque efetuado com sucesso no valor de $" + valorSaque + " dinheiro sacado da conta de " + this.titular.getNome());
            this.saldo -= valorSaque;
            return true;
        } else {
            System.out.println("Saldo indisponivel para saque, saque disponivel no valor de $" + this.saldo + " reais");
            return false;
        }
    }
    public boolean transfere(double valorTransferido,Conta contaDestino){
        if (this.saldo >= valorTransferido){
            this.saldo -= valorTransferido;
            contaDestino.depositar(valorTransferido);
            System.out.println("Transferencia feita com sucesso no valor de "+ valorTransferido);
            System.out.println("Transferencia feita da conta de " + this.titular.getNome() + " para conta de " + contaDestino.titular.getNome());
            System.out.println("Saldo restante de " + this.saldo);
            return true;
        }else {
            System.out.println("Saldo insuficiente");
            return false;
        }

    }

    public ContaCliente getTitular() {
        return titular;
    }

    public void setTitular(ContaCliente titular) {
        this.titular = titular;
    }

    public double getSaldo(){
        return this.saldo;
    }
}