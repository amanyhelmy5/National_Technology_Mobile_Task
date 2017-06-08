package com.example.mbmbmb.nationaltechnologymobiletask;

import java.util.List;

/**
 * Created by mbmbmb on 6/5/2017.
 */
public class Recipe_Details {

    private Integer recipeID;

    private String title;

    private String description;

    private String cuisine;

    private String category;

    private String subcategory;

    private Object microcategory;
    private String primaryIngredient;
    private Double starRating;
    private String webURL;
    private String imageURL;
    private Integer reviewCount;
    private Integer medalCount;
    private Integer favoriteCount;
    private poster poster;
    private List<Ingredient> ingredients = null;
    private String instructions;
    private Integer yieldNumber;
    private String yieldUnit;
    private Integer totalMinutes;
    private Integer activeMinutes;
    private NutritionInfo nutritionInfo;
    private Boolean isPrivate;
    private String creationDate;
    private String lastModified;
    private Boolean isBookmark;
    private Object bookmarkURL;
    private String bookmarkSiteLogo;
    private Object bookmarkImageURL;
    private Object isRecipeScan;
    private Integer menuCount;
    private Integer notesCount;
    private String adTags;
    private Object ingredientsTextBlock;
    private String allCategoriesText;
    private Boolean isSponsored;
    private Object variantOfRecipeID;
    private String collection;
    private Object collectionID;
    private Integer adminBoost;
    private String verifiedDateTime;
    private Integer maxImageSquare;
    private List<Integer> imageSquares = null;
    private String photoUrl;
    private String verifiedByClass;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Object getMicrocategory() {
        return microcategory;
    }

    public void setMicrocategory(Object microcategory) {
        this.microcategory = microcategory;
    }

    public String getPrimaryIngredient() {
        return primaryIngredient;
    }

    public void setPrimaryIngredient(String primaryIngredient) {
        this.primaryIngredient = primaryIngredient;
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

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public Integer getMedalCount() {
        return medalCount;
    }

    public void setMedalCount(Integer medalCount) {
        this.medalCount = medalCount;
    }

    public Integer getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public poster getPoster() {
        return poster;
    }

    public void setPoster(poster poster) {
        this.poster = poster;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Integer getYieldNumber() {
        return yieldNumber;
    }

    public void setYieldNumber(Integer yieldNumber) {
        this.yieldNumber = yieldNumber;
    }

    public String getYieldUnit() {
        return yieldUnit;
    }

    public void setYieldUnit(String yieldUnit) {
        this.yieldUnit = yieldUnit;
    }

    public Integer getTotalMinutes() {
        return totalMinutes;
    }

    public void setTotalMinutes(Integer totalMinutes) {
        this.totalMinutes = totalMinutes;
    }

    public Integer getActiveMinutes() {
        return activeMinutes;
    }

    public void setActiveMinutes(Integer activeMinutes) {
        this.activeMinutes = activeMinutes;
    }

    public NutritionInfo getNutritionInfo() {
        return nutritionInfo;
    }

    public void setNutritionInfo(NutritionInfo nutritionInfo) {
        this.nutritionInfo = nutritionInfo;
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public Boolean getIsBookmark() {
        return isBookmark;
    }

    public void setIsBookmark(Boolean isBookmark) {
        this.isBookmark = isBookmark;
    }

    public Object getBookmarkURL() {
        return bookmarkURL;
    }

    public void setBookmarkURL(Object bookmarkURL) {
        this.bookmarkURL = bookmarkURL;
    }

    public String getBookmarkSiteLogo() {
        return bookmarkSiteLogo;
    }

    public void setBookmarkSiteLogo(String bookmarkSiteLogo) {
        this.bookmarkSiteLogo = bookmarkSiteLogo;
    }

    public Object getBookmarkImageURL() {
        return bookmarkImageURL;
    }

    public void setBookmarkImageURL(Object bookmarkImageURL) {
        this.bookmarkImageURL = bookmarkImageURL;
    }

    public Object getIsRecipeScan() {
        return isRecipeScan;
    }

    public void setIsRecipeScan(Object isRecipeScan) {
        this.isRecipeScan = isRecipeScan;
    }

    public Integer getMenuCount() {
        return menuCount;
    }

    public void setMenuCount(Integer menuCount) {
        this.menuCount = menuCount;
    }

    public Integer getNotesCount() {
        return notesCount;
    }

    public void setNotesCount(Integer notesCount) {
        this.notesCount = notesCount;
    }

    public String getAdTags() {
        return adTags;
    }

    public void setAdTags(String adTags) {
        this.adTags = adTags;
    }

    public Object getIngredientsTextBlock() {
        return ingredientsTextBlock;
    }

    public void setIngredientsTextBlock(Object ingredientsTextBlock) {
        this.ingredientsTextBlock = ingredientsTextBlock;
    }

    public String getAllCategoriesText() {
        return allCategoriesText;
    }

    public void setAllCategoriesText(String allCategoriesText) {
        this.allCategoriesText = allCategoriesText;
    }

    public Boolean getIsSponsored() {
        return isSponsored;
    }

    public void setIsSponsored(Boolean isSponsored) {
        this.isSponsored = isSponsored;
    }

    public Object getVariantOfRecipeID() {
        return variantOfRecipeID;
    }

    public void setVariantOfRecipeID(Object variantOfRecipeID) {
        this.variantOfRecipeID = variantOfRecipeID;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public Object getCollectionID() {
        return collectionID;
    }

    public void setCollectionID(Object collectionID) {
        this.collectionID = collectionID;
    }

    public Integer getAdminBoost() {
        return adminBoost;
    }

    public void setAdminBoost(Integer adminBoost) {
        this.adminBoost = adminBoost;
    }

    public String getVerifiedDateTime() {
        return verifiedDateTime;
    }

    public void setVerifiedDateTime(String verifiedDateTime) {
        this.verifiedDateTime = verifiedDateTime;
    }

    public Integer getMaxImageSquare() {
        return maxImageSquare;
    }

    public void setMaxImageSquare(Integer maxImageSquare) {
        this.maxImageSquare = maxImageSquare;
    }

    public List<Integer> getImageSquares() {
        return imageSquares;
    }

    public void setImageSquares(List<Integer> imageSquares) {
        this.imageSquares = imageSquares;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getVerifiedByClass() {
        return verifiedByClass;
    }

    public void setVerifiedByClass(String verifiedByClass) {
        this.verifiedByClass = verifiedByClass;
    }
}
