package tp.models.interfaces

import tp.models.exceptions.DocumentDejaEmprunteException

interface Empruntable {
    var estEmprunte:Boolean

    fun emprunter()

    fun rendre() }