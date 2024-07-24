public class CocheApp {

    public static void main(String[] args){
        System.out.println("Hola mundo");
        Coche coche1 = new Coche("Toyota",2021,15000,true); //instanciar un objeto de la clase Coche
       System.out.println(coche1.toString());
       //coche1.marca = "Nissan"; //ejemplo de encapsulamiento
        System.out.println(coche1.saludar());
    }
}
