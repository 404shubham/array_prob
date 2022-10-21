import java.util.*;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the number of elements in the given array");
        
        int n = sc.nextInt();
        
        //declaring the given array
        
        int[] arr = new int[n];
        
        //getting the elements of the array
        
        for(int i = 0; i < n; i++)
        {
               System.out.println("enter the "+i+" element of the array");
               
               arr[i] = sc.nextInt();
            
        }
        
        int temp_element = 1;
        
        //declaring product array
        int [] pro_arr = new int[n];
        
        for(int j = 0; j < n; j++)
        {
            temp_element = temp_element*arr[j];
        }
        
        for(int k = 0; k < n; k++)
        {
              pro_arr[k] = temp_element/arr[k];
        }
        
        for(int p = 0; p < n; p++)
        {
             System.out.println(pro_arr[p]);
        }
        
    }
}
