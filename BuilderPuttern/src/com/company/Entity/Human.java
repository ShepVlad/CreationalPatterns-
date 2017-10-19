package com.company.Entity;

import com.company.State.State;

import java.util.ArrayList;
import java.util.List;

public class Human {
   State state;

    public void AddState(State state)
    {
       this.state=state;
    }

    @Override
    public String toString() {
        return "Human{" +state+
                '}';
    }
}
