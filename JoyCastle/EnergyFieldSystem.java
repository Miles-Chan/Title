package JoyCastle;

public class EnergyFieldSystem {
    public static float MaxEnergyField(int[] heights)
    {
        float maxArea = 0;
        int n = heights.length;

        // 遍历所有可能
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                float area = (float) ((heights[i] + heights[j]) * (j-i)*0.5);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}

