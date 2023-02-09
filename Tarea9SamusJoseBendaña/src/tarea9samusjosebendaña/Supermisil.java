package tarea9samusjosebendaña;

public class Supermisil extends Misiles{
    private String material;

    public Supermisil() {
        super();
    }

    public Supermisil(String material) {
        this.material = material;
    }

    public Supermisil(String material, double velocidad, double poderexplosivo) {
        super(velocidad, poderexplosivo);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString()+" Supermisil{" + "material=" + material + '}';
    }
    
    @Override
    public Traje atacar(Traje samus){
        samus.setMedirdanio(samus.getMedirdanio()+1);
        return samus;
    }
}
