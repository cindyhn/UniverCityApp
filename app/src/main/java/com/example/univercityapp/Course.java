package com.example.univercityapp;

public class Course {
    private String name;
    private int uoc;
    private int mark;

    public Course() {
    }

    public Course(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public Course(String name, int uoc, int mark) {
        this.name = name;
        this.uoc = uoc;
        this.mark = mark;
    }

    public int getUoc() {
        return uoc;
    }

    public void setUoc(int uoc) {
        this.uoc = uoc;
    }

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
