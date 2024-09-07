package com.restaurante.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.restaurante.myapplication.databinding.FoodItemBinding;
import com.restaurante.myapplication.model.Food;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {
    private final ArrayList<Food> foodList;
    private final Context context;

    public FoodAdapter(ArrayList<Food> foodArrayList, Context context) {
        this.foodList = foodArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        FoodItemBinding listItem;
        listItem = FoodItemBinding.inflate(LayoutInflater.from(context),parent,false);

        return new FoodViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        Food currentFood = foodList.get(position);
        holder.binding.imgFood.setBackgroundResource(currentFood.getImgFood()); // Defina a imagem corretamente
        holder.binding.textFoodNome.setText(currentFood.getFoodNome()); // Use o getter para o nome
        holder.binding.textFoodDescricao.setText(currentFood.getFoodDescricao()); // Use o getter para a descrição
        holder.binding.textFoodPreco.setText(currentFood.getFoodPreco()); // Use o getter para o preço
    }


    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public static class FoodViewHolder extends RecyclerView.ViewHolder{
        FoodItemBinding binding;


        public FoodViewHolder(FoodItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }


}
