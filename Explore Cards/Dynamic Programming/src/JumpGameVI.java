public class JumpGameVI {
 
    /*Approach 1: Naive Dynamic Programming (Time Limit Exceeded)

    Let dp[i] is the maximum score we can get when ending at index i.
    Base case: dp[0] = nums[0], we start at index 0
    State transfer equation:
        If we have already computed dp[0], dp[1], ..., dp[i-1], how can we compute dp[i]?
        Since we can jump at most k steps, to arrive index i, we must jump from one of indices [i-k, i-k+1, ..., i-1].
        So dp[i] = max(dp[i-k], dp[i-k+1], ..., dp[i-1]) + nums[i].
    Finally, dp[n-1] is the maximum score when reaching the last index of the array, index n-1.*/
    
    /*public int maxResult(int[] nums, int k) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = nums[0];
        for (int i = 1; i < n; ++i)
            for (int j = Math.max(0, i - k); j < i; ++j)
                dp[i] = Math.max(dp[i], dp[j] + nums[i]);
        return dp[n-1];
    }*/

    /*
     * Complexity:

    Time: O(N * K), where N <= 10^5 is number of elements in nums, K <= 10^5 is the maximum steps that we can jump.
    Space: O(N)

     */

     //Reuse nums to eliminate dp array (Space Optimized)

     /*
      public int maxResult(int[] nums, int k) {
        int n = nums.length;
        for (int i = 1; i < n; ++i) {
            int best = Integer.MIN_VALUE;
            for (int j = Math.max(0, i - k); j < i; ++j)
                best = Math.max(best, nums[j] + nums[i]);
            nums[i] = best;
        }
        return nums[n-1];
    }
      */

      /*
       * Complexity:

    Time: O(N * K), where N <= 10^5 is number of elements in nums, K <= 10^5 is the maximum steps that we can jump.
    Space: O(1)

Approach 2: Dynamic Programming + Decreasing Deque (Accepted)

    We need a way to get a maximum value in range [dp[i-k], dp[i-k+1], ..., dp[i-1]] better than O(K) to avoid Time Limit Exceeded.
    This is the same with problem 239. Maximum in Sliding Window Size K problem.
    There are total 3 ways:
        By using MaxHeap, it costs O(logN)
        By using TreeMap, it costs O(logK)
        By using Decreasing Deque, it costs O(1)
    To make this post short, I choose to use Decreasing Deque which is O(1), for other ways please reference to this 239. Maximum in Sliding Window Size K post.
    In Decreasing Deque approach:
        We used a deque to store indices of nums elements, elements is in decreasing order, the front is the maximum element.
        When adding a new number nums[i], we eliminate elements which is less or equal to nums[i] in deque, which will never be chosen in the future.
        Push index of current nums[i] to back of the deque.
        If the last element in deque is out of range K then remove it.

       */

       public int maxResult(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> dq = new ArrayDeque<>(); // store index of `nums` elements, elements is in decreasing order, the front is the maximum element.
        dq.offer(0);
        for (int i = 1; i < n; ++i) {
            // nums[i] = max(nums[i-k], nums[i-k+1], .., nums[i-1]) + nums[i] = nums[dq.front()] + nums[i]
            nums[i] = nums[dq.peekFirst()] + nums[i];

            // Add nums[i] to our deque
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) dq.pollLast(); // Eliminate elements less or equal to nums[i], which will never be chosen in the future
            dq.offerLast(i);

            // Remove if the last element is out of window size k
            if (i - dq.peekFirst() >= k) dq.pollFirst();
        }
        return nums[n - 1];
    }
    /*
     * Complexity:

    Time: O(N), where N <= 10^5 is number of elements in nums, K <= 10^5 is the maximum steps that we can jump.
    Space: O(K)

     */
}
