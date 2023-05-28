fun main() {
    var input: String?
    do {
        print("Введите количество лайков (или 'end' для выхода): ")
        input = readLine()
        if (input != null && input != "end") {
            val likes = input.toIntOrNull() ?: 0

            val peopleSuffix = if (likes % 10 == 1 && likes % 100 != 11) {
                "человеку"
            } else {
                "людям"
            }

            println("Понравилось $likes $peopleSuffix")
        }
    } while (input != "end")
}