/*
🎮 EJERCICIO POO: SIMULADOR BÁSICO DE COMBATE POKÉMON

🧩 OBJETIVO:
Crear una aplicación en Java que simule una batalla entre Pokémon usando los principios de Programación Orientada a Objetos (POO).

🗂️ CLASES OBLIGATORIAS:

1. Clase abstracta o base: Pokemon
   - Atributos:
     - String nombre
     - int nivel
     - int salud
     - String tipo
   - Métodos:
     - void atacar(Pokemon objetivo) → (abstracto o base)
     - void recibirDaño(int daño)
     - boolean estaVivo()

2. Subclases que heredan de Pokemon (mínimo 2 tipos):
   - PokemonFuego
   - PokemonAgua
   - PokemonPlanta
   - Deben sobrescribir el método atacar() con lógica específica por tipo.
   - Incluir bonificaciones o penalizaciones por ventaja de tipo:
     - Fuego > Planta
     - Agua > Fuego
     - Planta > Agua

3. Clase Entrenador
   - Atributos:
     - String nombre
     - ArrayList<Pokemon> equipo
   - Métodos:
     - void agregarPokemon(Pokemon p)
     - void mostrarEquipo()

4. Clase Combate
   - Métodos:
     - void iniciar(Pokemon p1, Pokemon p2)
     - Simula un combate por turnos hasta que uno quede sin salud.

⚔️ REGLAS DE COMBATE:
- Si el atacante tiene ventaja de tipo → daño x2.
- Si el atacante tiene desventaja de tipo → daño /2.
- Daño base sugerido: 10 puntos.

🛠️ FUNCIONALIDADES OPCIONALES:
- Subclase PokemonLegendario con mayor poder.
- Experiencia y subida de nivel.
- Método para curar Pokémon.
- Leer Pokémon o entrenadores desde archivo.

🧪 EJEMPLO DE USO:
Pokemon charmander = new PokemonFuego("Charmander", 5);
Pokemon squirtle = new PokemonAgua("Squirtle", 5);

Entrenador ash = new Entrenador("Ash");
ash.agregarPokemon(charmander);

Entrenador misty = new Entrenador("Misty");
misty.agregarPokemon(squirtle);

Combate batalla = new Combate();
batalla.iniciar(charmander, squirtle);

📌 OBJETIVOS DE APRENDIZAJE:
- Encapsulamiento
- Herencia
- Polimorfismo
- Uso de listas (ArrayList)
- Métodos y lógica por clase
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
