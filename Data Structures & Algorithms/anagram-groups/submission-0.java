class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> maps = new HashMap<>();

        for (String str:strs) {

            int[] map = new int[26];
            for (char ch:str.toCharArray()) {
                map[ch - 'a']++;
            }
            List<String> list = maps.getOrDefault(Arrays.toString(map), new ArrayList<>());
            list.add(str);
            maps.put(Arrays.toString(map), list);

        }

        for (Map.Entry<String, List<String>> map: maps.entrySet()) {
            result.add(map.getValue());
        }
        return result;
    }
}
