package com.company;

import com.company.Builder.HumanBuilder;
import com.company.Entity.Human;

public class Main {

    public static void main(String[] args) {
	// write your code here

        HumanBuilder humanBuilder = new HumanBuilder();
        Human human = humanBuilder.prepareFisher();
        ShowHuman(human);
        human=humanBuilder.prepareHunter();
        ShowHuman(human);
    }

    private static void ShowHuman(Human human) {
        System.out.println(human);
    }
}
