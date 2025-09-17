package tp.models.entities

import tp.models.enums.Genre

class Livre(
    titre : String,
    annneePublication: Int,
    auteurice: String,
    nbPages: Int,
    Genre: Genre)
    : Document(titre, annneePublication) {

    constructor(titre: String, auteurice: String, genre: Genre) :
            this(titre, 0, auteurice, 100, genre)

    override fun afficherInfos() {
        TODO("Not yet implemented")
    }
}