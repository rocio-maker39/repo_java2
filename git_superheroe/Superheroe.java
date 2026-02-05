public class Superheroe {
    private String nombre;
    private String poderPpal;
    private int nivelDePoder;
    private String colorDelDisfraz;
    
    public Superheroe(){
        nombre= "";
        poderPpal= "";
        nivelDePoder= 0;
        colorDelDisfraz= "";
    }
    public Superheroe(String nombre, String poderPPal, int nivelDePoder, String colorDelDisfraz){
        this.nombre= nombre; // this es el de fuera
        this.poderPpal= poderPPal;
        this.nivelDePoder= nivelDePoder;
        this.colorDelDisfraz= colorDelDisfraz;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getPoderPpal() {
        return poderPpal;
    }

    public int getNivelDePoder() {
        return nivelDePoder;
    }

    public String getColorDelDisfraz() {
        return colorDelDisfraz;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoderPpal(String poderPpal) {
        this.poderPpal = poderPpal;
    }

    public void setNivelDePoder(int nivelDePoder) {
        this.nivelDePoder = nivelDePoder;
    }

    public void setColorDelDisfraz(String colorDelDisfraz) {
        this.colorDelDisfraz = colorDelDisfraz;
    }

    public void usarPoder(){
        System.out.println("Tengo el PODER: "+poderPpal);
    }

    public String saludar(String nombre){
        
        return "¡hola! "+nombre;
    }
}
