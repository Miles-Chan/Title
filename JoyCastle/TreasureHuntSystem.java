package JoyCastle;

public class TreasureHuntSystem {
    public static int MaxTreasureValue(int[] treasures)
    {
        if(treasures.length==0)
                return 0;
        if(treasures.length==1)
                return treasures[0];
        int pre=0;
        int next=treasures[0];
        int value=Math.max(pre+treasures[1],next);
        for(int i=2;i<treasures.length;i++)
        {
            pre=next;
            next=value;
            value=Math.max(pre+treasures[i],next);
        }
        return value;
    }

}
