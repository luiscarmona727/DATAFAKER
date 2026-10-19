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
    val alias: String? = null,
    val anyFundacio: Int,
    val dataInauguracio: String, // AAAA-MM-DD
    val nombreEstudiants: Int,
    val pressupostAnualMilions: Double,
    val puntuacio: Int, // 0..100
    val tipus: Tipus,
    val titularitat: Titularitat,
    val teCampusInternacional: Boolean = false,
    val logo: String,                         // DiceBear
    val colorCorporatiu: String = "#1976D2",  // #RRGGBB
    val idiomes: List<String> = emptyList(),  // chips
    val facultats: List<String> = emptyList(),
) {
    val teAlias: Boolean get() = alias != null   // calculada, no es serialitza

    enum class Tipus { GENERALISTA, POLITECNICA, ARTISTICA, A_DISTANCIA }
    enum class Titularitat { PUBLICA, PRIVADA, CONCERTADA, CONSORCIADA }
}
