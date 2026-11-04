class Solution {
    public List<String> stringMatching(String[] w) {

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < w.length; i++) {
            String s = w[i];
            for (int j = 0; j < w.length; j++) {
                String r = w[j];
                if (i!=j && s.contains(r) && !list.contains(r)){
                    list.add(r);
                 
                }
            }
        }
        return list;

    }
}