package com.epam.decorator;

import com.epam.chain.Promotion;

import java.util.Random;

/**
 * @author Tim_Ryzhov
 *         Created on 5/29/2017
 */
public class Main {
    public static void main(String[] args) {
        ManagerIntf managers = new JuniorManager(new MiddleManager(new SeniorManager(new TopManager(null))));
        managers.approve(new Promotion("Sergey Ivanov", new Random().nextInt(50000)));
        System.out.println();
        managers.approve(new Promotion("Artem Kolobkov", new Random().nextInt(250000)));
        System.out.println();
        managers.approve(new Promotion("Arkadiy Golubev", new Random().nextInt(1250000)));
    }
}
