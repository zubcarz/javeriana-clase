package com.pokedex.main.models;

import java.util.List;

public class ListPokemon {

    int count;
    List <Pokemon> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Pokemon> getResults() {
        return results;
    }

    public void setResults(List<Pokemon> results) {
        this.results = results;
    }
}
