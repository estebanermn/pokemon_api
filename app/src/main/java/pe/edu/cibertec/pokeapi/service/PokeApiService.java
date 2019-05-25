package pe.edu.cibertec.pokeapi.service;

import pe.edu.cibertec.pokeapi.models.PokemonMessage;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PokeApiService {

    @GET("pokemon")
    Call<PokemonMessage> getListPokemon(@Query("limit") int limit, @Query("offset") int offset);
}
