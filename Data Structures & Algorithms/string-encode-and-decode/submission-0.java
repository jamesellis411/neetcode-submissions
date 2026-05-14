class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        StringBuilder str = new StringBuilder();
        List<Integer> strSize = new ArrayList<>();

        for (String s : strs){
            strSize.add(s.length());
        }

        for (int size : strSize){
            str.append(size).append(','); // Sizes all separated by commas
        }

        str.append('#'); // Delimiter between string sizes and the actual

        for (String s : strs){
            str.append(s);
        }

        return str.toString();
    }

    public List<String> decode(String str) {
        if (str.length() == 0) return new ArrayList<String>();
        List<String> retval = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while (str.charAt(i) != '#'){
            StringBuilder curr = new StringBuilder();
            while (str.charAt(i) != ','){
                curr.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(curr.toString()));
            i++;
        }
        i++;
        for (int size : sizes){
            retval.add(str.substring(i, i + size));
            i+=size;
        }
        return retval;
    }
}
