fun main() {
    try {
        print("Please enter the start number: ")
        val start = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("Invalid input for start number.")

        print("Please enter the count number: ")
        val count = readLine()?.toIntOrNull() ?: throw IllegalArgumentException("Invalid input for count number.")

        if (start <= 0 || count <= 0) {
            throw IllegalArgumentException("Both start and count must be greater than zero.")
        }

    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}

