
//CLASE PRINCIPAL: Punto de entrada del simulador.
//Esta clase se ha creado para orquestar la interacción entre los objetos.
//Aquí se instancian los Pokémon (usando Herencia), se asocian a sus Entrenadores 
//demostrando la relación de Asociación y se ejecutan los duelos mediante 
//la clase Combate, validando así toda la lógica de negocio del sistema.
public class Principal {

	public static void main(String[] args) {
		// CREACIÓN DE OBJETOS: Creamos los Pokémon con sus nombres reales
		// Creamos a Charmander usando la clase PokemonFuego
		PokemonFuego charmander = new PokemonFuego("Charmander", 4, 10, 52, 60);
		// Creamos a Pikachu usando la clase PokemonElectrico
		PokemonElectrico pikachu = new PokemonElectrico("Pikachu", 6, 15, 40, 70);

		// ESTABLECEMOS LA ASOCIACIÓN 🤝
		// Le asignamos a Pikachu como el compañero único del entrenador.
		// Aquí demostramos que 'Entrenador' acepta cualquier subclase de Pokemon.
		Entrenador ash = new Entrenador("Ash", 100, 14, 8, pikachu);
		Entrenador rojo = new Entrenador("Rojo", 500, 15, 16, charmander);

		// PRESENTACIÓN DETALLADA y demostración de realciones
		// Se hace uso de la relación asociación entre Entrenador y Pokemon.
		// Se aplica polimorfismo y casting para ejecutar los metodos específicos 
		// de las clases hijas que no están en la clase padre.
		System.out.println("Entrenador: " + ash.getNombre() + ", Experiencia: " + ash.getExperiencia() + ", Edad:" + ash.getEdad() + ", Medallas:" + ash.getMedallas());
		System.out.print("Pokémon que entrena: " + ash.getCompanero().getNombre() + ", Nivel:" + ash.getCompanero().getNivel() + ", Ataque: ");
		((PokemonElectrico)ash.getCompanero()).usarImpactrueno();

		System.out.println(); // Espacio en blanco entre entrenadores

		System.out.println("Entrenador: " + rojo.getNombre() + ", Experiencia:" + rojo.getExperiencia() + ", Edad:" + rojo.getEdad() + ", Medallas:" + rojo.getMedallas());
		System.out.print("Pokémon que entrena: " + rojo.getCompanero().getNombre() + ", Nivel:" + rojo.getCompanero().getNivel() + ", Ataque: ");
		((PokemonFuego)rojo.getCompanero()).lanzarLlamarada();

		System.out.println("\n¡Combate Pokémon!");
		System.out.println(ash.getCompanero().getNombre() + " (Nivel: " + ash.getCompanero().getNivel() + ") CONTRA " + rojo.getCompanero().getNombre() + " (Nivel: " + rojo.getCompanero().getNivel() + ")");

		// 3. El combate ahora es entre los compañeros de ambos entrenadores ⚔️
		// Extraemos los Pokémon de cada entrenador usando el getter
		Combate duelo = new Combate(ash.getCompanero(), rojo.getCompanero());
		duelo.realizarCombate(ash, rojo);
	}

	// Este código ha sido diseñado siguiendo los principios de POO.
	// Gracias a la estructura de clases implementada (Herencia y Asociación), el
	// programa es escalable
	// Esto permite ampliar el sistema con infinitos Pokémon y Entrenadores
	// Simplemente instanciando nuevos objetos, sin necesidad de modificar la lógica
	// de combate base.

	// BIBLIOGRAFÍA: 
	// https://www.w3schools.com/java/
	// https://vandal.elespanol.com/guias/guia-pokemon-go/que-son-los-pokemon
	// https://www.youtube.com/user/pildorasinformaticas
	// MÓDULO Profesional U4 PROGRAMACIÓN CESUR

}
