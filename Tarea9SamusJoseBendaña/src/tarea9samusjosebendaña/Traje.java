package tarea9samusjosebendaña;

import java.util.ArrayList;

public class Traje {

    private double medirdanio, medircarga, mediroxido, medirfuerza;
    private Beam beam;
    private MissileLauncher missil;
    ArrayList<Addons> lista = new ArrayList();

    public Traje() {
    }

    public Traje(double medirdanio, double medircarga, double mediroxido, double medirfuerza, Beam beam, MissileLauncher missil) {
        this.medirdanio = medirdanio;
        this.medircarga = medircarga;
        this.mediroxido = mediroxido;
        this.medirfuerza = medirfuerza;
        this.beam = beam;
        this.missil = missil;
    }

    public double getMedirdanio() {
        return medirdanio;
    }

    public void setMedirdanio(double medirdanio) {
        this.medirdanio = medirdanio;
    }

    public double getMedircarga() {
        return medircarga;
    }

    public void setMedircarga(double medircarga) {
        this.medircarga = medircarga;
    }

    public double getMediroxido() {
        return mediroxido;
    }

    public void setMediroxido(double mediroxido) {
        this.mediroxido = mediroxido;
    }

    public double getMedirfuerza() {
        return medirfuerza;
    }

    public void setMedirfuerza(double medirfuerza) {
        this.medirfuerza = medirfuerza;
    }

    public Beam getBeam() {
        return beam;
    }

    public void setBeam(Beam beam) {
        this.beam = beam;
    }

    public MissileLauncher getMissil() {
        return missil;
    }

    public void setMissil(MissileLauncher missil) {
        this.missil = missil;
    }

    public ArrayList<Addons> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Addons> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Medidor de danio: " + medirdanio + ", Medidor de Carga: " + medircarga + ", Medidor de Oxido: " + mediroxido + ", Medidor de Fuerza: " + medirfuerza + ", Beam: " + beam + ", MissileLauncher: " + missil + ", Lista de Add-Ons:" + lista;
    }

    public String estado() {
        return "Medidor de danio: " + medirdanio + "\nMedidor de Carga: " + medircarga + "\nMedidor de Oxido: " + mediroxido + "\nMedidor de Fuerza: " + medirfuerza;
    }

}
