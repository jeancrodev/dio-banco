package Modelos;
import Interface.IContas;

public abstract class Contas extends Pessoa implements IContas{

    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Contas(){
        super();
        saldo = 0;
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public void sacar(){
        double valor;
        System.out.println("Insira o valor de saque");
        valor = teclado.nextDouble();
        if(valor > this.saldo){
            System.out.println("Saldo insuficiente");
            System.out.println("Seu novo saldo é de R$" + this.saldo);
        }else{
            this.saldo -= valor;
            System.out.println("Seu novo saldo é de R$" + this.saldo);
        }
    }

    public double transferirOrigem(double valor){
        valor = 0;
        System.out.println("Insira o valor de transferência");
        valor = teclado.nextDouble();
        if(valor > this.saldo){
            System.out.println("Saldo insuficiente");
            System.out.println("Seu novo saldo é de R$" + this.saldo);
        }else{
            this.saldo -= valor;
            System.out.println("Seu novo saldo é de R$" + this.saldo);
        }return valor;
    }

    public void transferirDestino(double valor){
        this.saldo += valor;
        System.out.println("Transferência realizada");
    }
    
    public void depositar(){
        double valor;
        System.out.println("Insira o valor de depósito");
        valor = teclado.nextDouble();
        this.saldo += valor;
        System.out.println("Seu novo saldo é de R$" + saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirInfosComuns(){
        System.out.println("Banco J");
    }
   
}
