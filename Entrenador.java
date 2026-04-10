// ATRIBUTOS:
// Se definen como 'private' para garantizar el encapsulamiento.
// Se incluye un atributo de tipo 'Pokemon' para establecer una relación de ASOCIACIÓN,
// permitiendo que el entrenador tenga un compañero de cualquier subclase.
public class Entrenador {
	// Atributos básicos
	private String nombre;
	private int experiencia;

	// Atributos extras
	private int edad;
	private int medallas;

	// Asociación: el entrenador tiene un Pokémon compañero
	// Usamos la super clase 'Pokémon' para que pueda ser de cualquier tipo.
	private Pokemon companero;

	// CONSTRUCTOR CON PARÁMETROS:
	// Justificación: Permite inicializar al entrenador con todos sus datos.
	// Aquí es donde se ve la ASOCIACIÓN al recibir un objeto Pokemon.

	public Entrenador(String nombre, int experiencia, int edad, int medallas, Pokemon companero) {
		this.nombre = nombre;
		this.experiencia = experiencia;
		this.edad = edad;
		this.medallas = medallas;
		this.companero = companero;// aqui se realiza la asociación
	}

	// Constructor sin parámetros (Vacío)
	// Justificación: Permite crear una instancia de Entrenador sin valores
	// iniciales,
	// facilitando la flexibilidad si los datos se asignan más tarde mediante
	// setters.
	public Entrenador() {
		// Se deja vacío
	}
	// JUSTIFICACIÓN DE MÉTODOS DE ACCESO (GETTERS Y SETTERS):
	// Se definen como 'public' para permitir que otras clases consulten o
	// modifiquen
	// los atributos privados de forma controlada, manteniendo el encapsulamiento.
	// Se incluye el acceso al objeto 'Pokemon' para gestionar la relación de
	// ASOCIACIÓN.
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getMedallas() {
		return medallas;
	}

	public void setMedallas(int medallas) {
		this.medallas = medallas;
	}

	// GETTER Y SETTER ESPECÍFICO PARA LA ASOCIACIÓN
	public Pokemon getCompanero() {
		return companero;
	}

	public void setCompanero(Pokemon companero) {
		this.companero = companero;
	}

}