fun compterLettreA(texte : String) : Int{
    var count = 0;

    for (l in texte){
        if ( l == 'a' || l == 'A') count++
    }
    return count;
};


fun main (){
println( "2 : " + compterLettreA("C'est le b-a ba"))
    println("0 : " + compterLettreA("mixer"))
};