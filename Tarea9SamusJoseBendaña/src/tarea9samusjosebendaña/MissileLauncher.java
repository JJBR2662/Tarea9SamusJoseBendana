package tarea9samusjosebendaña;

import java.util.ArrayList;

public class MissileLauncher {
    private int capacidadmisiles;
    private ArrayList<Misiles> listamisiles = new ArrayList();
    private boolean soportararegular, soportarasuper;

    public MissileLauncher() {
    }

    public MissileLauncher(int capacidadmisiles, boolean soportararegular, boolean soportarasuper) {
        this.capacidadmisiles = capacidadmisiles;
        this.soportararegular = soportararegular;
        this.soportarasuper = soportarasuper;
    }

    public int getCapacidadmisiles() {
        return capacidadmisiles;
    }

    public void setCapacidadmisiles(int capacidadmisiles) {
        this.capacidadmisiles = capacidadmisiles;
    }

    public ArrayList<Misiles> getListamisiles() {
        return listamisiles;
    }

    public void setListamisiles(ArrayList<Misiles> listamisiles) {
        this.listamisiles = listamisiles;
    }

    public boolean isSoportararegular() {
        return soportararegular;
    }

    public void setSoportararegular(boolean soportararegular) {
        this.soportararegular = soportararegular;
    }

    public boolean isSoportarasuper() {
        return soportarasuper;
    }

    public void setSoportarasuper(boolean agregarle) {
        this.soportarasuper = agregarle;
    }
    
    public boolean addmisiles (ArrayList<Misiles> listamisiles){
        if (listamisiles.size()+1>capacidadmisiles){
            return false;
        }else{
            return true; 
        }
    }

    @Override
    public String toString() {
        return "MissileLauncher{" + "capacidadmisiles=" + capacidadmisiles + ", listamisiles=" + listamisiles + ", soportararegular=" + soportararegular + ", soportarasuper=" + soportarasuper + '}';
    }

    
    
    
}
