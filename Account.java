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
public class Account {
    public int point;
    private String name;

    public Account(int point, String name) {
        this.point = point;
        this.name = name;
    }
    
    public void pointup(int a){
        if(a > 0){
            point += a;
            System.out.println(name +" has reward point is increase"+a);
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    
    public void pointdown(int a){
        if(a > 300){
            if(this.point-a>0 && this.point>a){
                point -= a;
                System.out.println(a+"has reward point is "+name);
            }
            else if(this.point-a<=0){
                System.out.println("Not enough reward point!");
            }
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public String getName() {
        return name;
    }
    
    public void showpoint(){
        System.out.println(name+" account has "+point+" Reward point."); 
    }
    
}
