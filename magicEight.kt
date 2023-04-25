fun main() {
    val responses = arrayOf(
        "It is certain",
        "Without a doubt",
        "You may rely on it",
        "Yes, definitely",
        "It is decidedly so",
        "As I see it, yes",
        "Most likely",
        "Outlook good",
        "Yes",
        "Signs point to yes",
        "Reply hazy, try again",
        "Better not tell you now",
        "Ask again later",
        "Cannot predict now",
        "Concentrate and ask again",
        "Don't count on it",
        "Outlook not so good",
        "My sources say no",
        "Very doubtful",
        "My reply is no"
    )

    while (true) {
        println("Ask a yes or no question (or type 'quit' to exit): ")
        val input = readLine()
        if (input == "quit") {
            break
        }
        val responseIndex = (0 until responses.size).random()
        println(responses[responseIndex])
    }
}
