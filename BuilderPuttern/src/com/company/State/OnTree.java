package com.company.State;

import com.company.Role.Hunter;
import com.company.Role.Role;

public class OnTree implements State {
    @Override
    public String stateName() {
        return " On the Tree ";
    }

    @Override
    public Role role() {
        return new Hunter();
    }

    @Override
    public String toString() {
        return stateName()+ role();
    }
}
