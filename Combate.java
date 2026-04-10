// CLASE COMBATE:
// Justificación: Esta clase gestiona la lógica de enfrentamiento entre dos objetos 
// de la clase Pokemon, permitiendo determinar un ganador basado en sus estadísticas.
public class Combate {
	// Definimos los atributos como 'private' por seguridad (Encapsulamiento).
	// Usamos la superclase Pokemon para que puedan pelear
	// Pokémon de cualquier tipo (Fuego, Agua, Eléctrico).
	private Pokemon pokemon1;
	private Pokemon pokemon2;
	private String resultado;// Un String para guardar el nombre del que resulte vencedor.

	// 2-Constructor con parámetros
	public Combate(Pokemon p1, Pokemon p2) {
		this.pokemon1 = p1;
		this.pokemon2 = p2;
	}

	// 1-Constructor sin parámetros
	// Justificación: Recibe los dos objetos Pokemon que van a enfrentarse.
	public Combate() {
	}

	// 3-Método de lógica: determinar quien gana
	// compara niveles para determinar el ganador
	public void realizarCombate(Entrenador e1, Entrenador e2) {
		if (pokemon1.getNivel() > pokemon2.getNivel()) {
			resultado = "¡El ganador es " + pokemon1.getNombre() + " del entrenador " + e1.getNombre() + "!";
		} else if (pokemon2.getNivel() > pokemon1.getNivel()) {
			resultado = "¡El ganador es " + pokemon2.getNombre() + " del entrenador" + e2.getNombre() +  "!";
		} else {
			resultado = "¡Ha habido un empate de niveles";
		}
		System.out.println(resultado);
	}

	// 4. MÉTODOS DE ACCESO (GETTERS Y SETTERS)
	// Se colocan al final para mantener el orden y la claridad del código.
	public Pokemon getPokemon1() {
		return pokemon1;
	}

	public void setPokemon1(Pokemon pokemon1) {
		this.pokemon1 = pokemon1;
	}

	public Pokemon getPokemon2() {
		return pokemon2;
	}

	public void setPokemon2(Pokemon pokemon2) {
		this.pokemon2 = pokemon2;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

}
