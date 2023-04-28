/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c195comboboxobjectexample;

/**
 *
 * @author amy.antonucci
 */
public class Fruit {
    
    private int fruitId;
    private String fruitName;

    public Fruit(int fruitId, String fruitName) {
        this.fruitId = fruitId;
        this.fruitName = fruitName;
    }

    public int getFruitId() {
        return fruitId;
    }

    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }
    
    //The combobox uses this toString method to display the fruit in the list
    public String toString() {
        return fruitName;
    }
    
}
