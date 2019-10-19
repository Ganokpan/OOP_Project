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
public class Stock {
    private Meterial datastock[];
    private int numstock = 0;

    public Stock() {
        datastock = new Meterial[30];
    }

    public void addstock(Meterial m){
        datastock[numstock] = m;
        numstock++;
    }
    
    public Meterial getAccount(int index) {
        return datastock[index];
    }

    public int getNumAccount() {
        return numstock;
    }

    /*public void stockup(int a) {
        if (a > 0) {
            balance += a;
            System.out.println(id + name + "has" + balance);
        } else if (a < 0) {
            System.out.println("Input number must be a positive integer");
        }
    }
    
    public void stockdown(int a){
        if (a > 0) {
            balance -= a;
            if(this.balance-a>10 && this.balance>a){
                System.out.println(id + name + "has" + balance);
            }else if(this.balance-a<10){
                System.out.println("Not enough meterial!");
            }
        } else if (a < 0) {
            System.out.println("Input number must be a positive integer");
        }
    }
    
    public void showstock() {
        for (int i = 0; i < datastock.length; i++) {
            System.out.println(datastock[i]);
        }
    }*/
}
