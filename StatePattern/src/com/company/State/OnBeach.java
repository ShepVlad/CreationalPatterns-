package com.company.State;

import com.company.Entity.Human;
import com.company.Role.Fisher;

public class OnBeach implements State {


    @Override
    public void Do(Human human) {
        human.setState(this);
        Fisher fisher = new Fisher();
        fisher.RoleExecuter(human);
    }

    @Override
    public String toString() {
        return " Fishing OnBeach";
    }
}
