Q3. Write a method called copyOf(), which accept an int array and returns a copy of the given array. 
The method's signature is as follows:
public static int[] copyOf(int[] array) 



import java.util.Arrays;
  
public class Main
{
    public static void main(String args[])
    {
        // initializing an array original
        int[] org = new int[] {1, 2 ,3};
  
        System.out.println("Original Array");
        for (int i = 0; i < org.length; i++)
            System.out.print(org[i] + " ");
  
        // copying array org to copy
        int[] copy = Arrays.copyOf(org, 5);
  
        // Changing some elements of copy
        copy[3] = 11;
        copy[4] = 55;
  
        System.out.println("\nNew array copy after modifications:");
        for (int i = 0; i < copy.length; i++)
            System.out.print(copy[i] + " ");
    }
}

Output:

Original Array
1 2 3 
New array copy after modifications:
1 2 3 11 55 