/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package SortingThreaded.Sorter;

public abstract class Sorter implements Runnable {

    static int[] nums;

    public Sorter(int[] n) {
        nums = new int[n.length];
        System.arraycopy(n, 0, nums, 0, n.length);
    }

    public abstract void sort(int[] a);

    public int[] getArray(){
        return nums;
    }
    
    
    public abstract void run();
}
