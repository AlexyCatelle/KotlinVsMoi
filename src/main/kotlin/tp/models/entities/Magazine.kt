package tp.models.entities

import tp.models.interfaces.Consultable

class Magazine (
    titre : String,
    anneePublication: Int,
    numero: Int
) : Document(titre, anneePublication = 0) , Consultable{
    override fun afficherInfos() {
        TODO("Not yet implemented")
    }
}