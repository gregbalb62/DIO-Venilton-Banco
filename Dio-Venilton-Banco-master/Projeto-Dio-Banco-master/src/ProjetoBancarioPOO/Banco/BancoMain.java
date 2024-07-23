package ProjetoBancarioPOO.Banco;

import ProjetoBancarioPOO.Cliente.Cliente;
import ProjetoBancarioPOO.Conta.Conta;
import ProjetoBancarioPOO.Conta.ContaCorrente;
import ProjetoBancarioPOO.Conta.ContaPoupanca;

public class BancoMain {
    public static void main(String[] args) {

        Cliente val = new Cliente();
        val.setNome("Valdemar Teider");

        Conta cc = new ContaCorrente(val);
        cc.depositar(1500.0);

        Conta poupanca = new ContaPoupanca(val);

        cc.tranferir(500.0, poupanca);

       cc.statusImprimirExtrato();
        System.out.println();
       poupanca.statusImprimirExtrato();


    }
}
