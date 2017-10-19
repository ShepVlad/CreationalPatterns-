package com.company.Entity;

import com.company.Role.Role;
import com.company.State.State;

public class Human {
    private State state;
    private Role role;

    public Human()
    {
        this.state=null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Human{" +
                "state=" + state +
                ", role=" + role +
                '}';
    }
}
