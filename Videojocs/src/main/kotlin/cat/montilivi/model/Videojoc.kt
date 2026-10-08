package cat.montilivi.model

import kotlinx.serialization.Serializable

/** Un videojoc, que pot contenir diversos nivells. */
@Serializable
data class Videojoc(
    val id: String,
    val nom: String,
    val descripcio: String,
    val genere: String,
    val plataforma: String,
    val anyLlançament: Int,
)
