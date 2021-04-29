package shape

class Scissors(private val player1: String): Shape() {

    override fun printResult() {
        println("Hasil: ")
        when(player1){
            "GUNTING" -> {
                println("DRAW!")
            }
            "BATU" -> {
                println("Pemain 1 MENANG!")
            }
            "KERTAS" -> {
                println("Pemain 2 Menang!")
            }
        }
    }

}