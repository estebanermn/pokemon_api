package pe.edu.cibertec.pokeapi.models;

import java.util.ArrayList;

public class PokemonMessage {

    private ArrayList<Pokemon> results;

    public ArrayList<Pokemon> getResults() {
        return results;
    }

    public void setResults(ArrayList<Pokemon> results) {
        this.results = results;
    }
}
