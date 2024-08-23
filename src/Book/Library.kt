package Book

abstract class Library {
    abstract fun addBook(book: Book)
    abstract fun viewAllBooks()
    abstract fun findBooksByAuthor(author: String)
}