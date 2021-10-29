package com.pokedex.main;

import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthStyle;

import com.pokedex.main.models.ListPokemon;
import com.pokedex.main.models.Pokemon;
import com.pokedex.main.services.PokemonApi;
import com.pokedex.main.views.Ux;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Hello world!
 *
 */
public class App {
    static Ux ux;

    public static void main(String[] args) throws InterruptedException {
    
        PokemonApi api = new PokemonApi();
        ux = Ux.getInstance();

        // TODO Add support scroll panel

        Call<ListPokemon> call = api.getPokemonList(151);

        call.enqueue(new Callback<ListPokemon>() {

            @Override
            public void onResponse(Response<ListPokemon> response) {
                if (response.isSuccess()) {
                    ListPokemon listPokemon = response.body();
                    for (int i = 0; i < 151; i++) {

                        ux.addButton(listPokemon.getResults().get(i).getName());
                        // System.out.println(listPokemon.getResults().get(i).getName());
                    }
                    ux.refreshUX();
                }

            }

            @Override
            public void onFailure(Throwable t) {
                System.out.println("Error :: " + t.getLocalizedMessage());
            }

        });

        // ux.addImagePanel("https://image.freepik.com/foto-gratis/hermoso-camino-madera-que-impresionantes-arboles-coloridos-bosque_181624-5840.jpg");

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
        // System.out.println("Error :: " + t.getLocalizedMessage());
        // }
        // });
        // }

    }
}
