public class ContaInvestimento extends ContaBancaria{
    private double taxaJuros;
    public ContaInvestimento(double saldo, int numeroConta, double taxaJuros) {
        super(saldo, numeroConta);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    public double calculaTaxaJuros(int anos, double taxaJuros) {
        System.out.println("Taxa de juros ao ano : "+taxaJuros);
        System.out.println("saldo inicial: "+getSaldo());
        double saldoPosInvestimento =getSaldo()*taxaJuros*anos;
        System.out.println("saldo depois do fim do investimento: " + (saldoPosInvestimento+getSaldo()));
        System.out.println("valor do rendimento");
        return  getSaldo()*taxaJuros*anos;
    }

    @Override
    public double calcularTaxa() {
        double taxaInvestimento = 0.08;
        int anosInvestimento = 5;
        return getSaldo() * taxaInvestimento * anosInvestimento;
    }
}
