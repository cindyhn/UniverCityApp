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
        offerings.add(new Offerings("INFS1602", "Digital Transformation in Business", "", "none", "T1, T2, T3"));
        offerings.add(new Offerings("INFS1603", "Introduction to Business Databases", "", "none", "T1, T2"));
        offerings.add(new Offerings("INFS1609", "Fundamentals of Business Programming", "", "none", "T1, T3"));
        offerings.add(new Offerings("INFS2603", "Business Analysis", "", "INFS1602 & INFS1603", "T3"));
        offerings.add(new Offerings("INFS2605", "Intermediate Business Programming", "", "INFS1603 AND INFS1609", "U1C, T1, T3"));
        offerings.add(new Offerings("INFS2608", "Database Management and Big Data Infrastructures", "", "INFS1603", "T1"));
        offerings.add(new Offerings("INFS2621", "Enterprise Systems", "", "INFS1602", "T2"));
        offerings.add(new Offerings("INFS3603", "Introduction to Business Analytics", "", "INFS1602 AND 72 UoC", "T1, T2"));
        offerings.add(new Offerings("INFS3604", "Business Process Management", "", "INFS2603 AND 72 UoC", "T3"));
        offerings.add(new Offerings("INFS3605", "Information Systems Innovation and Managememt", "", "INFS3634  AND 72 UoC", "T1, T2"));
        offerings.add(new Offerings("INFS3617", "Networking and Cyber Security", "", "INFS1602 AND 72 UoC", "T1"));
        offerings.add(new Offerings("INFS3634", "Mobile Applications Development", "", "INFS2605 AND 72 UoC", "T1, T3"));

        offerings.add(new Offerings("", "", "", "",""));
        offerings.add(new Offerings("", "", "", "",""));
        offerings.add(new Offerings("", "", "", "",""));
        offerings.add(new Offerings("", "", "", "",""));
        offerings.add(new Offerings("", "", "", "",""));
        offerings.add(new Offerings("", "", "", "",""));
        offerings.add(new Offerings("", "", "", "",""));
        offerings.add(new Offerings("", "", "", "",""));
        offerings.add(new Offerings("", "", "", "",""));
        offerings.add(new Offerings("", "", "", "",""));
        offerings.add(new Offerings("", "", "", "",""));
        offerings.add(new Offerings("", "", "", "",""));
        offerings.add(new Offerings("", "", "", "",""));



        return offerings;
    }

}
