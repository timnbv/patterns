package com.epam.decorator;

import com.epam.chain.Promotion;

/**
 * @author Tim_Ryzhov
 *         Created on 5/29/2017
 */
public class MiddleManager extends AbstractManager {
    public MiddleManager(ManagerIntf boss) {
        super(boss);
    }

    protected String getTitle() {
        return "Manager";
    }

    protected int getApprovalLimit() {
        return 100000;
    }

    @Override
    public void approve(Promotion promotion) {
        super.approve(promotion);
        if (getApprovalLimit() >= promotion.getNewSalary()) {
            System.out.println("As a " + getTitle() + " I can approve it: " + promotion);
        }

    }
}
