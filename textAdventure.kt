fun main() {
    var currentRoom = "dusty castle room"
    var direction = ""
    while (true) {
        println("You are in the $currentRoom.")
        when (currentRoom) {
            "dusty castle room" -> {
                println("Passages lead to the north and south.")
                direction = readLine() ?: ""
                currentRoom = when (direction) {
                    "n" -> "armory"
                    "s" -> "torch-lit hallway"
                    else -> "dusty castle room"
                }
            }
            "armory" -> {
                println("There is a room off to the south.")
                direction = readLine() ?: ""
                currentRoom = when (direction) {
                    "s" -> "dusty castle room"
                    else -> "armory"
                }
            }
            "torch-lit hallway" -> {
                println("There are rooms to the east and west.")
                direction = readLine() ?: ""
                currentRoom = when (direction) {
                    "e" -> "bedroom"
                    "w" -> "kitchen"
                    else -> "torch-lit hallway"
                }
            }
            "bedroom" -> {
                println("A hallway is to the west.")
                direction = readLine() ?: ""
                currentRoom = when (direction) {
                    "w" -> "torch-lit hallway"
                    else -> "bedroom"
                }
            }
            "kitchen" -> {
                println("A hallway is to the east.")
                direction = readLine() ?: ""
                currentRoom = when (direction) {
                    "e" -> "torch-lit hallway"
                    else -> "kitchen"
                }
            }
        }
        if (direction != "n" && direction != "s" && direction != "e" && direction != "w") {
            println("Can't go that way.")
        }
    }
}
