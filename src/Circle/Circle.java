/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circle;

/**
 *
 * @author 18442
 */
public class Circle {
    
    private int radius;
    
    public Circle(int yr){
        radius = yr;
    }
    
    public int getRadius(){
        return radius;
    }
    
    public int getDiameter(){
        return radius * 2;
    }
    
    public void setRadius(int yr){
        radius = yr;
    }
    
    @Override
    public String toString(){
        return "Your radius is: " + radius;
    }
    
    
    
    
}
