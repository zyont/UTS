package com.renaldy.a182102004_renaldy_uts_pml.service;

import com.renaldy.a182102004_renaldy_uts_pml.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<User>> getUsersList();
}
