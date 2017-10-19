package com.company.State;

import com.company.Entity.Human;
import com.company.Role.Hunter;

public class OnTree implements State {

    @Override
    public String toString() {
        return "Caching beast OnTree";
    }

    @Override
    public void Do(Human human) {
        human.setState(this);
        Hunter hunter = new Hunter();
        hunter.RoleExecuter(human);
    }
}
