package exos

import exos.model.Livre

fun main (){
    // Objet avec le constructeur primaire
    val livre1 = Livre("1984", "George Orwell", 328)

    // Objet avec le constructeur secondaire
    val livre2 = Livre("Le Petit Prince", "Antoine de Saint-Exupéry")

    // Affichage des descriptions
    println(livre1.description())
    println(livre2.description())
};
