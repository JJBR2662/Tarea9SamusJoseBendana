package tarea9samusjosebendaña;

public class Addons {
    private String nombre, funcion, partecuerpo;

    public Addons() {
    }

    public Addons(String nombre, String funcion, String partecuerpo) {
        this.nombre = nombre;
        this.funcion = funcion;
        this.partecuerpo = partecuerpo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getPartecuerpo() {
        return partecuerpo;
    }

    public void setPartecuerpo(String partecuerpo) {
        this.partecuerpo = partecuerpo;
    }

    @Override
    public String toString() {
        return " Addons{" + "nombre=" + nombre + ", funcion=" + funcion + ", partecuerpo=" + partecuerpo + '}';
    }
    
    
    
}
