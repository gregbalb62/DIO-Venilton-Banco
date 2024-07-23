package ProjetoBancarioPOO.Conta;

import ProjetoBancarioPOO.Cliente.Cliente;
import ProjetoBancarioPOO.Conta.Conta;

public class ContaPoupanca extends Conta {


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void statusImprimirExtrato() {
        System.out.println("..(='O'=)..Extrato de Conta Poupanca..(='O'=)..");
        super.imprimirInformComunsStatus();
    }

}
