import java.io.File

val work by lazy {
        println("Start")
    "Result"
    }

val hometown by lazy { selectHometown() }

    private fun selectHometown() = File("towns.txt")
        .readText()
        .split("\n")
        .shuffled()
        .first()

fun main(args: Array<String>) {
   /* Свойство hometown остается неинициализированным до первого обращения к нему.
   В этот момент выполнится код лямбды в lazy.
   Обратите внимание, что этот код выполнится только один раз, при первом обращении к делегированному свойству
   Все дальнейшие обращения к этому свойству будут использовать ранее полученный результат вместо повторных вычислений.
    */
    println(hometown)
    println(work)

}