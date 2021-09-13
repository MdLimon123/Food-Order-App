package com.example.foodoreringapp.retrofit;

import com.example.foodoreringapp.model.FoodData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {


    @GET("fooddata.json")
    Call<List<FoodData>> getAllData();




}
