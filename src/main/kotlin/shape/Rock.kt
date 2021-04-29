package shape

class Rock(private val player1: String): Shape() {

    override fun printResult() {
        println("Hasil: ")
        when(player1){
            "BATU" -> {
                println("DRAW!")
            }
            "KERTAS" -> {
                println("PEMAIN 1 MENANG!")
            }
            "GUNTING" -> {
                println("PEMAIN 2 MENANG!")
            }
        }
    }

}