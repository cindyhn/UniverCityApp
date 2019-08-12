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

        offerings.add(new Offerings("FINS1612", "Capital Markets and Institutions", "", "none","U1C, T1, T2, T3"));
        offerings.add(new Offerings("FINS1613", "Business Finance", "", "none","U1B, T1, T2, T3"));
        offerings.add(new Offerings("FINS2622", "Asia-Pacific Capital Markets", "", "FINS1612 AND FINS2624","T2"));
        offerings.add(new Offerings("FINS2624", "Portfolio Management", "", "FINS1613","T1, T2, T3"));
        offerings.add(new Offerings("FINS2643", "Wealth Management", "", "FINS2624","U1C, T1, T3"));
        offerings.add(new Offerings("FINS3616", "International Business Finance", "", "FINS2624","U1C, T1, T3"));
        offerings.add(new Offerings("FINS3623", "Venture Capital", "", "FINS1613","T1, T3"));
        offerings.add(new Offerings("FINS3625", "Applied Corporate Finance", "", "FINS1613","T1, T2, T3"));
        offerings.add(new Offerings("FINS3626", "International Corporate Governance", "", "ACCT1511 AND FINS1613","T2"));
        offerings.add(new Offerings("FINS3630", "Bank Financial Management", "", "FINS1613 AND FINS1613","U1C, T1, T2, T3"));
        offerings.add(new Offerings("FINS3631", "Risk and Insurance", "", "FINS1613","T3"));
        offerings.add(new Offerings("FINS3633", "Real Estate Finance", "", "FINS2624","T1"));
        offerings.add(new Offerings("FINS3635", "Options, Futures and Risk Management", "", "FINS2624","T1, T2"));
        offerings.add(new Offerings("FINS3636", "Interest Rate Risk Management", "", "FINS2624","T3"));
        offerings.add(new Offerings("FINS3637", "Wealth Management Advice", "", "FINS2643","U1C, T1, T2"));
        offerings.add(new Offerings("FINS3639", "Estate Planning and Asset Protection", "", "FINS2624 AND FINS2643","T2"));
        offerings.add(new Offerings("FINS3640", "Investment Management Modelling", "", "FINS2624","T1"));
        offerings.add(new Offerings("FINS3641", "Security Analysis and Valuation", "", "FINS2624","T2, T3"));
        offerings.add(new Offerings("FINS3648", "Banking, Finance and Technology", "", "FINS1612 AND FINS2624","T2, T3"));
        offerings.add(new Offerings("FINS3650", "International Banking", "", "FINS2624","T1, T2, T3"));
        offerings.add(new Offerings("FINS3655", "Behavioural Finance", "", "FINS1613","T1, T3"));
        offerings.add(new Offerings("FINS3666", "Trading and Market Making", "", "FINS2624","T1, T3"));




        return offerings;
    }

}
