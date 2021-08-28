public class Conta {
    double saldo;
    int agencia;
    int numero;
    ContaCliente titular;

    public void depositar(double valor){
        this.saldo += valor;
    }



    public boolean sacar(double valorSaque){
        if (this.saldo >= valorSaque){
            System.out.println("Saque efetuado com sucesso no valor de $" + valorSaque);
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
            System.out.println("Saldo restante de " + this.saldo);
            return true;
        }else {
            System.out.println("Saldo insuficiente");
            return false;
        }

    }
}