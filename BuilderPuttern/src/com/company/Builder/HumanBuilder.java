package com.company.Builder;

import com.company.Entity.Human;
import com.company.State.OnBeach;
import com.company.State.OnTree;

public class HumanBuilder {


    public Human prepareFisher()
    {
        Human human = new Human();
        human.AddState(new OnBeach());
        return human;
    }

    public Human prepareHunter()
    {
        Human human = new Human();
        human.AddState(new OnTree());
        return human;
    }

}
