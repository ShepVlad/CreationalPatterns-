package com.company.State;

import com.company.Entity.Human;
import com.company.Role.Seluk;

public class OnMushroom implements State {

    @Override
    public void Do(Human human) {

        human.setState(this);
        Seluk seluk = new Seluk();
        seluk.RoleExecuter(human);
    }
    @Override
    public String toString() {
        return " Getting mushrooms OnMushrooms hall";
    }

}
