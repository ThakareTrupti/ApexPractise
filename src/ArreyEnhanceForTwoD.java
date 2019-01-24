public class ArreyEnhanceForTwoD
{
    public static void main(String[] args)
    {
        int b = 2, c = 3, d = 4, e = 5;
        int x[] = {2, 3, 4, 5};
        int y[] = {6, 7, 8, 9};
        int z[] = {1, 2, 3, 4};
        int a[][] = {{2, 3, 4, 5},
                {6, 7, 8, 9},
                {1, 2, 3, 4}};
        for (int i[] : a)
        {
            for (int j : i)
            {
                System.out.print(j + " ");
            }


            System.out.println();
        }
    }

}
