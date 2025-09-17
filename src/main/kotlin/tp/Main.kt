package tp

import tp.models.entities.Document
import tp.models.entities.Livre
import tp.models.entities.Magazine
import tp.models.enums.Genre

fun main(){

    // Créez plusieurs livres (de genres différents) et magazines. - START

    val livre1 = Livre("Frankenstein", 1818, "Mary Shelley", 280, Genre.FANTASTIQUE)
    val livre2 = Livre("Orlando", 1928, "Virginia Woolf", 320, Genre.ROMAN)
    val livre3 = Livre("Le Deuxième Sexe", 1949, "Simone de Beauvoir", 450, Genre.ROMAN)
    val livre4 = Livre("La Servante écarlate", 1985, "Margaret Atwood", 400, Genre.SCIENCE_FICTION)


    val mag1 = Magazine("Science & Vie", 2023, 210)
    val mag2 = Magazine("National Geographic", 2022, 47)

    // Créez plusieurs livres (de genres différents) et magazines. - END

    // Stockez-les dans une collection (MutableList<Document>). - START

    val bibliotheque: MutableList<Document> = mutableListOf(livre1, livre2, livre3, mag1, mag2)

    // Stockez-les dans une collection (MutableList<Document>). - END

// Affichez la liste complète des documents avec afficherInfos(). - START
    bibliotheque.forEach { it.afficherInfos() }
    // - Affichez la liste complète des documents avec afficherInfos(). - END

    // Simulez plusieurs actions - START
    livre1.emprunter()
    livre1.emprunter()
    livre1.rendre()
    livre2.rendre()
    mag1.consulter()
    // Simulez plusieurs actions - END
}