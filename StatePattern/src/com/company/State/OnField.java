package com.company.State;

import com.company.Entity.Human;
import com.company.Role.Farmer;

public class OnField implements State {
    @Override
    public void Do(Human human) {
        human.setState(this);
        Farmer farmer = new Farmer();
        farmer.RoleExecuter(human);
    }

    @Override
    public String toString() {
        return "Pashe ";
    }
}
