package com.example.isabelapuiu.learnnewlanguage;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class FeaturesFromJSON {
    @SerializedName("id")
    public Integer id;
    @SerializedName("type")
    public String type;
    @SerializedName("title")
    public String title;
    @SerializedName("description")
    public String description;
    @SerializedName("minimumPlan")
    public String minimumPlan;
    @SerializedName("notAvailableOnOs")
    public ArrayList<String> notAvailableOnOs;
    @SerializedName("notVisibleOnOS")
    public ArrayList<String> notVisibleOnOS;

    public FeaturesFromJSON(Integer id, String type, String title, String description, String minimumPlan, ArrayList<String> notAvailableOnOs, ArrayList<String> notVisibleOnOS) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.description = description;
        this.minimumPlan = minimumPlan;
        this.notAvailableOnOs = notAvailableOnOs;
        this.notVisibleOnOS = notVisibleOnOS;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMinimumPlan() {
        return minimumPlan;
    }

    public void setPlans(String minimumPlan) {
        this.minimumPlan = minimumPlan;
    }

    public ArrayList<String> getNotAvailableOnOs() {
        return notAvailableOnOs;
    }

    public void setNotAvailableOnOs(ArrayList<String> notAvailableOnOs) {
        this.notAvailableOnOs = notAvailableOnOs;
    }

    public ArrayList<String> getNotVisibleOnOS() {
        return notVisibleOnOS;
    }

    public void setNotVisibleOnOS(ArrayList<String> notVisibleOnOS) {
        this.notVisibleOnOS = notVisibleOnOS;
    }
}
