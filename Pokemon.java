
// JUSTIFICACIÓN DE ACCESIBILIDAD:
// Se definen los atributos como 'private' para implementar el ENCAPSULAMIENTO.
// Esto protege los datos del Pokémon, impidiendo que sean modificados 
// directamente desde otras clases y obligando a usar métodos públicos (getters/setters).
public class Pokemon {
	private String nombre;
	private int nivel;
	private int salud;

	// Constructor con parámetros
	public Pokemon(String nombre, int nivel, int salud) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.salud = salud;
	}

	// Constructor sin parámetros
	// Justificación: Permite instanciar un objeto de la clase Pokemon
	// sin asignar valores iniciales de forma inmediata.
	public Pokemon() {
		// se deja vacio según la estructura estándar de POO
	}

	// JUSTIFICACIÓN DE MÉTODOS:
	// Se definen getters y setters como 'public' para permitir el acceso controlado
	// a los atributos privados desde otras clases, respetando el principio de
	// encapsulamiento.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

}
