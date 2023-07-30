import javax.swing.JOptionPane;

public class Poupanca extends Conta{
    private int tempo;
    
    public int getTempo(){
        return this.tempo;
    }
    public void setTempo(int tempo){
        this.tempo = tempo;
    }
    
    public void saquePoupaca(double valor){
        JOptionPane.showMessageDialog(null,"Saque efetuado com sucesso \n"
                + " valor da taxa R$0,00\n" + " valor retirado R$" +valor+ "\n\n a CCBANK agradece");        
    }
    public Double aplicacaoPorTempo(double valor){
        // deve render 5% apos uma quantidade de tempo
        double ganhos = 0.001 * tempo * valor;
        double retornoInvestimento = ganhos+valor;
        JOptionPane.showMessageDialog(null,"valor investido apos periodo R$"+retornoInvestimento);
        
        return retornoInvestimento;
    }
}
