public class ArreyTwoDEx {
    public static void main(String[] args)
    {
        int b=2,c=3,d=4,e=5;
        int x[] = {2, 3, 4, 5};
        int y[] = {6, 7, 8, 9};
        int z[] = {1, 2, 3, 4};
        int a[][] = {{2, 3, 4, 5},
                     {6, 7, 8, 9},
                     {1, 2, 3, 4}};
          for(int i=0;i<3;i++)
          {
              for(int j=0;j<4;j++)
              {
                  System.out.print(a[i][j]+ " ");
              }
              System.out.println();
          }

        }
    }

