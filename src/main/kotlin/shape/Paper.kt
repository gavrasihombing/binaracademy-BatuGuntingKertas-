package shape

class Paper(private val player1: String): Shape() {

    override fun printResult() {
        println("Hasil: ")
        when(player1){
            "KERTAS" -> {
                println("DRAW!")
            }
            "GUNTING" -> {
                println("PEMAIN 1 MENANG!")
            }
            "BATU" -> {
                println("PEMAIN 2 MENANG!")
            }
        }
    }

}