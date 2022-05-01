import java.util.Objects;
public class Books {
    private int bookId;
    private String bookName;
    private int quantityTotal;
    Books(int bookId,String bookName,int quantityTotal){
        this.bookId = bookId;
        this.bookName = bookName;
        this.quantityTotal = quantityTotal;
    }
    public int getBookId(){
        return bookId;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if(!(obj instanceof Books))
            return false;
        Books book = (Books) obj;
        return (
                book.bookId == this.bookId && book.bookName.equals(this.bookName)  &&
                book.quantityTotal == this.quantityTotal
                );
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(bookId, bookName, quantityTotal);
    }

}


class Main {

    public static void main(String[] args) {
        Books book1 = new Books(1,"The Secret",5);
        Books book2 = new Books(1,"The Secret",5);
        Books book3 = new Books(2,"You",6);
        Books book4 = book1;
        // both values are primitive so the values are compared.
        System.out.println(book1.getBookId() == book2.getBookId()); // true
        // both are objects, so the reference of the objects are compared
        System.out.println(book1 == book2); // false
        // book1 and book4 points to the same object and has the same reference
        System.out.println(book1 == book4); // true
        // equals method is overridden such that it compares the values of in the object.
        System.out.println(book1.equals(book2)); // true
        System.out.println(book1.equals(book3)); // false

        // when two objects are equal then their hashcode will also be the same
        System.out.println(book1.hashCode()); // 1823316614
        System.out.println(book2.hashCode());//  1823316614
        System.out.println(book3.hashCode()); // 2793416

        // checking equality with hashcode is faster than equals
        System.out.println(book1.hashCode() == book2.hashCode());

    }
}

