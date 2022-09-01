package bank_branch.pkg3.pkg1;

/**
 *
 * @author Juan Pablo
 */

import java.time.LocalDate;


public class Account {
    
    private LocalDate creation_date;
    private String name;
    private String account_number;
    private Float balance = 0f;
    
    public Account (String ID,String name){
        
        creation_date =  LocalDate.now();
        this.name = name;
        this.account_number = ID;
        }
    
    public LocalDate getDate(){
        return creation_date;
    }
    
    public boolean setDate (LocalDate date){
        creation_date = date ;
        return true;
    }
    public boolean Withdraw(Float amount){
        if(balance > amount){
            return true;
        }
        return false;
    }
    public String getName(){
        return name;
        }
    public boolean setBalance(float balance){
        this.balance = balance;
        return true;
    }
    public String getID(){
        return account_number;
        }
    
    public Float getBalance(){
        return balance;
        }
}
