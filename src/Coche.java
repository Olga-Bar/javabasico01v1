public class Coche {
    //propiedades o atributos
    private String marca; //lenguaje fuertemente tipado
    private int año;
    private double precio;
    private boolean nuevo;

    //constructor : método que permite crear en memoria un objeto


    public Coche(String marca, int año, double precio, boolean nuevo) {
        this.marca = marca;
        this.año = año;
        this.precio = precio;
        this.nuevo = nuevo;
    }

    @Override
    public String toString() {
        return "Mi coche es " +
                "marca='" + marca + '\'' +
                ", año=" + año +
                ", precio=" + precio +
                ", nuevo=" + nuevo +
                '}';
    }
    public String saludar(){
        return "Hola, soy un coche";
    }
}//cierre de clase
