package tp.models.entities

class Magazine (
    titre : String,
    anneePublication: Int,
    numero: Int
) : Document(titre, anneePublication = 0) {
    override fun afficherInfos() {
        TODO("Not yet implemented")
    }
}