/**
 * Created by Tarun on 7/1/2017.
 */
public class DungeonGame {






    public int calculateMinimumHP(int[][] dungeon) {

        int m=dungeon.length;
        int n=dungeon[0].length;
        if(dungeon[m-1][n-1]>=0)
            dungeon[m-1][n-1]=1;
        else
            dungeon[m-1][n-1]= Math.abs(dungeon[m-1][n-1])+1;
        for(int i=m-2;i>=0;i--)
        {
            dungeon[i][n-1] = dungeon[i][n-1]<=0 ? (dungeon[i+1][n-1] - dungeon[i][n-1]):1;
        }


        for(int i=n-2;i>=0;i--)
        {
            dungeon[m-1][i] = dungeon[m-1][i]<=0 ? (dungeon[m-1][i+1] - dungeon[m-1][i]):1;
        }



        for(int i=m-2;i>=0;i--)
        {
            for(int j=n-2;j>=0;j--)
            {
                dungeon[i][j] = dungeon[i][j]<=0 ?  Math.min( dungeon[i+1][j]-dungeon[i][j], dungeon[i][j+1]-dungeon[i][j]) :
                        Math.min( dungeon[i+1][j], dungeon[i][j+1]);

            }
        }



        return dungeon[0][0];



    }


}
