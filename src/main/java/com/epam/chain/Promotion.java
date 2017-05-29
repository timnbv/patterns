package com.epam.chain;

/**
 * @author Tim_Ryzhov
 *         Created on 5/29/2017
 */
public class Promotion {

    private int newSalary;
    private String name;

    public Promotion(String name, int newSalary) {
        this.name = name;
        this.newSalary = newSalary;
    }

    public int getNewSalary() {
        return newSalary;
    }

    public void setNewSalary(int newSalary) {
        this.newSalary = newSalary;
    }

    @Override
    public String toString() {
        return "Promo[" +
                " name='" + name + '\'' +
                ",newSalary=" + newSalary +
                ']';
    }
}
