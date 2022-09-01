
package bank_branch.pkg3.pkg1;

/**
 *
 * @author Juan Pablo
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class Bank {
    
    private String BankName;
    private List<Account> BankAccountsArray = new ArrayList();
    
    public Bank (String name){
        this.BankName = name;
        }
    public boolean Deposit(String ID, float amount){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:ifp.db");
            PreparedStatement stm = connection.prepareStatement("update accounts set balance = balance + "
                + amount + " where id = '" + ID + "'");
            
            stm.executeUpdate();
            stm.close();
            connection.close();
            
            return true;
            }
            catch(ClassNotFoundException ex){
                System.out.println("error" + ex);
                return false;
            }
            catch(SQLException ex){
                System.out.println("error" + ex);
                return false;
            }
    }
    public boolean Withdraw(String id , float amount){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:ifp.db");
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery ("select * from accounts where id = '"+id+"'");
            
            float balance = rs.getFloat("balance");
            
            if(balance - amount < 0){
                rs.close();
                stm.close();
                connection.close();
                return false;
                }
            else{
                rs.close();
                stm.close();
                
                PreparedStatement stm2 = connection.prepareStatement("update accounts set balance = balance - "
                    + amount + " where id = '" + id + "'");

                stm2.executeUpdate();
                stm2.close();
                connection.close();

                return true;
                }
            }
        catch(ClassNotFoundException ex){
            System.out.println("error" + ex);
            return false;
            }
        catch(SQLException ex){
            System.out.println("error" + ex);
            return false;
            }
    }
    public boolean Transfer(String originID,String destinationID,float amount){
        
        if(Withdraw(originID,amount)){
            
            Deposit(destinationID,amount);
            return true;
            }
        return false;
    }
    public List<Account> getListDB(){ 
        
        List<Account> account_array = new ArrayList<>();
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:ifp.db");
            Statement stm = connection.createStatement();
            
            ResultSet rs = stm.executeQuery ("select * from accounts");
            
            while(rs.next()){
                String id = rs.getString("id");
                String name = rs.getString("name");
                float balance = rs.getFloat("balance");
                java.sql.Date SQLdate = rs.getDate("creation_date");
                LocalDate localdate = SQLdate.toLocalDate();
                
                Account c = new Account (id,name);
                c.setDate(localdate);
                c.setBalance(balance);
                account_array.add(c);
                }
            rs.close();
            stm.close();
            connection.close();
            }
        catch(ClassNotFoundException ex){
            System.out.println("error" + ex);
            }
        catch(SQLException ex){
            System.out.println("error" + ex);
            }
        
        return account_array;
        }
    public boolean DeleteAccount(String ID){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:ifp.db");
            PreparedStatement stm = connection.prepareStatement("delete from accounts where id = ? ");
            
            stm.setString(1,ID);

            stm.executeUpdate();
            stm.close();
            connection.close();
                    
            return true;
            } 
        catch (ClassNotFoundException ex) {
            return false;
            } 
        catch (SQLException ex) {
            return false;
            }
    }
    public boolean SearchAccount(String ID){
        
        for (Account c : BankAccountsArray){
            if (c.getID().equals(ID)){
                return true;
                }
            }
        return false;
    }
    public Account CreateAccount(String ID,String name){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:ifp.db");
            PreparedStatement stm = connection.prepareStatement("INSERT INTO accounts (id,name,creation_date) VALUES (?,?,?)");
            
            Account c = new Account(ID,name);
            BankAccountsArray.add(c);
            LocalDate localdate = c.getDate(); 
            java.sql.Date SQLdate =  java.sql.Date.valueOf(localdate);
            
            stm.setString(1,ID);
            stm.setString(2,name);
            stm.setDate(3,SQLdate );

            stm.executeUpdate();
            
            stm.close();
            connection.close();
            
            return c;
            } 
        catch (ClassNotFoundException ex) {
            System.out.println(ex);
            return null;
            } 
        catch (SQLException ex) {
            System.out.println("Error the ID ("+ID+") allready exists --->  "+ex);
            return null;
            }
    }
    public boolean ChangeName(String ID,String newName){
        try{
            
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:ifp.db");
            PreparedStatement stm = connection.prepareStatement("update accounts set name = '"
                + newName + "' where id = '" + ID + "'");
            
            stm.executeUpdate();
            stm.close();
            connection.close();

            return true;
            }   
        catch (ClassNotFoundException ex) {
            return false;
            } 
        catch (SQLException ex) {
            return false;
            }
    }
}
