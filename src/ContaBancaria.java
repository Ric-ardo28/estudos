import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
public abstract class ContaBancaria implements Imprimivel{
    private double saldo;
    private int numeroConta;
    private List<String>historicoTransacoes;

        public ContaBancaria(double saldo, int numeroConta) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.historicoTransacoes = new ArrayList<>();
    }
    public abstract double calcularTaxa();

    @Override
    public void imprimirDados(){
        System.out.println("Saldo: " + saldo);
        System.out.println("Numero Conta: " + numeroConta);
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public List<String> getHistoricoTransacoes() {
        return historicoTransacoes;
    }

    public void setHistoricoTransacoes(List<String> historicoTransacoes) {
        this.historicoTransacoes = historicoTransacoes;
    }
    public void exibirHistoricoTransacoes() {
        System.out.println("Histórico de Transações da Conta #" + numeroConta);
        for (String transacao : historicoTransacoes) {
            System.out.println(transacao);
        }
    }

    public void adicionarTransacao(String transacao) {
        historicoTransacoes.add(transacao);
    }
}
