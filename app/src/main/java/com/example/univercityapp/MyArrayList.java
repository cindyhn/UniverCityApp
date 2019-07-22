package com.example.univercityapp;

import java.util.ArrayList;

public class MyArrayList extends ArrayList {
    private String name;
    private int mark;

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){

        return this.name + " = " + this.mark;
    }
}
