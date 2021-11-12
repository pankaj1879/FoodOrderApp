package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.foodorderapp.Adapters.MainAdapter;
import com.example.foodorderapp.Models.MainModel;
import com.example.foodorderapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

       list.add(new MainModel(R.drawable.burger , " Veg Burger" ,"45" ,"Aloo Tikki Burger has a spicy potato patty sandwiched between buns"));
       list.add(new MainModel(R.drawable.dosa , "Masala Dosa", "90", "Masala dosa is a crispy crepe made of fermented rice and flavorful spiced potato curry"));
       list.add(new MainModel(R.drawable.mashroomtikka , "Mashroom Tikka", "250","Mushroom tikka is made by grilling mushrooms"));
       list.add(new MainModel(R.drawable.kheer ,"Kheer","250","Kheer is a sweet dish and usually made by boiling milk, sugar or jaggery, and rice,"));
       list.add(new MainModel(R.drawable.springroll ,"Spring Roll"," 50","Spring rolls are filled with minced vegetables"));
       list.add(new MainModel(R.drawable.vegwrap ,"Vegetable Wrap","120","Vegetable wraps made with whole wheat roti. These can be served as a snack"));

       MainAdapter adapter = new MainAdapter (list , this);
        binding.recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);


    }
}