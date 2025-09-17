package exos

import kotlin.collections.iterator

fun main (){
inscription()
    file()
    gestion()
}

// Cas 1 : Inscription
fun inscription(){
    val joueurs = sortedSetOf("Tutu", "Tata")
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

    val clients = ArrayDeque<String>()

    clients.add("Tutu")
    clients.add("Tata")
    clients.add("Titi")
    clients.add("Titi")
    clients.add("Toto")

    while (!clients.isEmpty()) {
        println("Appuyez sur Entrée pour traiter le prochain client...")
        readLine() // on attend que l'utilisateur appuie sur Entrée
        val client = clients.removeFirst()
        println("En cours de traitement : $client")
        println("Clients restants : ${clients.size}")
    }

    println("C'est l'heure de la pause.")
    }

// Cas 3 : Gestion de notes
fun gestion(){

    val notes = mutableMapOf(
        "Alice" to 15,
        "Bob" to 12,
        "Charlie" to 18,
        "Diana" to 14
    )

    println("Liste complète des élèves et leurs notes avant modif :")
    for ((nom, note) in notes) {
        println("$nom -> $note/20")
    }

    notes["Charlie"] = 19

    val derniereNote = notes["Diana"]
    println("Note du dernier élève ajouté (Diana) : $derniereNote")


    println("Liste complète des élèves et leurs notes après modif :")
    for ((nom, note) in notes) {
        println("$nom -> $note/20")
    }
}