package com.tufanakcay.retrofitjava.service;

import com.tufanakcay.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    //GET, POST, UPDATE, DELETE

    //URL BASE -> www.website.com
    // GET -> price?key=xxx


    //https://raw.githubusercontent.com/
    // tufanakcay/JSONDataSet/main/crypto.json


    @GET("tufanakcay/JSONDataSet/main/crypto.json")
    Observable<List<CryptoModel>> getData();

    //Call<List<CryptoModel>> getData();



}