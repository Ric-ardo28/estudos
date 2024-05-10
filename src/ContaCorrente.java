public class ContaCorrente extends ContaBancaria{
    protected double limiteChequeEspecial;

    public ContaCorrente(double saldo, int numeroConta, double limiteChequeEspecial) {
        super(saldo, numeroConta);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public double calcularTaxa() {
        double taxa = 0.05;
        int anos = 5;
        return getSaldo()*taxa *anos* anos;
    }

    @Override
    public void imprimirDados() {
        System.out.println("saldo: " + getSaldo());
        System.out.println("limite cheque especial: " + limiteChequeEspecial);
    }

    public void depositar(double valor){
        setSaldo(getSaldo() + valor);
        System.out.println("valor depositado: " + valor);
        adicionarTransacao("Deposito realizado no valor: " + valor);
    }
    public void sacar(double valor){
        setSaldo(getSaldo() - valor);
        System.out.println("valor sacado: " + valor);
        adicionarTransacao("Saque realizado no Valor: " + valor);
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    public double calculaTaxaJuros(int anos, double taxaJuros) {
        System.out.println("Taxa de juros ao ano : "+taxaJuros);
        System.out.println("saldo inicial: "+getSaldo());
        double saldoPosInvestimento =getSaldo()*taxaJuros*anos;
        System.out.println("saldo depois do fim do investimento: " + (saldoPosInvestimento+getSaldo()));
        System.out.println("valor do rendimento");
        return  getSaldo()*taxaJuros*anos;
    }
}

