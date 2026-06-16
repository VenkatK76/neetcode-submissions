
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // [1,2,2,3,3,3]
        // 1:1, 2:3, 3:3
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        // Bucket Sort Algorithm        
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        System.out.println(map.keySet());
        // 0: null, 1: [1], 2: [2], 3: [3], 4: null, 5: null, 6: null
        for(int num: map.keySet()) {
            int freq = map.get(num);
            if(buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        }
        
        int[] result = new int[k];
        int index = 0;

        for(int i=buckets.length-1; i>=0; i--) {
            if(buckets[i] != null) {
                for(int num: buckets[i]) {
                    result[index] = num;
                    index++;
                    if(index == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
