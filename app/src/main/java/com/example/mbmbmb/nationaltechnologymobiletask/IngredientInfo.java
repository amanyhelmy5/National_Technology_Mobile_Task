package com.example.mbmbmb.nationaltechnologymobiletask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mbmbmb on 6/6/2017.
 */
public class IngredientInfo {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getMasterIngredientID() {
        return masterIngredientID;
    }

    public void setMasterIngredientID(Integer masterIngredientID) {
        this.masterIngredientID = masterIngredientID;
    }

    public Boolean getUsuallyOnHand() {
        return usuallyOnHand;
    }

    public void setUsuallyOnHand(Boolean usuallyOnHand) {
        this.usuallyOnHand = usuallyOnHand;
    }
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Department")
    @Expose
    private String department;
    @SerializedName("MasterIngredientID")
    @Expose
    private Integer masterIngredientID;
    @SerializedName("UsuallyOnHand")
    @Expose
    private Boolean usuallyOnHand;

}
