
// Atributos específicos de la subclase
// Justificación: Se definen como 'private' para mantener el encapsulamiento
// y que solo se modifiquen mediante métodos seguros.
public class PokemonFuego extends Pokemon {
	private int temperaturaLlama;
	private int potenciaFuego;

	// Constructor con parámetros
	// Se utiliza 'super' para invocar al constructor de la clase padre (Pokemon)
	// y asegurar que los datos base se inicialicen correctamente.
	public PokemonFuego(String nombre, int nivel, int salud, int temperaturaLlama, int potenciFuego) {
		// Se lo pasamos al padre
		super(nombre, nivel, salud);
		// Estos dos me los quedo yo
		this.temperaturaLlama = temperaturaLlama;
		this.potenciaFuego = potenciaFuego;
	}

	// Constructor sin parámetros:
	// Justificación: Permite crear una instancia de PokemonFuego sin valores
	// iniciales, facilitando la flexibilidad en la creación de objetos.
	public PokemonFuego() {
		// Se deja vacío para asignación posterior de atributos
	}
	// JUSTIFICACIÓN DE MÉTODOS DE ACCESO:
	// Se definen como 'public' para permitir que otras clases consulten
	// o modifiquen los atributos específicos de fuego de forma controlada.

	public int getTemperaturaLlama() {
		return temperaturaLlama;
	}

	public void setTemperaturaLlama(int temperaturaLlama) {
		this.temperaturaLlama = temperaturaLlama;
	}

	public int getPotenciaFuego() {
		return potenciaFuego;
	}

	public void setPotenciaFuego(int potenciaFuego) {
		this.potenciaFuego = potenciaFuego;
	}

	// COMPORTAMIENTO ESPECÍFICO:
	// Método exclusivo de la subclase que realiza una acción temática.
	// Se utiliza 'getNombre()' para acceder al atributo privado de la superclase.
	public void lanzarLlamarada() {
		System.out.println(getNombre() + " lanza una llamarada ardiente a " + temperaturaLlama + " grados!");
	}
}
