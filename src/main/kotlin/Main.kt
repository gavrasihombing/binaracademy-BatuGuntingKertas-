import shape.Paper
import shape.Rock
import shape.Scissors

class App {

    private lateinit var player1: String
    private lateinit var player2: String

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val app = App()
            app.printHeader()
            app.input()
        }
    }

    fun printHeader() {
        println("""
        ==========================
        GAME SUIT TERMINAL VERSION
        ==========================
        HARUS PAKAI HURUF KAPITAL
        """.trimIndent())
    }

    private fun input() {
        print("1. Masukkan pemain 1: ")
        readLine()?.let {
            player1 = it
            print("2. Masukkan pemain 2: ")
            readLine()?.let {
                player2 = it
                when (player2) {
                    "GUNTING" -> {
                        Scissors(player1).printResult()
                    }
                    "KERTAS" -> {
                        Paper(player1).printResult()
                    }
                    "BATU" -> {
                        Rock(player1).printResult()
                    }
                }
            }
        }
    }

}