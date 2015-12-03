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


public class InsertDeleteOldWay {
    
    static int logicalSize = 0;
    
    public static void main (String args[]){
        String fruits[] = new String [10];
        fruits[0]="Apple";
        fruits[1]="Kiwi";
        fruits[2]="Orange";
        fruits[3]="Strawberry";
        logicalSize=4;
        showFruits(fruits);
        System.out.println("Adding banana\n");
        //First need to find where it goes, then insert the banana there
        int location = findInsertPoint(fruits, "Banana");
        insert(fruits, "Banana", location);
        showFruits(fruits);
       
    }
    
    public static void showFruits(String f[]){
        for (int x = 0; x < logicalSize; x++){
            System.out.println(f[x]);
        }
    }
    
    public static int search (Object[] a, Object searchValue){
	   int left = 0;
	   int right = a.length-1;
	   while (left <= right){
	      int midpoint = (left + right) / 2;
	      int result = ((Comparable)a[midpoint]).compareTo(searchValue); 
	      if (result == 0)
	         return midpoint;
	      else if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
	   return -1;	
		   
}

//////////////////////////////////////////////////////////////////////////////////

public static boolean insert(Object array[], Object newItem, int targetIndex)
{
	// Check for a full array and return false if full
	if (logicalSize == array.length)
	   return false;
	// Check for valid target index or return false 
	if (targetIndex < 0 || targetIndex > logicalSize)
	   return false;
	// Shift items down by one position
	for (int i = logicalSize; i > targetIndex; i--)      
	   array[i] = array[i - 1];
	// Add new item, increment logical size,return true                       
	array[targetIndex] = newItem; 
	logicalSize++;
	return true; 
}

//////////////////////////////////////////////////////////////////////////////////
	
public static boolean delete(Object array[], int targetIndex)
{
	if (targetIndex < 0 || targetIndex >= logicalSize)
		   return false;
		 
		// Shift items up by one position
		for (int i = targetIndex; i < logicalSize - 1; i++)       
		   array[i] = array[i + 1];
		 
		// Decrement logical size and return true 
		logicalSize--; 
		return true;                                   
}

/////////////////////////////////////////////////////////////////////////////////
	
public static int findInsertPoint (Object a[], Object searchValue){
	   int left = 0;
	   int right = logicalSize-1;
	   int midpoint=0;
	   
	   while (left <= right){
	      midpoint = (left + right) / 2;
	   
	      int result = ((Comparable)a[midpoint]).compareTo(searchValue); 
	   
	     if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
	   if(((Comparable)a[midpoint]).compareTo(searchValue) < 0)
	   midpoint++;
	   return midpoint;	   
}


}
