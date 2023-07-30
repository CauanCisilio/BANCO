import javax.swing.JOptionPane;


public class Conta {
    private double saldo;
    private double saque;
    private double deposito;   
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaque(){
        return this.saque;
    }
    public void setSaque(double saque){
        this.saque = saque;
    }
    public double getDeposito(){
        return this.deposito;
    }
    public void setDeposito(double deposito){
        this.deposito = deposito;
    }
    
    public String exibeInformações(){
        String nome = "======================="+"\n"+"Nome: Gilberto Leal";
        String conta = "conta: 2040-01";
        String agencia = "agencia: 7019-x";
        return nome + "\n" + conta + "\n" + agencia;
    }
}


/*programa que permite o usuario depositar, aplicar e sacar um valor*/