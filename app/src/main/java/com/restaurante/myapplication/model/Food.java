package com.restaurante.myapplication.model;

public class Food {
    int imgFood;
    String foodNome;
    String foodDescricao;
    String foodPreco;

    public Food() {
    }

    public Food(int imgFood, String foodNome, String foodDescricao, String foodPreco) {
        this.imgFood = imgFood;
        this.foodNome = foodNome;
        this.foodDescricao = foodDescricao;
        this.foodPreco = foodPreco;
    }

    public int getImgFood() {
        return imgFood;
    }

    public void setImgFood(int imgFood) {
        this.imgFood = imgFood;
    }

    public String getFoodNome() {
        return foodNome;
    }

    public void setFoodNome(String foodNome) {
        this.foodNome = foodNome;
    }

    public String getFoodDescricao() {
        return foodDescricao;
    }

    public void setFoodDescricao(String foodDescricao) {
        this.foodDescricao = foodDescricao;
    }

    public String getFoodPreco() {
        return foodPreco;
    }

    public void setFoodPreco(String foodPreco) {
        this.foodPreco = foodPreco;
    }
}
