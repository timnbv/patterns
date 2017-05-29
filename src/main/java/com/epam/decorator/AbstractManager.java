package com.epam.decorator;

import com.epam.chain.Manager;
import com.epam.chain.Promotion;

/**
 * @author Tim_Ryzhov
 *         Created on 5/29/2017
 */
public abstract  class AbstractManager implements ManagerIntf {

    private ManagerIntf boss;

    public AbstractManager(ManagerIntf boss) {
        this.boss = boss;
    }

    public void approve(Promotion promotion) {
        boss.approve(promotion);    
    }

    protected abstract String getTitle();

    protected abstract int getApprovalLimit();

}
