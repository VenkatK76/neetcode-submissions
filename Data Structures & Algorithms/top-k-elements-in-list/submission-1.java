
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        // 1 : 3
        // 2 : 6
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        System.out.println(list);

        int[] result = new int[k];
        for(int i=0; i<k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}
