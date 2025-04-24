/*
Ejercicio Nº 1

1. Crear una clase Planta con los atributos:
   - nombre
   - alto del tallo
   - tieneHojas
   - climaIdeal
   (con sus métodos y constructores correspondientes)

2. Crear sus clases hijas que compartan sus atributos y métodos:
   - Árbol:
     * variedad
     * tipo de tronco
     * radio de tronco
     * color
     * tipo de hojas

   - Flor:
     * color de pétalos
     * cantidad promedio de pétalos
     * color del pistilo
     * color de los pétalos
     * variedad de flor
     * estación que florece

   - Arbusto:
     * ancho arbusto
     * esDomestico
     * variedad arbusto
     * color de hojas
     * sePodaONo

3. Una vez creadas las clases crear los siguientes métodos:
   - Árbol: método para mostrar un mensaje en pantalla que diga "Hola soy un árbol"
   - Flor: método para mostrar un mensaje en pantalla que diga "Hola soy una flor"
   - Arbusto: método para mostrar un mensaje en pantalla que diga "Hola soy un arbusto"

4. Crear en el Main un objeto de cada clase hija. Llamar a los 3 métodos desde cada objeto.

5. Cambiar el modificador de acceso de los métodos de public a private.
   Intentar acceder desde el main a estos métodos.
*/

public class Plantas {
   public static void main(String[] args) throws Exception {

      // crear un objeto de la clase Planta
      Arbusto arbustito = new Arbusto("Arbusto", 1.0, true, "Tropical", 0.5, true, "Hibisco", "Verde", true);
      // crear un objeto de la clase Flor
      Flor flor = new Flor("Rosa", 1.5, true, "Tropical", "Rojo", 5, "Amarillo", "Hibisco", "Primavera");
      // crear un objeto de la clase Arbol
      Arbol arbol = new Arbol("Pino", 10, true, "Frio", "Pino", "Cilindrico", 0.5, "Verde", "Aguja");

      arbustito.decirLoQueSoy();
      flor.decirLoQueSoy();
      arbol.decirLoQueSoy();
   }
}
