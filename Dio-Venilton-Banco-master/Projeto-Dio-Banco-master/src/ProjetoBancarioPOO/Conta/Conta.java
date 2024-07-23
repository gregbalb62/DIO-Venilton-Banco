package ProjetoBancarioPOO.Conta;

import InterfaceConta.IConta;
import ProjetoBancarioPOO.Cliente.Cliente;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 11;
    private static  int SEQUENCIA = 111;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    // Construtor
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIA++;
        this.cliente= cliente;
    }
     // Métodos
    @Override
    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    // Getter e Setter

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }



    protected void imprimirInformComunsStatus(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
