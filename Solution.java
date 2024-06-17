class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] inp = text.split(" ");
        List<String> out = new ArrayList<>();

        for(int i=0; i<inp.length-2; i++){
            if(inp[i].equals(first) && inp[i+1].equals(second)){
                out.add(inp[i+2]);
            }
        }

        String[] nums = new String[out.size()];
        for(int i=0; i<nums.length; i++){
            nums[i] = out.get(i);
        }
        return nums;
    }
}
