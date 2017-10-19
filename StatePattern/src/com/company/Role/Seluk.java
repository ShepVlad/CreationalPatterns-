package com.company.Role;

import com.company.Entity.Human;

public class Seluk implements Role {
    @Override
    public void RoleExecuter (Human human) {
        human.setRole(this);
    }

    @Override
    public String toString() {
        return "Seluk ";
    }
}
