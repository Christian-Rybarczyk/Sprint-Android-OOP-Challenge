package com.rybarstudios.ageofempiressprint.Retrofit

import com.google.gson.GsonBuilder
import com.rybarstudios.ageofempiressprint.model.Civilization
import com.rybarstudios.ageofempiressprint.model.Structure
import com.rybarstudios.ageofempiressprint.model.Technology
import com.rybarstudios.ageofempiressprint.model.Units
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import java.util.concurrent.TimeUnit

interface AgeOfEmpiresAPI {

    @GET("civilizations")
    fun getCivilizations(): Call<List<Civilization>>

    @GET("technologies")
    fun getTechnologies(): Call<List<Technology>>

    @GET("structures")
    fun getStructures(): Call<List<Structure>>

    @GET("units")
    fun getUnits(): Call<List<Units>>

    companion object {

        const val BASE_URL = "https://age-of-empires-2-api.herokuapp.com/api/v1/"

        fun create(): AgeOfEmpiresAPI {
            val logger = HttpLoggingInterceptor()
            logger.level = HttpLoggingInterceptor.Level.BASIC
            logger.level = HttpLoggingInterceptor.Level.BODY

            val gson = GsonBuilder()
                .setLenient()
                .create()

            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(logger)
                .retryOnConnectionFailure(false)
                .readTimeout(10, TimeUnit.SECONDS)
                .connectTimeout(15, TimeUnit.SECONDS)
                .build()

            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()

            return retrofit.create(AgeOfEmpiresAPI::class.java)
        }
    }
}