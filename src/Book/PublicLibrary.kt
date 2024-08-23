package Book

class PublicLibrary : Library() {
    private val books = mutableListOf<Book>()

    override fun addBook(book: Book) {
       books.add(book)
    }
    override fun viewAllBooks() {
        for (book in books){
           println("Title: ${book.title}, " +
                   "Author: ${book.author}, " +
                   "Year: ${book.year}")
        }
    }
    override fun findBooksByAuthor(author: String) {
        for (book in books) {
            if (book.author == author) {
                println("Title: ${book.title}, " +
                        "Author: ${book.author}, " +
                        "Year: ${book.year}")
            }
        }
    }
}