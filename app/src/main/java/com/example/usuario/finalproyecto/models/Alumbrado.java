package com.example.usuario.finalproyecto.models;

/**
 * Created by Usuario on 5/06/2017.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Alumbrado {

    @SerializedName("estrato")
    @Expose
    private String estrato;
    @SerializedName("tarifa_mensual")
    @Expose
    private String tarifaMensual;
    @SerializedName("usuario")
    @Expose
    private String usuario;

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    public String getTarifaMensual() {
        return tarifaMensual;
    }

    public void setTarifaMensual(String tarifaMensual) {
        this.tarifaMensual = tarifaMensual;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
