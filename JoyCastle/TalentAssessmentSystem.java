package JoyCastle;

public class TalentAssessmentSystem {

    public static double FindMedianTalentIndex(int[] fireAbility, int[]
            iceAbility)
    {
        int m = fireAbility.length;
        int n = iceAbility.length;
        int left = (m + n + 1) / 2;
        int right = (m + n + 2) / 2;
        return (find(fireAbility, 0, iceAbility, 0, left) + find(fireAbility, 0, iceAbility, 0, right)) / 2.0;
    }

    public static int find(int[] nums1, int i, int[] nums2, int j, int k) {
        if (i >= nums1.length)
            return nums2[j + k - 1]; // nums1数组全部被舍弃
        if (j >= nums2.length)
            return nums1[i + k - 1]; // nums2数组全部被舍弃
        // 当k = 1 的时候，两个数组的布局基本相同，最后只需要找到
        if (k == 1) {
            return Math.min(nums1[i], nums2[j]);
        }

        /*
         * 分别找到两个数组中的第k/2位置的元素，如果不存在就给他赋最大值， 比较两个值，值小的数组则淘汰其前k/2个元素 最后把k也减去k/2，继续递归
         */
        int mid1 = (i + k / 2 - 1 < nums1.length) ? nums1[i + k / 2 - 1] : Integer.MAX_VALUE;
        int mid2 = (j + k / 2 - 1 < nums2.length) ? nums2[j + k / 2 - 1] : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return find(nums1, i + k / 2, nums2, j, k - k / 2);
        } else {
            return find(nums1, i, nums2, j + k / 2, k - k / 2);
        }

    }
}
