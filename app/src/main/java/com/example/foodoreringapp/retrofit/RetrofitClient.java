package com.example.foodoreringapp.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit;
    private static final String BASE_URI = "https://androidappsforyoutube.s3.ap-south-1.amazonaws.com/foodapp/";

    public static Retrofit getRetrofitInstance(){

        if (retrofit==null){

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URI)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }


}
