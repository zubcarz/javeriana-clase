package com.pokedex.main;

import java.util.List;
import java.util.concurrent.TimeUnit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import com.pokedex.main.services.PokemonApi;
import com.pokedex.main.views.Ux;
import com.pokedex.main.models.ListPokemon;
import com.pokedex.main.models.Pokemon;

/**
 * Hello world!
 *
 */
public class App {
    static Ux ux;

    public static void main(String[] args) throws InterruptedException {
        PokemonApi api = new PokemonApi();
        // ux = Ux.getInstance();

        // Get Pokemon by ID
        // for (int i = 1; i <= 151; i++) {
        // Call<Pokemon> call = api.getPokemonById(i);
        // TimeUnit.SECONDS.sleep(1);
        // call.enqueue(new Callback<Pokemon>() {

        // @Override
        // public void onResponse(Response<Pokemon> response) {

        // if (response.isSuccess()) {
        // Pokemon pokemon = response.body();
        // System.out.println("Mi pokemon is :" + pokemon.getName());
        // System.out.println("Mi pokemon ID is :" + pokemon.getId());
        // System.out.println("Mi pokemon EXP is :" + pokemon.getBase_experience());
        // System.out.println("Mi pokemon ID is :" +
        // pokemon.getSprites().getFront_default());
        // ux.addImagePanel(pokemon.getSprites().getFront_default());
        // }
        // }

        // @Override
        // public void onFailure(Throwable t) {
        // System.out.println("Network Error :: " + t.getLocalizedMessage());
        // }
        // });
        // }

        Call<ListPokemon> call = api.getPokemonList(2);
        // TimeUnit.SECONDS.sleep(1);
        call.enqueue(new Callback<ListPokemon>() {

            @Override
            public void onResponse(Response<ListPokemon> response) {

                if (response.isSuccess()) {
                    ListPokemon pokemon = response.body();
                    System.out.println("Mi pokemon is :" + pokemon.getCount());
                    System.out.println("Mi pokemon is :" + pokemon.getResults().get(0).getName());
                }
            }

            @Override
            public void onFailure(Throwable t) {
                System.out.println("Network Error :: " + t.getLocalizedMessage());
            }
        });
    }
}
