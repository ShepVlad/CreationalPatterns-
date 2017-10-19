package com.company.State;

import com.company.Role.Fisher;
import com.company.Role.Role;

public class OnBeach implements State {
    @Override
    public String stateName() {
        return " On the beach ";
    }

    @Override
    public Role role() {
        return new Fisher();
    }

    @Override
    public String toString() {
        return stateName()+ role();
    }
}
