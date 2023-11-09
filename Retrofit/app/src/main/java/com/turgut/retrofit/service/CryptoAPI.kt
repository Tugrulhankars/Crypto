package com.turgut.retrofit.service

import com.turgut.retrofit.model.CryptoModel
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {


    @GET(value = "https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData(): Observable<List<CryptoModel>>

    //fun getData():Call<List<CryptoModel>>
}