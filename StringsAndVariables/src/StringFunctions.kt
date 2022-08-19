import java.util.*

fun main(args: Array<String>) {
    val myPet = "Crocodile"
    println(myPet.length)
    println(myPet.get(3))
    println(myPet[3])
    println(myPet.substring(3))
    println(myPet.substring(3,6))

    val myName = "michelle"
    println(myName.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })

    val myAnimal = "Giraffe"
    println(myAnimal.replaceFirstChar { it.lowercase(Locale.getDefault()) })

    val myText = "   there are  too many  spaces      "
    println(myText.trim())


}