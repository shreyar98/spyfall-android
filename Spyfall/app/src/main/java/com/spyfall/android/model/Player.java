package com.spyfall.android.model;

public class Player {

    private String name;

    public Player() {}

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}
