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
    val idUniversitat: String,
    val anyCreacio: Int,
    val nombreProfessors: Int,
    val nombreEstudiants: Int,
    val superficieMetresQuadrats: Double,
    val pressupostMilions: Double,
    val area: Area,
    val activa: Boolean,
    val assignatures: List<String>,
) {
    enum class Area {
        CIENCIES, SALUT, ENGINYERIA, HUMANITATS, CIENCIES_SOCIALS, ARTS
    }
}
