package model

class Etudiant (val nom: String, val age : Int) {

    init {
        count++
    }
companion object {
    var count:Int = 0
    private set

    fun afficherCompteur() {
        println("Nombre d'étudiants créés : $count")
    }
}
}
