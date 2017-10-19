package com.company.Role;

import com.company.Entity.Human;
import com.company.State.OnBeach;

public class Fisher implements Role {
    @Override
    public void RoleExecuter(Human human) {
        human.setRole(this);

    }

    @Override
    public String toString() {
        return "Fisher ";
    }
}
