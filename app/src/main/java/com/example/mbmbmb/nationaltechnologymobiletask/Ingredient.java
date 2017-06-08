package com.example.mbmbmb.nationaltechnologymobiletask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mbmbmb on 6/6/2017.
 */
public class Ingredient {
    @SerializedName("IngredientID")
    @Expose
    private Integer ingredientID;
    @SerializedName("DisplayIndex")
    @Expose
    private Integer displayIndex;
    @SerializedName("IsHeading")
    @Expose
    private Boolean isHeading;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("HTMLName")
    @Expose
    private String hTMLName;
    @SerializedName("Quantity")
    @Expose
    private double quantity;
    @SerializedName("DisplayQuantity")
    @Expose
    private Object displayQuantity;
    @SerializedName("Unit")
    @Expose
    private Object unit;
    @SerializedName("MetricQuantity")
    @Expose
    private double metricQuantity;
    @SerializedName("MetricDisplayQuantity")
    @Expose
    private String metricDisplayQuantity;
    @SerializedName("MetricUnit")
    @Expose
    private String metricUnit;
    @SerializedName("PreparationNotes")
    @Expose
    private Object preparationNotes;
    @SerializedName("IngredientInfo")
    @Expose
    private IngredientInfo ingredientInfo;
    @SerializedName("IsLinked")
    @Expose
    private Boolean isLinked;


    public Integer getIngredientID() {
        return ingredientID;
    }

    public void setIngredientID(Integer ingredientID) {
        this.ingredientID = ingredientID;
    }

    public Integer getDisplayIndex() {
        return displayIndex;
    }

    public void setDisplayIndex(Integer displayIndex) {
        this.displayIndex = displayIndex;
    }

    public Boolean getIsHeading() {
        return isHeading;
    }

    public void setIsHeading(Boolean isHeading) {
        this.isHeading = isHeading;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHTMLName() {
        return hTMLName;
    }

    public void setHTMLName(String hTMLName) {
        this.hTMLName = hTMLName;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Object getDisplayQuantity() {
        return displayQuantity;
    }

    public void setDisplayQuantity(Object displayQuantity) {
        this.displayQuantity = displayQuantity;
    }

    public Object getUnit() {
        return unit;
    }

    public void setUnit(Object unit) {
        this.unit = unit;
    }

    public double getMetricQuantity() {
        return metricQuantity;
    }

    public void setMetricQuantity(double metricQuantity) {
        this.metricQuantity = metricQuantity;
    }

    public String getMetricDisplayQuantity() {
        return metricDisplayQuantity;
    }

    public void setMetricDisplayQuantity(String metricDisplayQuantity) {
        this.metricDisplayQuantity = metricDisplayQuantity;
    }

    public String getMetricUnit() {
        return metricUnit;
    }

    public void setMetricUnit(String metricUnit) {
        this.metricUnit = metricUnit;
    }

    public Object getPreparationNotes() {
        return preparationNotes;
    }

    public void setPreparationNotes(Object preparationNotes) {
        this.preparationNotes = preparationNotes;
    }

    public IngredientInfo getIngredientInfo() {
        return ingredientInfo;
    }

    public void setIngredientInfo(IngredientInfo ingredientInfo) {
        this.ingredientInfo = ingredientInfo;
    }

    public Boolean getIsLinked() {
        return isLinked;
    }

    public void setIsLinked(Boolean isLinked) {
        this.isLinked = isLinked;
    }

}
