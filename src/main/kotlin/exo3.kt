import jdk.internal.vm.vector.VectorSupport.test

fun quelleHeure(heure : String ="12h00"){
    println("Il est $heure")
}

fun main(){
    quelleHeure();
    quelleHeure("14h00");
}