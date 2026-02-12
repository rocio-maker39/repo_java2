public class App {
    public static void main(String[] args) throws Exception {
        final int MAX = 10;

        Superheroe[] s;
        s = new Superheroe[MAX];
        int i =0;

        /*for (; i < s.length; i++){
            s [i] = new Superheroe("nombre_"+i, "poderPPal_"+i, i, "colorDelDisfraz_"+i);
        }
        */

        while(i<s.length){ // se puede poner MAX como opcion de s.length
            s [i] = new Superheroe("nombre_"+i, "poderPPal_"+i, i, "colorDelDisfraz_"+i);
            i++;
        }

        for (Superheroe superheroe : s) {
            System.out.println(superheroe.getNombre()+", "+superheroe.getPoderPpal()+ ", "+superheroe.getNivelDePoder()+ ", " + superheroe.getColorDelDisfraz());
        }

        System.out.println("Mensaje añadido para probar el control de cambios");

        System.out.println("Proyecto creado y Clase de héroes");

        //Instancio un objeto de la clase superheroe
        Superheroe rayoVeloz = new Superheroe("RAYO VELOZ","Súper velocidad",85,"amarillo"); //El héroe favorito de Mercedes

        System.out.println(">Epi: ¡Hola Blas!\\n>Blas: ¡Hola Epi!");

        Superheroe wonderWoman = new Superheroe("WONDER WOMEN","Súper fuerza", 2, "rosa");


        /*
        * Practico con la salida por consola de 
        los distintos tipos de datos.
        */
        System.out.println("-----------------------------------------");
        System.out.printf("OBJETO SUPER HÉROE: %s\n", rayoVeloz.getNombre());
        System.out.printf("PODER: %s\t NIVEL PODER %d\n", rayoVeloz.getPoderPpal(),rayoVeloz.getNivelDePoder());
        System.out.printf("COLOR DISFRAZ: %s\n", rayoVeloz.getColorDelDisfraz());
        System.out.println("-----------------------------------------\n");

        /*
        * Modificacion del codico
        * Bucle con printf
        */

        System.out.println("-----------------------------------------");
        System.out.printf("OBJETO SUPER HEROINA: %s\n", wonderWoman.getNombre());
        System.out.printf("PODER: %s\t NIVEL PODER %d\n", wonderWoman.getPoderPpal(),wonderWoman.getNivelDePoder());
        System.out.printf("COLOR DISFRAZ: %s\n", wonderWoman.getColorDelDisfraz());
        System.out.println("-----------------------------------------");

    }
}
