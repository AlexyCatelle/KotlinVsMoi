package tp.models.entities

import tp.models.interfaces.Consultable

class Magazine (
    titre : String,
    anneePublication: Int,
    var numero: Int
) : Document(titre, anneePublication) , Consultable{
    override fun afficherInfos() {
        println("Livre: \"$titre\" (${anneePublication}) n° $numero.")
    }
}