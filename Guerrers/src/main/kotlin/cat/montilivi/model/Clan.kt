package cat.montilivi.model

import kotlinx.serialization.Serializable

/**
 * Clan de guerrers, establert en un territori.
 *
 * Les relacions són coherents: el [lider] és un dels [membres], els membres tenen aquest clan
 * com a `idClan`, i si el clan A és enemic (o aliat) de B, B també ho és d'A.
 * Els indicadors ([reputacioGlobal] ... [habilitatDiplomatica]) van de 0 a 100.
 * L'[anyDeFundacio] va del 255 al 1214 i els [recursosEconomics], de 1.000 a 2.000.000 monedes.
 */
@Serializable
data class Clan(
    val id: String,
    val nom: String,
    val origen: String,
    val idTerritori: String,
    val lema: String,
    /** URL d'una imatge de 200×200. Per a altres mides, vegeu [Imatges.foto]. */
    val escut: String,
    val anyDeFundacio: Int,
    val historia: String,
    val filosofia: Filosofia,
    /** Id del guerrer que lidera el clan. */
    val lider: String,
    /** Ids dels guerrers del clan. */
    val membres: List<String>,
    /** Ids dels clans enemics. */
    val enemics: List<String>,
    /** Ids dels clans aliats. */
    val aliats: List<String>,
    val recursosEconomics: Int,
    val tecnologiesAvancades: Boolean,
    val tradicions: List<Tradicio>,
    val idiomaPrincipal: String,
    val religioPredominant: String,
    val festivitatsImportants: List<String>,
    val relacionsInternacionals: List<String>,
    val reputacioGlobal: Int,
    val influenciaPolitica: Int,
    val capacitatMilitar: Int,
    val nivellTecnologic: Int,
    val estabilitatEconomica: Int,
    val desenvolupamentCultural: Int,
    val benestarGeneral: Int,
    val habilitatDiplomatica: Int,
) {
    enum class Filosofia {
        HONOR, PODER, SAVIESA, LLEIALTAT, LLIBERTAT, JUSTICIA, VALOR, COMPASSIO
    }

    enum class Tradicio {
        RELIGIOSA, MILITAR, SOCIAL, CULTURAL, FESTIVA
    }
}
