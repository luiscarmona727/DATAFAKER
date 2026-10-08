package cat.montilivi.model

import kotlinx.serialization.Serializable

/** Un nivell pertany a un videojoc i pot contenir diversos enemics. */
@Serializable
data class Nivell(
    val id: String,
    val idVideojuego: String,
    val nom: String,
    val numero: Int,
    val descripcio: String,
    val dificultat: Dificultat,
) {
    enum class Dificultat {
        FACIL, NORMAL, DIFICIL, MOLT_DIFICIL
    }
}
