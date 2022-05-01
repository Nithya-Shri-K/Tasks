import java.util.*


// Compiler automatically creates the equals, hashCode, toString, and copy functions
data class Book(val bookId: Int, val bookName: String, val totalQuantity: Int)

fun main(){

    val book1 = Book(1,"You",5)
    val book2 = Book(1,"You",5)
    val book3 = Book(2,"The secret",6)

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

