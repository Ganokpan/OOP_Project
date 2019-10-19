/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author User
 */
public class Project {

    public static void main(String[] args) {
        Account a1 = new Account(50,"61070033");
        a1.showpoint();
        a1.pointup(50);
        a1.showpoint();
        a1.pointdown(400);
        a1.showpoint();
        System.out.println("===================================");
        a1 = new Checkaccount(50,"61070033");
        a1.showpoint();
        a1.pointup(500);
        System.out.println(a1);
        a1.pointdown(400);
        System.out.println(a1.toString());
        System.out.println("===================================");
        a1 = new Checkaccount(1000,"62070033");
        //Customer c1 = new Customer("Harry",0001);
        //Customer c2 = new Customer("gloy",0002);
        //Customer c3 = new Customer("ploy",0003);
        System.out.println(a1);
        //System.out.println(c1);
        //System.out.println(c2);
        //System.out.println(c3);
        
       

    }
    
}
