package com.restaurante.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.restaurante.myapplication.adapter.FoodAdapter;
import com.restaurante.myapplication.databinding.ActivityMainBinding;
import com.restaurante.myapplication.model.Food;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private FoodAdapter foodAdapter;
    private ArrayList<Food> foodList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerViewFood = binding.RecyclerViewFood;
        recyclerViewFood.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewFood.setHasFixedSize(true);
        foodAdapter =  new FoodAdapter(foodList, this);
        recyclerViewFood.setAdapter(foodAdapter);
        getFood();

    }

    private void getFood(){
        Food food1 = new Food(
                R.drawable.food1,
                "Camarão Empanado com Batatas Fritas:",
                "Camarão Empanado com Batatas Fritas: Camarões empanados crocantes, acompanhados de batatas fritas douradas. Uma combinação simples, mas irresistível, perfeita para uma refeição descontraída.",
                "R$ 85.00"
        );
        foodList.add(food1);

        Food food2 = new Food(
                R.drawable.food2,
                "Combinado de Sushi e Sashimi:",
                "Combinado de Sushi e Sashimi: Uma seleção de sushi e sashimi frescos, incluindo salmão, atum e peixe branco, acompanhados de rolinhos de maki e sashimi decorado com algas e gengibre. Ideal para amantes da culinária japonesa.",
                "R$ 75.00"
        );
        foodList.add(food2);

        Food food3 = new Food(
                R.drawable.food3,
                "Filé ao Molho Madeira com Arroz e Farofa:",
                "Filé ao Molho Madeira com Arroz e Farofa: Suculento filé mignon grelhado, coberto com molho madeira, acompanhado de arroz branco, farofa crocante e um cremoso purê de batatas. Perfeito para quem aprecia uma refeição refinada.",
                "R$ 45.00"
        );
        foodList.add(food3);

        Food food4 = new Food(
                R.drawable.food4,
                "Frango à Parmegiana com Arroz e Batatas Fritas:",
                "Frango à Parmegiana com Arroz e Batatas Fritas: Filé de frango empanado, coberto com molho de tomate e queijo derretido, acompanhado de arroz branco e batatas fritas crocantes. Um clássico que agrada a todos os paladares.",
                "R$ 55.00"
        );
        foodList.add(food4);

        Food food5 = new Food(
                R.drawable.food5,
                "Macarrão ao Molho Branco:",
                "Macarrão ao Molho Branco: Um prato de macarrão cremoso coberto com molho branco, servido em uma tigela rústica, finalizado com um toque de ervas frescas. Ideal para quem busca uma refeição leve e saborosa.",
                "R$ 65.00"
        );
        foodList.add(food5);



    }


}