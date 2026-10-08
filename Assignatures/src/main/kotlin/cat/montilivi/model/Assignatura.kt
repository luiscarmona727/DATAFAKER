package cat.montilivi.model

import kotlinx.serialization.Serializable

/**
 * Assignatura que pertany a una facultat.
 *
 * [idFacultat] identifica la facultat que ofereix l'assignatura. Inclou dades
 * textuals curtes ([codi]), mitjanes ([descripcio]) i llargues ([continguts]).
 */
@Serializable
data class Assignatura(
    val id: String,
    val nom: String,
    val codi: String,
    val descripcio: String,
    val continguts: String,
    val idFacultat: String,
    val credits: Double,
    val horesSetmanals: Int,
    val curs: Int,
    val semestre: Semestre,
    val modalitat: Modalitat,
    val obligatoria: Boolean,
    val notaMinimaAprovacio: Double,
) {
    enum class Semestre {
        PRIMER, SEGON, ANUAL
    }

    enum class Modalitat {
        PRESENCIAL, SEMIPRESENCIAL, EN_LINIA
    }
}
