class Solution {
    public int[][] kClosest(int[][] points, int k) {

        int[][] result = new int[k][2];
        
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(Comparator.comparingInt((int[] x) -> x[0] * x[0] + x[1] * x[1]).reversed());

        for(int[] point : points) {
            maxHeap.add(point);

            if(maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int i=0;

        while(!maxHeap.isEmpty()) {


            int[] point = maxHeap.poll();

            result[i][0] = point[0];
            result[i][1] = point[1];
            i++;
        }
        return result;

    }
}
