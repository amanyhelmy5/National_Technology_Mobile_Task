package com.example.mbmbmb.nationaltechnologymobiletask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * Created by mbmbmb on 6/5/2017.
 */
public class Recipes implements Serializable {

    public Integer getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(Integer recipeID) {
        this.recipeID = recipeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getMicrocategory() {
        return microcategory;
    }

    public void setMicrocategory(String microcategory) {
        this.microcategory = microcategory;
    }

    public Double getStarRating() {
        return starRating;
    }

    public void setStarRating(Double starRating) {
        this.starRating = starRating;
    }

    public String getWebURL() {
        return webURL;
    }

    public void setWebURL(String webURL) {
        this.webURL = webURL;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public poster getPoster() {
        return poster;
    }

    public void setPoster(poster poster) {
        this.poster = poster;
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Boolean getIsRecipeScan() {
        return isRecipeScan;
    }

    public void setIsRecipeScan(Boolean isRecipeScan) {
        this.isRecipeScan = isRecipeScan;
    }

    public Boolean getIsBookmark() {
        return isBookmark;
    }

    public void setIsBookmark(Boolean isBookmark) {
        this.isBookmark = isBookmark;
    }

    public Integer getTotalTries() {
        return totalTries;
    }

    public void setTotalTries(Integer totalTries) {
        this.totalTries = totalTries;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
    @SerializedName("RecipeID")
    @Expose
    private Integer recipeID;
    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("Cuisine")
    @Expose
    private String cuisine;
    @SerializedName("Category")
    @Expose
    private String category;
    @SerializedName("Subcategory")
    @Expose
    private String subcategory;
    @SerializedName("Microcategory")
    @Expose
    private String microcategory;
    @SerializedName("StarRating")
    @Expose
    private Double starRating;
    @SerializedName("WebURL")
    @Expose
    private String webURL;
    @SerializedName("ReviewCount")
    @Expose
    private Integer reviewCount;
    @SerializedName("Poster")
    @Expose
    private poster poster;
    @SerializedName("IsPrivate")
    @Expose
    private Boolean isPrivate;
    @SerializedName("Servings")
    @Expose
    private Integer servings;
    @SerializedName("CreationDate")
    @Expose
    private String creationDate;
    @SerializedName("IsRecipeScan")
    @Expose
    private Boolean isRecipeScan;
    @SerializedName("IsBookmark")
    @Expose
    private Boolean isBookmark;
    @SerializedName("TotalTries")
    @Expose
    private Integer totalTries;
    @SerializedName("PhotoUrl")
    @Expose
    private String photoUrl;

}
