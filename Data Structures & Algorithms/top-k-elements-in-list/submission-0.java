class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i<nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int currentCount = map.get(nums[i]);
                map.put(nums[i], currentCount + 1);
            } else {
                map.put(nums[i], 1);
            }
           
            
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(b) - map.get(a);
            }
        });

        for (int key : map.keySet()) {
            
            heap.add(key);
            
        }

        int[] result = new int[k];
        for (int i = 0; i<k; i++) {
            result[i] = heap.poll();
        }
        return result;


    }
}
