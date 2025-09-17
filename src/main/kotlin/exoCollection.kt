fun main (){
inscription()
    file()
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

}