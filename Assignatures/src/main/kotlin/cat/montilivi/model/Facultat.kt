package cat.montilivi.model

import kotlinx.serialization.Serializable

/**
 * Facultat d'una universitat que ofereix una o més assignatures.
 *
 * [idUniversitat] identifica la universitat a què pertany, i [assignatures]
 * conté els identificadors de les assignatures que ofereix.
 */
@Serializable
data class Facultat(
    val id: String,
    val nom: String,
    val sigles: String,
    val campus: String,
    val descripcio: String,
    val historia: String,
    val alias: String? = null,
    val idUniversitat: String,
    val anyCreacio: Int,
    val dataCreacio: String, // AAAA-MM-DD
    val nombreProfessors: Int,
    val nombreEstudiants: Int,
    val superficieMetresQuadrats: Double,
    val pressupostMilions: Double,
    val valoracioDocencia: Int, // 0..100
    val area: Area,
    val activa: Boolean = true,
    val foto: String,
    val color: String = "#388E3C",
    val titulacions: List<String> = emptyList(),   // llista de text
    val assignatures: List<String> = emptyList(),
) {
    val ratioEstudiantsProfessor: Double
        get() = if (nombreProfessors == 0) 0.0 else nombreEstudiants.toDouble() / nombreProfessors

    enum class Area { CIENCIES, SALUT, ENGINYERIA, HUMANITATS, CIENCIES_SOCIALS, ARTS }
}
