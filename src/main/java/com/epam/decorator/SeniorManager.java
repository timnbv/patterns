package com.epam.decorator;

import com.epam.chain.Promotion;

/**
 * @author Tim_Ryzhov
 *         Created on 5/29/2017
 */
public class SeniorManager extends AbstractManager {
    public SeniorManager(ManagerIntf boss) {
        super(boss);
    }

    protected String getTitle() {
        return "Senior manager";
    }

    protected int getApprovalLimit() {
        return 200000;
    }

    @Override
    public void approve(Promotion promotion) {
        super.approve(promotion);
        if (getApprovalLimit() >= promotion.getNewSalary()) {
            System.out.println("As a " + getTitle() + " I can approve it: " + promotion);
        }

    }
}
