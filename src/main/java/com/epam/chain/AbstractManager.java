package com.epam.chain;

/**
 * @author Tim_Ryzhov
 *         Created on 5/29/2017
 */
public abstract class AbstractManager {

    protected AbstractManager boss;
    private int salaryApproveLimit;

    public AbstractManager(int salaryApproveLimit, AbstractManager boss) {
        this.salaryApproveLimit = salaryApproveLimit;
        this.boss = boss;
    }

    protected void approve(Promotion promotion) {
        if (this.salaryApproveLimit >= promotion.getNewSalary()) {
            getApproval(promotion);
        } else {
            if (boss != null) {
                noPermission(promotion);
                boss.approve(promotion);
            }
        }
    }


    protected void noPermission(Promotion promotion) {
        System.out.println("I'm a " + getTitle() + " and I cannot approve the promotion: " + promotion);
    }


    protected void getApproval(Promotion promotion) {
        System.out.println("I'm a " + getTitle() + " and I approve the promotion: " + promotion);
    }

    protected abstract String getTitle();
}
