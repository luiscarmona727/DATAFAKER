package cat.montilivi.proves

import net.datafaker.Faker
import java.util.Locale
import java.util.Random

fun main(){
    consolaUtf8()
    val faker = Faker()
    val fakerLangCat=Faker(Locale.forLanguageTag("ca"))
    val fakerCat=Faker(Locale("ca","CAT"))
    val fakerCatConstant= Faker(Locale("ca","CAT"), Random(6767))


    println("Per defecte (català): ${fakerLangCat.name().fullName()}")
    println("Ciutat: ${fakerLangCat.address().city()}")
    println("----------------------------------------------------------")
    println("Per defecte (català): ${fakerCat.name().fullName()}")
    println("Ciutat: ${fakerCat.address().city()}")
    println("----------------------------------------------------------")
    println("Per defecte (català): ${fakerCatConstant.name().fullName()}")
    println("Ciutat: ${fakerCatConstant.address().city()}")
}