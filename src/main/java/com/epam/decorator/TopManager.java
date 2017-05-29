package com.epam.decorator;

import com.epam.chain.Promotion;

/**
 * @author Tim_Ryzhov
 *         Created on 5/29/2017
 */
public class TopManager extends AbstractManager {
    public TopManager(ManagerIntf boss) {
        super(boss);
    }

    protected String getTitle() {
        return "Super Duper Top Manager";
    }

    protected int getApprovalLimit() {
        return 500000;
    }
    @Override
    public void approve(Promotion promotion) {
            System.out.println("As a " + getTitle() + "I can approve everything");
    }
}
