package entities;

public class SavingsAccount extends Account{
    private Double interestRatte;

    public Double getInterestRatte() {
        return interestRatte;
    }

    public void setInterestRatte(Double interestRatte) {
        this.interestRatte = interestRatte;
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRatte) {
        super(number, holder, balance);
        this.interestRatte = interestRatte;
    }

    public SavingsAccount(){
        super();
    }

    public void apdateBalance(){
        balance += balance * interestRatte;
    }
    
    @Override
    public void wihtdraw(double amount){
        balance -= amount;
    }
    
}
