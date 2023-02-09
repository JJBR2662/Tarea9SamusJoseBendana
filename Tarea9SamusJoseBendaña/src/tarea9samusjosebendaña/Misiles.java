package tarea9samusjosebendaña;

public class Misiles {
    private double velocidad, poderexplosivo;

    public Misiles() {
    }

    public Misiles(double velocidad, double poderexplosivo) {
        this.velocidad = velocidad;
        this.poderexplosivo = poderexplosivo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getPoderexplosivo() {
        return poderexplosivo;
    }

    public void setPoderexplosivo(double poderexplosivo) {
        this.poderexplosivo = poderexplosivo;
    }

    @Override
    public String toString() {
        return "Misiles{" + "velocidad=" + velocidad + ", poderexplosivo=" + poderexplosivo + '}';
    }
    
    public Traje atacar(Traje samus){
        return samus;
    }
}
