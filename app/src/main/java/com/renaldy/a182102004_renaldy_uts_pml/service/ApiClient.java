package com.renaldy.a182102004_renaldy_uts_pml.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static Retrofit retrofit;
    public static final String BASE_URL = "http://jsonplaceholder.typicode.com";
    public static Retrofit getRetrofitInstance(){
        if (retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
                            .build();
        }
        return retrofit;
    }
}
