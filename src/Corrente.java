public class Corrente extends Conta {
    // cobrança para transações envolvendo conta do tipo corrente       
    // cada saque que for efetuado devera ser feito a cobrança da taxa para contas do tipo corrente
    
    double taxa;
    
    public double cobrancaDeSaque(double saque){
        taxa = 6 + saque; 
        return taxa;
    }
       
}
