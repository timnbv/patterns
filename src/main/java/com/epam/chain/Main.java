package com.epam.chain;

import java.util.Random;

/**
 * @author Tim_Ryzhov
 *         Created on 5/29/2017
 */
public class Main {
    public static void main(String[] args) {
        AbstractManager managers = getManagers();
        managers.approve(new Promotion("Ivan Petrov", new Random().nextInt(999999)));
        System.out.println();
        managers.approve(new Promotion("Natalia Ivanova", new Random().nextInt(99999)));
        System.out.println();
        managers.approve(new Promotion("Ivan Spresov", new Random().nextInt(999999)));
        System.out.println();
        managers.approve(new Promotion("Innokentiy Smaktunovskiy", new Random().nextInt(199999)));
    }

    private static AbstractManager getManagers() {
        AbstractManager topManager = new TopManager(1000000, null);
        AbstractManager senior = new SeniorManager(200000, topManager);
        AbstractManager middle = new Manager(100000, senior);
        return new JuniorManager(50000, middle);

    }
}
