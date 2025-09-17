fun main (){
inscription()
}

// Cas 1 : Inscription
fun inscription(){
    var joueurs = sortedSetOf("Tutu", "Tata")
    joueurs.add("Tutu")
    joueurs.add("Tata")
    joueurs.add("Titi")
    joueurs.add("Titi")
    joueurs.add("Toto")
    joueurs.add("Tutu")

    println(joueurs)

    val search = "Tutu"
    println("Le joueur $search est-il inscrit ? ${search in joueurs}")
}


// Cas 2 : File d'attente
fun file(){

}

// Cas 3 : Gestion de notes
fun gestion(){

}