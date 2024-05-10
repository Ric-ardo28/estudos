public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000, 122, 500);
        System.out.println("Numero da conta : " + contaCorrente.getNumeroConta());
        System.out.println("Saldo atual : " + contaCorrente.getSaldo());
        System.out.println("Limite Cheque especial : " + contaCorrente.getLimiteChequeEspecial());
        System.out.println("---------------------------------------------------------------------");

        contaCorrente.depositar(200);
        System.out.println("saldo apos o deposito :" + contaCorrente.getSaldo());
        System.out.println("saldo + limite do cheque especial : " + (contaCorrente.getSaldo() + contaCorrente.getLimiteChequeEspecial()));
        System.out.println("---------------------------------------------------------------------");

        contaCorrente.sacar(300);
        System.out.println("saldo apos o saque :" + contaCorrente.getSaldo());
        System.out.println("saldo + limite do cheque especial : " + (contaCorrente.getSaldo() + contaCorrente.getLimiteChequeEspecial()));
        System.out.println("---------------------------------------------------------------------");

        contaCorrente.depositar(620);
        System.out.println(contaCorrente.getSaldo());
        System.out.println("saldo + limite do cheque especial : " + (contaCorrente.getSaldo() + contaCorrente.getLimiteChequeEspecial()));
        System.out.println("---------------------------------------------------------------------");

        System.out.println("Conta Corrente: " + contaCorrente.getNumeroConta() );
        contaCorrente.imprimirDados();
        contaCorrente.calculaTaxaJuros(5, 0.05);
        System.out.println("---------------------------------------------------------------------");
        contaCorrente.exibirHistoricoTransacoes();
        System.out.println();

        ContaInvestimento contaInvestimento = new ContaInvestimento(5000, 456, 0.03);

        System.out.println("Conta de Investimento:");
        contaInvestimento.imprimirDados();
        System.out.println("---------------------------------------------------------------------");

        System.out.println("Rendimento conta investimento: " );

        System.out.println(contaInvestimento.calculaTaxaJuros(5,0.08));






    }
}


