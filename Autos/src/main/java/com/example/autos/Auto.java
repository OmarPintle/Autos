package com.example.autos;

public class Auto {
    private String marca;
    private int Año;
    private String Modelo;

    public  Auto(String Mar, int A, String Mod)
    {
        this.marca= Mar;
        this.Año=A;
        this.Modelo=Mod;
    }

    public Auto()
    {
        this.marca= "vw";
        this.Modelo="sedan";
        this.Año=1999;
    }

    public  String toString(){
        String cadena= "\nMARC: " + this.marca + "\nMOD: " + this.Modelo + "\nAÑO: " + this.Año;
        return cadena;
    }
}