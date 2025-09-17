package tp.models.entities

abstract class Document (
    var titre : String,
    var anneePublication : Int,
) {
    abstract fun afficherInfos()
}