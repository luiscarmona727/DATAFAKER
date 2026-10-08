package cat.montilivi.model

import kotlinx.serialization.Serializable

/**
 * Guerrer que pertany a un clan.
 *
 * Totes les estadístiques ([forsa], [resistencia], [atac], [defensa], [vida], [agilitat],
 * [reputacio]) van de 0 a 100. L'[experiencia] va de 0 a 10.000 i determina el [rangMilitar]
 * i la [dataIncorporacio].
 */
@Serializable
data class Guerrer(
    val id: String,
    val nom: String,
    /** Nom de guerra; `null` si no en té. */
    val alias: String? = null,
    val idClan: String,
    /** URL d'un avatar de DiceBear de 256×256. Per a altres mides o estils, vegeu [Imatges.avatar]. */
    val foto: String,
    /** Color en format hexadecimal #RRGGBB. A Compose: `Color(android.graphics.Color.parseColor(color))` */
    val color: String,
    val motivacio: String = "",
    val historia: String,
    val enMissio: Boolean,
    val forsa: Int,
    val resistencia: Int,
    val atac: Int,
    val defensa: Int,
    val vida: Int,
    val agilitat: Int,
    val experiencia: Int,
    /**
     * Data en què va entrar al clan, en format AAAA-MM-DD (a Kotlin: `LocalDate.parse(dataIncorporacio)`).
     * Cada 1.000 punts d'[experiencia] són un any de servei, comptats fins a [Guerrer.DATA_ACTUAL].
     */
    val dataIncorporacio: String,
    val reputacio: Int,
    val habilitatsEspecials: List<Habilitat> = emptyList(),
    val equipament: List<Equipament> = emptyList(),
    val rangMilitar: Rang = Rang.NOVELL,
    val debilitats: List<String> = emptyList(),
    val historialBatalles: List<String> = emptyList(),
) {
    val teAlias: Boolean get() = alias != null

    companion object {
        /** El «dia d'avui» del món dels guerrers, en format AAAA-MM-DD. */
        const val DATA_ACTUAL = "1250-06-21"
    }

    enum class Rang {
        NOVELL, SOLDAT, VETERA, OFICIAL, CAP, GENERAL, LLEGENDA
    }

    enum class Equipament {
        ESPASA, DESTRAL, LLANSA, ARC, ARMADURA, ESCUT, CASC, CAVALL, POCIO_CURACIO, DAGA, MARTELL, FONDA
    }

    enum class Habilitat {
        COMBAT, ESTRATEGIA, VIGILANCIA, ESPIONATGE, EXPLORACIO, MAGIA, CURACIO, SIGIL
    }
}
