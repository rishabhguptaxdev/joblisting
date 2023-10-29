package com.rishabh.joblisting.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "joblisting")
public class Job {

    private String desc;
    private int exp;
    private String profile;
    private String[] techs;

    public Job(String desc, int exp, String profile, String[] techs) {
        this.desc = desc;
        this.exp = exp;
        this.profile = profile;
        this.techs = techs;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }

    @Override
    public String toString() {
        return "Post{" +
                "desc='" + desc + '\'' +
                ", exp=" + exp +
                ", profile='" + profile + '\'' +
                ", techs=" + Arrays.toString(techs) +
                '}';
    }
}
