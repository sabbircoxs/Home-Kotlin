package Book

fun main() {
    val library = PublicLibrary()

    library.addBook(Book("Pather Panchali", "Bibhutibhushan", 1929))
    library.addBook(Book("Gitanjoli", "Robindronath", 1910))
    library.addBook(Book("Araynyak", "Bibhutibhushan", 1939))

    println("All books in the library:")
    library.viewAllBooks()

    println("\nBooks by Robindronath:")
    library.findBooksByAuthor("Robindronath")
}
