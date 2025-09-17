package tp.models.interfaces

interface Empruntable {
    var estEmprunte:Boolean

    fun emprunter()
    fun rendre()
}