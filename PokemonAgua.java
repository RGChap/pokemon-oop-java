
// Atributos específicos de la subclase
// Justificación: Se definen como 'private' para mantener el encapsulamiento
// y que solo se modifiquen mediante métodos seguros.
public class PokemonAgua extends Pokemon {
	private int presionAgua;
	private int capacidadTanque;

	// Constructor con parámetros
	// Se utiliza 'super' para invocar al constructor de la clase padre (Pokemon)
	// y asegurar que los datos base se inicialicen correctamente.
	public PokemonAgua(String nombre, int nivel, int salud, int presionAgua, int capacidadTanque) {
		// Enviamos los datos al padre
		super(nombre, nivel, salud);
		// Guardamos los datos específicos
		this.presionAgua = presionAgua;
		this.capacidadTanque = capacidadTanque;
	}

	// Constructor sin parámetros
	// Justificación: Permite crear una instancia de PokemonFuego sin valores
	// iniciales, facilitando la flexibilidad en la creación de objetos.
	public PokemonAgua() { // Se deja vacío
	}

	// JUSTIFICACIÓN DE MÉTODOS DE ACCESO:
	// Se definen como 'public' para permitir que otras clases consulten
	// o modifiquen los atributos específicos de fuego de forma controlada.
	public int getPresionAgua() {
		return presionAgua;
	}

	public void setPresionAgua(int presionAgua) {
		this.presionAgua = presionAgua;
	}

	public int getCapacidadTanque() {
		return capacidadTanque;
	}

	public void setCapacidadTanque(int capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}

	// COMPORTAMIENTO ESPECÍFICO:
	// Método exclusivo de la subclase que realiza una acción temática.
	// Se utiliza 'getNombre()' para acceder al atributo privado de la superclase.
	public void usarHidrobomba() {
		System.out.println(getNombre() + "Lanza un chorro de agua con una presión de = presionAgua + PSI!");
	}
}
