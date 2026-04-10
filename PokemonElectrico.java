
// Atributos específicos de la subclase
// Justificación: Se definen como 'private' para mantener el encapsulamiento
// y que solo se modifiquen mediante métodos seguros.
public class PokemonElectrico extends Pokemon {
	private int voltajeMaximo;
	private int probabilidadParalizar;

	// Constructor con parámetros
	// Justificación: Permite inicializar el Pokémon con todos sus datos,
	// enviando los básicos a la clase padre mediante 'super'.
	public PokemonElectrico(String nombre, int nivel, int salud, int voltajeMaximo, int probabilidadParalizar) {
		// Enviamos los datos al padre
		super(nombre, nivel, salud);
		// Guardamos los datos específicos
		this.voltajeMaximo = voltajeMaximo;
		this.probabilidadParalizar = probabilidadParalizar;
	}

	// Constructor sin parámetros
	// Justificación: Permite crear una instancia de PokemonElectrico sin valores
	// iniciales
	// facilitando la creación de objetos.
	public PokemonElectrico() {
		// Se deja vacío para asignación posterior de atributos
	}

	// JUSTIFICACIÓN DE MÉTODOS DE ACCESO:
	// Se definen como 'public' para permitir que otras clases consulten
	// o modifiquen los atributos específicos de fuego de forma controlada.
	public int getVoltajeMaximo() {
		return voltajeMaximo;
	}

	public void setVoltajeMaximo(int voltajeMaximo) {
		this.voltajeMaximo = voltajeMaximo;
	}

	public int getProbabilidadParalizar() {
		return probabilidadParalizar;
	}

	public void setProbabilidadParalizar(int probabilidadParalizar) {
		this.probabilidadParalizar = probabilidadParalizar;
	}

	// COMPORTAMIENTO ESPECÍFICO:
	// Método exclusivo de la subclase que realiza una acción temática.
	// Se utiliza 'getNombre()' para acceder al atributo privado de la superclase.
	public void usarImpactrueno() {
		System.out.println(getNombre() + " lanza un ImpacTrueno de " + voltajeMaximo + " voltios!");
	}
}
