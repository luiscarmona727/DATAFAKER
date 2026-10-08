package cat.montilivi.model

import kotlinx.serialization.Serializable

/**
 * Un enemic pertany a un únic nivell.
 * Les cadenes tenen longituds orientatives: nom curt (fins a 40 caràcters),
 * tipus mitjà (fins a 100) i descripció llarga (fins a 1.000).
 */
@Serializable
data class Enemic(
    val id: String,
    val idNivel: String,
    /** Cadena curta. */
    val nom: String,
    /** Cadena mitjana. */
    val tipus: String,
    val vida: Int,
    val atac: Int,
    val defensa: Int,
    val velocitat: Double,
    /** Probabilitat entre 0.0 i 1.0. */
    val probabilitatDeBotin: Double,
    /** Cadena llarga. */
    val descripcio: String,
    val categoria: Categoria,
    val actitud: Actitud,
    val teAtacEspecial: Boolean,
    val habilitats: List<Habilitat> = emptyList(),
) {
    enum class Categoria {
        COMU, ELIT, CAP_FINAL
    }

    enum class Actitud {
        AGRESSIU, DEFENSIU, NEUTRAL, FUGITIU
    }

    enum class Habilitat {
        VERI, FOC, GEL, VOLAR, INVISIBLE, REGENERACIO
    }
}
