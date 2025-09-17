package tp.models.entities

import tp.models.enums.Genre
import tp.models.exceptions.DocumentDejaEmprunteException
import tp.models.exceptions.DocumentNonEmprunteException
import tp.models.interfaces.Consultable
import tp.models.interfaces.Empruntable

class Livre(
    titre : String,
    anneePublication: Int,
    val auteurice: String,
    val nbPages: Int,
    val genre: Genre,
    override var estEmprunte: Boolean = false)

    : Document(titre, anneePublication), Empruntable, Consultable {


    constructor(titre: String, auteurice: String, genre: Genre) :
            this(titre, 0, auteurice, 100, genre)

    override fun afficherInfos(
    ) {

        println("Livre: \"$titre\" (${anneePublication}), Auteur: $auteurice, Pages: $nbPages, Genre: $genre.")
    }

    override fun emprunter() {
        try{
            if(estEmprunte) {
                throw DocumentDejaEmprunteException("Le livre \"$titre\" est déjà emprunté.")
            }
       estEmprunte = true
       println("Vous avez emprunté le livre \"$titre\" avec succès.")
        }catch (e:Exception){
            println("erreur lors de l'emprunt de \"$titre\" : ${e.message}")
        }
    }

    override fun rendre() {
try {
    if(!estEmprunte) {
        throw DocumentNonEmprunteException("Le livre \"$titre\" n'est pas actuellement emprunté.")
    }
    estEmprunte = false
    println("\"$titre\" est rendu avec succès.")

}catch (e:Exception){
    println("erreur lors du retour de \"$titre\" : ${e.message}")
}
    }
}