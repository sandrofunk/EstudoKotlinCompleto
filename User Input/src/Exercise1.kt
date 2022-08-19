fun main(args: Array<String>){
    println("Qual ano que você nasceu ?")
    val ano = readLine()?:""
    val idade = 2022 - ano.toInt()
    println("A sua idade é $idade")
}