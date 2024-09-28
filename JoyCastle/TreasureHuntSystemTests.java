package JoyCastle;

import org.junit.Test;

public class TreasureHuntSystemTests {
    @Test
    public void TestMaxTreasureValue()
    {
        int[] treasures={3,1,5,2,4};
        System.out.println(TreasureHuntSystem.MaxTreasureValue(treasures));
    }
}

//最经典的dp问题（小偷问题），只用遍历一次数组，因此时间复杂度为O(n)
//我并没有用数组存取所有结果，只是用临时变量(滚动数组)进行更新，所以空间复杂度为O(1)

//进阶挑战

//如果我们允许玩家使⽤⼀次"魔法钥匙"，可以安全地打开任意两个相邻的宝箱⽽不触发陷阱，你会如何修改你的算法？
//用标志位来判断魔法钥匙是否已经使用（0代表未使用，1代表已经使用）
//初始化dp[0][0]=treasures[0]; dp[1][0]=max(treasures[0],treasures[1]);
//dp[1][1]=treasures[0]+treasures[1]; dp[2][0]=max(treasures[0]+treasures[2],treasures[1]);
//dp[2][1]=max(treasures[0]+treasures[1],treasures[1]+treasures[2]);
//更新：dp[i][0]=max(dp[i-1][0],dp[i-2][0]+treasures[i]);
//dp[i][1]=max(dp[i-1][1],dp[i-3][0]+treasures[i-1]+treasures[i+2]);
//maxvalue=max(dp[n-1][0],dp[n-1][1]);

//在游戏的⾼级关卡中，有些宝箱可能包含负值（表⽰陷阱会扣除玩家的分数）。你的算法如何处理这种情况？
//负数对更新影响不大，只需改动if(treasures.length==1) return max(0,treasures[0]);
//int next=max(0,treasures[0]);

//创意思考

//这个机制可能会在游戏中带来哪些有趣的策略选择？你能想到如何将这个概念扩展到⼀个完整的游戏关卡设计中吗？
//最优路径规划、资源分配与决策优化、博弈与对抗策略。
//设计一个迷宫关卡，玩家需要利用动态规划的策略找到从起点到终点的最短路径。迷宫中布满了陷阱和障碍物，玩家需要仔细分析每个节点的状态和转移概率，以避免陷阱并选择最优路径。
