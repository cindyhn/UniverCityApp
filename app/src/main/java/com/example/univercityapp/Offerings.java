package com.example.univercityapp;

import java.util.ArrayList;

public class Offerings {

    private String week;
    private String date;
    private String month;
    private String lecture;
    private String lab;

    public Offerings() {
    }

    public Offerings(String week, String date, String month, String lecture, String lab) {
        this.week = week;
        this.date = date;
        this.month = month;
        this.lecture = lecture;
        this.lab = lab;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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
        offerings.add(new Offerings("INFS1602", "1", "", "Information Systems", "T1"));
        offerings.add(new Offerings("INFS1603", "1", "", "Information Systems", "T1"));
        offerings.add(new Offerings("INFS1609", "1", "", "Information Systems", "T1"));
        offerings.add(new Offerings("INFS2603", "1", "", "Information Systems", "T2"));
        offerings.add(new Offerings("INFS2605", "1", "", "Information Systems", "T3"));
        offerings.add(new Offerings("INFS2608", "1", "", "Information Systems", "T1"));
        offerings.add(new Offerings("INFS2621", "1", "", "Information Systems", "T2"));
        offerings.add(new Offerings("INFS3603", "1", "", "Information Systems", "T3"));
        offerings.add(new Offerings("INFS3604", "1", "", "Information Systems", "T1"));
        offerings.add(new Offerings("INFS3605", "1", "", "Information Systems", "T3"));
        offerings.add(new Offerings("INFS3617", "1", "", "Information Systems", "T2"));
        offerings.add(new Offerings("INFS3634", "1", "", "Information Systems", "T1"));


        return offerings;
    }

}
