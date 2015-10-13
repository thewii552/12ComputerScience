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


public class Library {
    private static Patron p;
    private static final Book[] b = new Book[5];
    
    public static void main (String args[]){
        p = new Patron("Khaled El-Ahmad");
        
        //Initialize the books
        b[0]= new Book("From Russia With Love","Greg Hines");
        b[1]= new Book("Living Smart","Rita Langill");
        b[2]= new Book("Singing in the Rain","Harry Conner");
        b[3]= new Book("Good Housekeeping","Pat Burns");
        b[4]= new Book("To Be a Model","Lisa Lahey");
        
        //Print the books
        System.out.println("These are the books available:\n");
        for (Book bk:b){
            System.out.println(bk);
        }
        
        //Lend the books
        System.out.println("\n\nLending 4 books to "+p.getName());
        
        
        
    }
}
