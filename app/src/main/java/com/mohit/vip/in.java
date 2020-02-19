package com.mohit.vip;

import java.io.Serializable;

public class in implements Serializable {

    String name;
    String mob;
    String email;
    String gender;
    int age;

    public in(String name, String mob, String email, String gender, int age, String college, String year, String area, String techs, String working, String link, String fb, String git, String resume, String why, String share, String any, String ref) {
        this.name = name;
        this.mob = mob;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.college = college;
        this.year = year;
        this.area = area;
        this.techs = techs;
        this.working = working;
        this.link = link;
        this.fb = fb;
        this.git = git;
        this.resume = resume;
        this.why = why;
        this.share = share;
        this.any = any;
        this.ref = ref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTechs() {
        return techs;
    }

    public void setTechs(String techs) {
        this.techs = techs;
    }

    public String getWorking() {
        return working;
    }

    public void setWorking(String working) {
        this.working = working;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getFb() {
        return fb;
    }

    public void setFb(String fb) {
        this.fb = fb;
    }

    public String getGit() {
        return git;
    }

    public void setGit(String git) {
        this.git = git;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getWhy() {
        return why;
    }

    public void setWhy(String why) {
        this.why = why;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public String getAny() {
        return any;
    }

    public void setAny(String any) {
        this.any = any;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    String college;
    String year;
    String area;
    String techs;
    String working;
    String link;
    String fb;
    String git;
    String resume;
    String why;
    String share;
    String any;
    String ref;

}
