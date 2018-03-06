/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankAccount;

/**
 *
 * @author 18442
 */
public class BankAccount {
    
    public String username;
    public int password;
    public int total;
    
    public BankAccount(String yuser, int ypass, int ytot){
        username = yuser;
        password = ypass;
        total = ytot;
    }
    
    public int getTotal(){
        return total;
    }
    
    public String getUsername(){
        return username;
    }
    
    public int getPassword(){
        return password;
    }
    
    public void setTotal(int ytot){
        total = ytot;
    }
    
    public void setUsername(String yuser){
        username = yuser;
    }
    
    public void setPassword(int ypass){
        password = ypass;
    }
    
    @Override
    public String toString(){
        return "Your username, password, and total > " + username
                + password + total;
    }
    
}
