package ProjetoBancarioPOO.Conta;

import ProjetoBancarioPOO.Cliente.Cliente;


public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void statusImprimirExtrato() {
        System.out.println("..( ='o'= )..Extrato Conta Corrente..( = 'o' = )..");
        super.imprimirInformComunsStatus();
    }
}

