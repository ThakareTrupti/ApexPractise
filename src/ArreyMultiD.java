public class ArreyMultiD {
    public static void main(String[] args) {
        int a[][][]=new int[4][4][4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<4;k++)
                {
                   a[i][j][k]=i+k+j;
                }
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<4;k++)
                {
                    System.out.print(a[i][j][k]+ " ");
                }
            }
        }
    }
}
