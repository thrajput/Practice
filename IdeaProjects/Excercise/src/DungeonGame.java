/**
 * Created by Tarun on 7/1/2017.
 */
public class DungeonGame {




    public int calculateMinimumHP(int[][] dungeon) {

        int ph=dungeon[0][0]<0?-dungeon[0][0]+1:0;
        for(int i=0;i<dungeon.length;i++)
        {
            for(int j=0;j<dungeon[i].length;j++)
            {
                if(i>=1 && j>=1)
                {
                    dungeon[i][j]=Math.max(dungeon[i-1][j]+dungeon[i][j], dungeon[i][j-1]+dungeon[i][j]);
                    if(dungeon[i][j]<0)
                        ph=ph+(-dungeon[i][j]);
                }

                if(i>=1 && j==0)
                    dungeon[i][j]=dungeon[i-1][j]+dungeon[i][j];
                if(i==0 && j>=1)
                    dungeon[i][j]=dungeon[i][j-1]+dungeon[i][j];


            }

        }

        if(dungeon.length>1 && dungeon[0].length>1 && Math.max(dungeon[0][1],dungeon[1][0])<0)
            ph+=-(Math.max(dungeon[0][1],dungeon[1][0]));



        return ph==0?1:ph;



    }


}
