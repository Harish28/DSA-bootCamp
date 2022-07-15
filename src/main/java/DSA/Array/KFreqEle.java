package DSA.Array;

import java.util.*;

public class KFreqEle {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        List<Integer>[] freq = new ArrayList[nums.length + 1];
        for(int i : nums) {
            mp.put(i,mp.getOrDefault(i,0) + 1);
        }
        for(int key: mp.keySet()) {
            int fr = mp.get(key);
            if(freq[fr] == null) {
                freq[fr] = new ArrayList<>();
            }
            freq[fr].add(key);
        }
        List<Integer> res = new ArrayList<>();
        for(int i = freq.length - 1; i >= 0 && res.size() < k;i--) {
            res.addAll(freq[i]);
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
