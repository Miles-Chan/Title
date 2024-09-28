package JoyCastle;

import org.junit.Test;

import java.util.List;

public class LeaderboardSystemTests {
    @Test
    public void TestGetTopScores() {
        int[] scores = {100, 50, 75, 80, 65};
        int m = 3;
        List<Integer> list = LeaderboardSystem.GetTopScores(scores, m);
        if (list != null) {
            System.out.println(list);
        }
    }
}
//用的是最直接的冒泡的思路，但只需要m次冒泡，所以时间复杂度：O(m*n)

//优化方案：
//用小根堆，再定义一个top数组用于存储小根堆m，将海量数据的前m个元素先填满top堆
//调整top堆为最小堆结构
//通过遍历将新数据与堆顶元素（此时堆顶元素最小）比较，大于堆顶元素就入堆，并下调堆结构
//遍历结束，则堆中的元素即n个数中最大的前m个数。时间复杂度为O(nlogm)
//如果数据更大，可以用字典树或者跳表进行优化
