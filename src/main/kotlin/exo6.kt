fun quelleCategorie(age: Int): String {
    return when (age) {
        in 3..6 -> "Baby"
        in 7..8 -> "Poussin"
        in 9..10 -> "Pupille"
        in 11..12 -> "Minime"
        else -> if (age >= 13) "Cadet" else "Trop jeune"
    }
}

fun main() {
    println("baby : " + quelleCategorie(5))
    println("poussin : " + quelleCategorie(8))
    println("pupille : " + quelleCategorie(10))
    println("minime : " + quelleCategorie(12))
    println("cadet : " + quelleCategorie( 15))
}