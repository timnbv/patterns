package com.epam.chain;

/**
 * @author Tim_Ryzhov
 *         Created on 5/29/2017
 */
public class Manager extends  AbstractManager {

    public Manager(int salaryApproveLimit, AbstractManager boss) {
        super(salaryApproveLimit, boss);
    }

    @Override
    protected String getTitle(){
        return "Ordinary Manager";
    }
}