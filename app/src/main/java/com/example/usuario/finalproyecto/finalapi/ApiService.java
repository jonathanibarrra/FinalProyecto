package com.example.usuario.finalproyecto.finalapi;



import com.example.usuario.finalproyecto.models.Alumbrado;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Usuario on 5/06/2017.
 */

public interface ApiService
{
    @GET("k9xw-6nx5.json")
    Call<ArrayList<Alumbrado>> obtenerListaAlumbrado();
}