package com.company;

import com.company.Entity.Human;
import com.company.Role.Fisher;
import com.company.Role.Seluk;
import com.company.State.OnBeach;
import com.company.State.OnField;
import com.company.State.OnMushroom;
import com.company.State.OnTree;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human human = new Human();
        OnBeach onBeach = new OnBeach();
        onBeach.Do(human);
        ShowWhatHumanDo(human);
        OnMushroom onMushroom = new OnMushroom();
        onMushroom.Do(human);
        ShowWhatHumanDo(human);
        OnTree onTree = new OnTree();
        onTree.Do(human);
        ShowWhatHumanDo(human);
        OnField onField = new OnField();
        onField.Do(human);
        ShowWhatHumanDo(human);
    }

    private static void ShowWhatHumanDo(Human human) {
        System.out.println(human.toString());
    }
}
