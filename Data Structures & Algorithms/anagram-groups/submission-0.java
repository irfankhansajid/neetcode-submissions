class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

		HashMap<String, List<String>> map = new HashMap<>();
		
		for (String currentString : strs) {
		    char[] chars = currentString.toCharArray();
		    Arrays.sort(chars);
		    String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(currentString);
		    
		}
        return new ArrayList<>(map.values());
        
    }
}
