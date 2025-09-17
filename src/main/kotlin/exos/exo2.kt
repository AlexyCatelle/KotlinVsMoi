package exos

fun soustraction (a: Int, b: Int) :Int {
    println("Je soustrais $a et $b");
    return a - b;
}

fun main(){
    val test = soustraction(2,1);
    println(test);
};