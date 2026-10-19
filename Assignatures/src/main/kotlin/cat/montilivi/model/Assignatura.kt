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
    val dificultat: Int, // 0..100
    val dataInici: String, // AAAA-MM-DD
    val semestre: Semestre,
    val modalitat: Modalitat,
    val obligatoria: Boolean = true,
    val notaMinimaAprovacio: Double = 5.0,
    val imatge: String,
    val colorIdentificador: String = "#F57C00",
    val etiquetes: List<String> = emptyList(),
    val competencies: List<String> = emptyList(),
    val observacions: String? = null,
) {
    val horesTotalsEstimades: Int get() = (credits * 25).toInt()

    enum class Semestre { PRIMER, SEGON, ANUAL, ESTIU }
    enum class Modalitat { PRESENCIAL, SEMIPRESENCIAL, EN_LINIA, DUAL }
}
