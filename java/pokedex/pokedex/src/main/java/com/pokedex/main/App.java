package com.pokedex.main;

import java.util.concurrent.TimeUnit;

import models.Pokemon;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import services.PokemonApi;
import views.Ux;

/**
 * Hello world!
 *
 */
public class App {
    static Ux ux;

    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        PokemonApi api = new PokemonApi();
        ux = new Ux();

        // Get Pokemon by ID
        for(int i = 1; i <= 151; i++){
        Call<Pokemon>  call = api.getPokemonById(i);
        TimeUnit.SECONDS.sleep(1);
        call.enqueue(new Callback<Pokemon>() {

            @Override
            public void onResponse(Response<Pokemon> response) {
                              
                if(response.isSuccess()){
                    Pokemon pokemon = response.body();
                    System.out.println("Mi pokemon is :" + pokemon.getName());
                    System.out.println("Mi pokemon ID is :" + pokemon.getId());
                    System.out.println("Mi pokemon EXP is :" + pokemon.getBase_experience());
                    System.out.println("Mi pokemon ID is :" + pokemon.getSprites().getFront_default());
                    ux.addImagePanel(pokemon.getSprites().getFront_default());
                }
            }

            @Override
            public void onFailure(Throwable t) {
                System.out.println("Network Error :: " + t.getLocalizedMessage());
            }
        });
    }

    }
}
