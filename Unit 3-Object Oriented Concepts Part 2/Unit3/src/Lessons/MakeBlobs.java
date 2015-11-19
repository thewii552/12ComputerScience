/*
   ____  ____   ___    ____     ___ __    __      _      ____  ______ 
  /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package Lessons;


public class MakeBlobs {
    public static void main(String[] args){
    Blob b = new Blob();
    Blob c = new Blob("Seyi");
    b.setName("Jeff");
    System.out.println("This is "+b.getName() + " the blob");
    System.out.println("This is "+c.getName() + " the blob");
    System.out.println("There are now "+c.getNumBlobs() + " blobs");
    }
}
