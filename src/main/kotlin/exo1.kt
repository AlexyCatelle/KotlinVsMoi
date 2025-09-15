fun nomComplet (prenom : String, nom: String) : String{
    return prenom+nom;
};


fun main (){
    val test = nomComplet("John","Doe");
    println(test);
};