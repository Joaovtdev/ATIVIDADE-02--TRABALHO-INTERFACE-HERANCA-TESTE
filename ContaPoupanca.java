package br.unipar;

public class ContaPoupanca extends HerancaContaBancaria {

    /*
        1 - Criar implementação do saque;
        2 - Quando fizer o saque deve cobrar uma taxa de R$ 5,00
        3 - Implementar teste unitário
            - Deposito
            - Saque Sucesso
            - Saque Invalido
     */

    @Override
    public boolean saque(Double valor) {
        if (saldo >= valor + 5) {
            saldo -= (valor + 5);
            return true;
        }
        return false;
    }

}
