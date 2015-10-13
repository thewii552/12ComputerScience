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


public class Book {
    private final String author;
    private final String title;
    
    public Book(String titl, String auth){
        author = auth;
        title = titl;
    }
    
    
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    
    @Override
    public String toString(){
        return title+" by "+author;
    }
    

}
