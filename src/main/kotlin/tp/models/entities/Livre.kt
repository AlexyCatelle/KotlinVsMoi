package tp.models.entities

import tp.models.enums.Genre
import tp.models.interfaces.Empruntable

class Livre(
    titre : String,
    annneePublication: Int,
    auteurice: String,
    nbPages: Int,
    Genre: Genre,
    override var estEmprunte: Boolean = false)

    : Document(titre, annneePublication), Empruntable {




    constructor(titre: String, auteurice: String, genre: Genre) :
            this(titre, 0, auteurice, 100, genre)

    override fun afficherInfos() {
        TODO("Not yet implemented")
    }

    override fun emprunter() {
        TODO("Not yet implemented")
    }

    override fun rendre() {
        TODO("Not yet implemented")
    }
}