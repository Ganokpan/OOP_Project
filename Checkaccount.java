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
public class Checkaccount extends Account{

    public Checkaccount(int point, String name) {
        super(point, name);
    }
    
    @Override
    public void pointdown(int a){
        if(a>0){
            if(this.point-a>0 && this.point>a){
                point -= a;
                System.out.println(getName()+" using "+a+" reward point and balance has "+point);
            }
            else if(this.point<0 && this.point>=0){
                point = 0;
                System.out.println(getName()+" using "+a+" reward point and balance has "+point);
            }
            else if(this.point-a<0 && this.point-a<0){
                System.out.println("Not enough reward point!");
            }
        }   
        else if(a < 0){
            System.out.println("Input number must be a positive integer");
        }
    }
    
    public String toString(){
        return "The "+getName()+" account has "+point+" reward point.";
    }
    
}
