import java.util.*


class Books(val bookId: Int, val bookName: String, val totalQuantity: Int){

    override fun equals(obj: Any?): Boolean {
        if (this === obj) return true
        if (obj !is Books) return false
        val book = obj
        return book.bookId == this.bookId && book.bookName == this.bookName && book.totalQuantity == this.totalQuantity
    }
    override fun hashCode(): Int {
        return Objects.hash(bookId, bookName, totalQuantity)
    }
}

fun main(){

    val book1 = Books(1,"You",5)
    val book2 = Books(1,"You",5)
    val book3 = Books(2,"The secret",6)

    // ==( Structural equality ) internally calls equals method
    println(book1 == book2) // true

    // referential equality
    println(book1 === book2) // false
    println(book1.hashCode()) // 2792454
    println(book2.hashCode()) // 2792454
    println(book3.hashCode()) // 158664296

    // checking equality with hashcode is faster than equals
    println(book1.hashCode() == book2.hashCode())
 }

