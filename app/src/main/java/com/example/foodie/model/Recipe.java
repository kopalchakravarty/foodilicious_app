package com.example.foodie.model;

public class Recipe {private String title ;

    private String image_url;




    public String missedIngredients;



    public Recipe() {
    }

    public Recipe(String title,String image_url,String missedIngredients) {
        this.title = title;
        this.image_url = image_url;
        this.missedIngredients=missedIngredients;




    }


    public String getTitle() {
        return title;
    }


    public String getImage_url() {
        return image_url;
    }


    public void setTitle(String title) {
        this.title = title;
    }
    public String getMissedIngredients() {
        return missedIngredients;
    }
    public void setMissedIngredients(String missedIngredients) {
        this.missedIngredients = missedIngredients;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }


}
