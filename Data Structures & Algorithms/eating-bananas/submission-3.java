class Solution {
     public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();

        int ans = right;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(isValid(piles, mid, h) <= h) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }


    long isValid(int[] piles, int rate, int h) {

        long hrs = 0;

        for(int i=0; i<piles.length; i++) {
            hrs = hrs + (piles[i] + rate - 1)/rate;
        }
        return hrs;
    }
}
