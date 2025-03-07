/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11;

/**
 *
 * @author User
 */
public class CheckingAccount extends Account{
    private double credit;
    
    public CheckingAccount(){
        this(0.0, "", 0.0);
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit){
        if (credit > 0){
            this.credit = credit;
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit(){
        return credit;
    }
    @Override
    public void withdraw(double a) throws WithdrawException{
        if (a < 0){
            System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            }
        if (balance >= a) {
            balance -= a;
            System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
        } else if (balance + credit >= a) {
            credit -= (a - balance);
            balance = 0;
            
            //System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
        } else {
            throw new WithdrawException("Account " + name + " has not enough money.");
    }
    }
    public void withdraw(String a) throws WithdrawException{
        double newa = Double.parseDouble(a);
        withdraw(newa);
    }
    @Override
    public String toString(){
        return "The " + getName() + " account has " + getBalance() + " baht and " + credit + " credits.";
    }
}
