package cat.montilivi.model

import kotlinx.serialization.Serializable

/**
 * Universitat que agrupa una o més facultats.
 *
 * Els camps de text representen dades curtes ([sigles]), mitjanes ([ciutat], [email])
 * i llargues ([descripcio]). [facultats] conté els identificadors de les facultats.
 */
@Serializable
data class Universitat(
    val id: String,
    val nom: String,
    val sigles: String,
    val ciutat: String,
    val email: String,
    val descripcio: String,
    val anyFundacio: Int,
    val nombreEstudiants: Int,
    val pressupostAnualMilions: Double,
    val puntuacio: Double,
    val tipus: Tipus,
    val titularitat: Titularitat,
    val teCampusInternacional: Boolean,
    val facultats: List<String>,
) {
    enum class Tipus {
        GENERALISTA, POLITECNICA, ARTISTICA, A_DISTANCIA
    }

    enum class Titularitat {
        PUBLICA, PRIVADA, CONCERTADA
    }
}
