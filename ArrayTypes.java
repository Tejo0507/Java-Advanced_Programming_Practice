package Array;
public class ArrayTypes
{
    public static void main(String[] args)
    {
        System.out.println("=== Single-Dimensional Array ===");
        int[] singleArray = {10, 20, 30, 40, 50};
        // Using for loop
        for (int i = 0; i < singleArray.length; i++)
        {
            System.out.println("Element at index " + i + ": " + singleArray[i]);
        }
        System.out.println("\n=== Multi-Dimensional Array (Matrix) ===");
        int[][] multiArray =
                {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
                };

        for (int i = 0; i < multiArray.length; i++)
        {
            for (int j = 0; j < multiArray[i].length; j++)
            {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n=== Jagged Array ===");
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[]{1, 2};
        jaggedArray[1] = new int[]{3, 4, 5};
        jaggedArray[2] = new int[]{6};

        for (int i = 0; i < jaggedArray.length; i++)
        {
            for (int j = 0; j < jaggedArray[i].length; j++)
            {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}