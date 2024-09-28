package JoyCastle;

import java.util.ArrayList;
import java.util.List;

public class LeaderboardSystem {
    public static List<Integer> GetTopScores(int[] scores, int m)
    {
        if(scores==null)
        {
            System.out.println("数组为空");
            return null;
        }
        else if(m>scores.length)
        {
            System.out.println("m⼤于数组⻓度");
            return null;
        }
        List<Integer> list =new ArrayList<>();
        for(int i=1;i<=m;i++)
        {
            for(int j=0;j<scores.length-i;j++)
            {
                if(scores[j]>scores[j+1])
                {
                    int temp=scores[j+1];
                    scores[j+1]=scores[j];
                    scores[j]=temp;
                }
            }
            list.add(scores[scores.length-i]);
        }
        return list;
    }
}

