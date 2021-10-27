package services;

import retrofit2.Call;
import retrofit2.GsonConverterFactory;

import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import models.Pokemon;
import java.util.*;

interface PokemonInterface {
    @GET("pokemon/{id}")
    Call<Pokemon> getPokemon(@Path("id") int id);
    // @GET("pokemon}")
    // Call( List<Pokemon>) getListPokemon(@Path(void));



}

public class PokemonApi {
    private static String baseUrl = "https://pokeapi.co/api/v2/";
    private static PokemonInterface API_SERVICE;
    PokemonInterface service;

    public PokemonApi() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

        Retrofit retrofit = new Retrofit.Builder().baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create(gson)).build();

        service = retrofit.create(PokemonInterface.class);
    }

    public Call<Pokemon> getPokemonById(int id) {
        Call<Pokemon> call = service.getPokemon(id);
        return call;
    }

}
