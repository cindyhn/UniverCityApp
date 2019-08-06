package com.example.univercityapp;

import java.util.ArrayList;

public class Offerings {

    private int week;
    private int date;
    private String month;
    private String lecture;
    private String lab;

    public Offerings() {
    }

    public Offerings(int week, int date, String month, String lecture, String lab) {
        this.week = week;
        this.date = date;
        this.month = month;
        this.lecture = lecture;
        this.lab = lab;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getMonth() { return month; }

    public void setMonth(String month) { this.month = month;}

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public static ArrayList<Offerings> getOfferings() {
        ArrayList<Offerings> offerings = new ArrayList<>();
        offerings.add(new Offerings(1, 18, "February", "Introduction & Android Fundamentals", "Android Studio, Git & App basics"));
        offerings.add(new Offerings(2, 25, "Februrary", "Activities, Lifecycle & Intents", "Activities & Intents"));
        offerings.add(new Offerings(3, 4, "March", "Layouts & UI", "Designing a UI"));
        offerings.add(new Offerings(4, 11, "March", "Lists & Adapters", "Displaying Items in a List"));
        offerings.add(new Offerings(5, 18, "March", "Fragments & Multi-layout Apps", "Fragments for Multi-layout Apps"));
        offerings.add(new Offerings(6, 25, "March", "APIs, Permissions & Libraries", "APIs & JSON"));
        offerings.add(new Offerings(7, 1, "April", "Networking", "Networking"));
        offerings.add(new Offerings(8, 8, "April", "Threads & Async Tasks", "Async Tasks"));
        offerings.add(new Offerings(9, 15, "April", "Data Saving", "Database"));
        offerings.add(new Offerings(10, 22, "April", "Outlook & Course Summary", "Revision"));


        return offerings;
    }

}
