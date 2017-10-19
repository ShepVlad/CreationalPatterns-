package com.company.Role;

import com.company.Weapon.Rifle;
import com.company.Weapon.Weapon;

public class Hunter implements Role {
    @Override
    public String roleName() {
        return " Hunter ";
    }

    @Override
    public Weapon weapon() {
        return new Rifle();
    }

    @Override
    public String toString() {
        return roleName()+" With " + weapon().weaponName();
    }
}
