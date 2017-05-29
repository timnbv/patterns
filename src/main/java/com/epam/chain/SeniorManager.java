package com.epam.chain;

/**
 * @author Tim_Ryzhov
 *         Created on 5/29/2017
 */
public class SeniorManager extends  AbstractManager {

    public  SeniorManager(int salaryApproveLimit, AbstractManager boss) {
        super(salaryApproveLimit, boss);
    }

    @Override
    protected String getTitle(){
        return "Senior Manager";
    }
}