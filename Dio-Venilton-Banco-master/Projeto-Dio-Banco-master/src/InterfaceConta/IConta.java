package InterfaceConta;

import ProjetoBancarioPOO.Conta.Conta;

public interface IConta {

     void sacar(double valor);


     void depositar(double valor);


     void tranferir(double valor, Conta contaDestino);

     void statusImprimirExtrato();


}
