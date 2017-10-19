package com.company.Role;

import com.company.Weapon.Rod;
import com.company.Weapon.Weapon;

public class Fisher implements Role {
    @Override
    public String roleName() {
        return " Fisher ";
    }

    @Override
    public Weapon weapon() {
        return new Rod();
    }

    @Override
    public String toString() {
        return roleName()+" With "+weapon().weaponName();
    }
}
