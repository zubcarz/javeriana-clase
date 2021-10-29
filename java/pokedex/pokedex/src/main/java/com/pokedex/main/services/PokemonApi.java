package com.pokedex.main.services;

import retrofit2.Call;
import retrofit2.GsonConverterFactory;

import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pokedex.main.models.ListPokemon;
import com.pokedex.main.models.Pokemon;
import com.pokedex.main.views.Ux;


interface PokemonInterface {
    @GET("pokemon/{id}")
    Call<Pokemon> getPokemon(@Path("id") int id);

    @GET("pokemon/{name}")
    Call<Pokemon> getPokemonByName(@Path("name") String name);


    @GET("pokemon")
    Call<ListPokemon> getListPokemon(@Query("limit") int limit);
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

    public Call<Pokemon> getPokemonById(String name) {
        Call<Pokemon> call = service.getPokemonByName(name);
        return call;
    }

    public Call<ListPokemon> getPokemonList(int limit) {
        Call<ListPokemon> call = service.getListPokemon(limit);
        return call;
    }


}
