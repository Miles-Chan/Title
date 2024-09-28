package JoyCastle;

import org.junit.Test;

public class EnergyFieldSystemTests {
    @Test
    public void TestMaxEnergyField() {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(EnergyFieldSystem.MaxEnergyField(heights));
    }
}

//两个嵌套循环遍历所有的可能，因此时间复杂度为O(n^2)
//只用到了几个临时变量，因此空间复杂度为O(1)

//进阶挑战：

//1.如果我们允许玩家使⽤魔法道具来临时增加某个位置的塔的⾼度，你会如何修改你的算法？
//如果是只能增加增加一个塔的高度，那么加入一个传参addH代表增加的高度，
//修改float area = (float) ((heights[i] + heights[j]+addH) * (j-i)*0.5);

//2. 在游戏的⾼级模式中，某些位置可能有建筑限制（⾼度为0）。你的算法如何处理这种情况？
//在计算梯形面积之前先检查塔的高度，并跳过那些高度为0的位置。

//创意思考
//这个能量场机制如何影响玩家在游戏中的策略选择？你能想到如何将这个概念扩展到⼀个有趣的游戏玩法中吗？
//玩家必须考虑塔高和塔间距来进行最佳选择，需要一定的计算能力和对面积的敏感度。
//玩法：可以考虑构建能量网对敌方攻击进行拦截，对拦截下的弹幕进行计分，每波攻击可以更换建塔地点，玩家在远处观察弹幕的分布来选择最佳策略。
