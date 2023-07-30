import javax.swing.JOptionPane;

public class Principal {
   
    public static void main(String [] args){
        // tipo de operação que o usuario deseja fazer
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("1 - para saque em conta corrente "
            + "\n 2 - para aplicar \n 3 - saque em poupança"));  
        
        Conta conta = new Conta();
        // saldo que o cliente possui em conta
        conta.setSaldo(2500.00);
        
        // criando os objetos das classes filhas
        Poupanca poupanca = new Poupanca();
        Corrente corrente = new Corrente();
        switch(operacao){
            
            case 1: // corrente                
               
                String informacaoCliente = corrente.exibeInformações();
                double saque  = Double.parseDouble(JOptionPane.showInputDialog("Qual valor deseja sacar?")); 
                double taxa = corrente.cobrancaDeSaque(saque); 
                
                    if(conta.getSaldo() >= saque){
                        //mensagem exibida para informar valor do saque somado ao valor da taxa
                        String mensagem = "O valor sacado foi de R$" + saque + 
                        "\n Valor de taxa+transacao = R$" +  taxa+ "\n\n a CCBANK agradece";
                          JOptionPane.showMessageDialog(null, "informações sobre a movimentação\n"+  informacaoCliente+ "\n"+mensagem);
                    }else{
                        JOptionPane.showMessageDialog(null,"saldo insuficiente");
                     }
            break;  
            
                
            case 2:// aplicar em poupança              
                double valorAplicado = Double.parseDouble(JOptionPane.showInputDialog("Qual valor deseja aplicar?"));
                int tempo = Integer.parseInt(JOptionPane.showInputDialog("Por quantos meses deseja aplicar?"));
                poupanca.setTempo(tempo);
                poupanca.aplicacaoPorTempo(valorAplicado);
                poupanca.exibeInformações();
            break;
                
            case 3: // saque na poupança
                double valorSacado = Double.parseDouble(JOptionPane.showInputDialog("Qual valor deseja sacar?"));
                poupanca.saquePoupaca(valorSacado);
            break;
        }       
                 
    }
}
