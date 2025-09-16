package model

class Livre (var titre: String, var auteur: String, var nbPages: Int){

    constructor(titre: String, auteur: String) :this(titre,auteur,100)

    fun description() :String {
       return  "Le livre $titre écrit par $auteur contient $nbPages pages."
    }
}
