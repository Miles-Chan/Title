package JoyCastle;

import org.junit.Test;

public class TalentAssessmentSystemTests {
    @Test
    public void TestFindMedianTalentIndex()
    {
        int[] fireAbility = {1,3,7,9,11};
        int[] iceAbility = {2,4,8,10,12,14};
        System.out.println(TalentAssessmentSystem.FindMedianTalentIndex(fireAbility,iceAbility));
    }
}

//用二分法递归解决，所以时间复杂度为O(log(m+n))
//除了临时变量，没有创建额外空间，所以空间复杂度为O(1)

//进阶挑战

//1. 如果我们需要实时更新⼤量学徒的天赋指数，你会如何优化你的算法或数据结构？
//用平衡二叉搜索树实现，中位数可以通过遍历树到中间位置来找到，或者通过维护树中节点数量的额外信息来快速定位中位数。
//每次修改数值时，只需在树中找到对应节点并更新其值。

//2. 在游戏的⾼级模式中，可能会有更多的魔法属性（不仅仅是⽕和冰）。你的算法如何扩展到处理 k个有序数组的中位数？
//每次二分查找需要在每个数组中进行一次划分操作，所以总的时间复杂度为O(klogn)，空间复杂度为O(k)。

//创意思考

//这个天赋评估系统如何影响游戏的⻆⾊发展和技能学习机制？你能想到如何将这个概念融⼊到游戏的其他⽅⾯，⽐如任务系统或 PVP 对战中吗?
//角色更适合选择自身能力值高于数据中位数的魔法类型进行发展和相关技能学习才能体现优势。
//各个类型的任务难度和奖励共同得出一个中位数，玩家依此选择收益最大的任务来优先完成
//对所有玩家的对战能力进行各方面评估，得出中位数，匹配时按照双方玩家评估分数与中位数的差距缩小匹配范围。
