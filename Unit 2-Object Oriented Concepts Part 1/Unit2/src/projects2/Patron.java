/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package projects2;

public class Patron {

    private Book[] books = new Book[3];
    private int numBooks = 0;
    private final String name;

    public Patron(String n) {
        name = n;
    }

    //If the patron has borrowed 3 books, return false. Else, borrow the book and return true
    public boolean borrow(Book b) {
        if (numBooks < 3) {
            books[numBooks] = b;
            numBooks++;
            return true;
        } else {
            return false;
        }
    }

    public boolean returnBook(Book b) {
        for (int x = 0; x < books.length; x++) {
            if (books[x] == b) {
                //They have the book
                books[x] = null;
                numBooks--;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean hasBook(Book b) {
        for (Book bk : books) {
            if (bk == b) {
                return true;
            }
        }
        return false;

    }
    
    public String getName(){
        return name;
    }
}
