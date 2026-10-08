package cat.montilivi.model

import kotlinx.serialization.Serializable

/**
 * Territori on s'estableixen els clans. El [clima] és coherent amb el [tipus]
 * (un desert sempre és desèrtic, una glacera sempre és polar...).
 *
 * La [grandariaKm2] va de 500 a 500.000 (amb dos decimals) i la [poblacio], de 2.500 a 10.000.000.
 * Tots els territoris tenen com a mínim un clan.
 */
@Serializable
data class Territori(
    val id: String,
    val nom: String,
    val ubicacioGeografica: String,
    val grandariaKm2: Double,
    val tipus: TipusTerritori,
    val recursosNaturals: List<String>,
    /** Ids dels clans establerts en aquest territori. */
    val clans: List<String>,
    val clima: Clima,
    val poblacio: Int,
    val historia: String,
    /** URL d'una imatge apaïsada de 400×250. Per a altres mides, vegeu [Imatges.foto]. */
    val foto: String,
) {
    enum class TipusTerritori {
        MUNTANYA, PLA, COSTA, DESERT, SELVA, GLACIAR
    }

    enum class Clima {
        TEMPLAT, CONTINENTAL, MEDITERRANI, POLAR, TROPICAL, DESERTIC, MUNTANYOS
    }
}
