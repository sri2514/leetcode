class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new LinkedList<>();
        for(int i = 0 ; i < numRows ; i++){
            List<Integer> pascal = new LinkedList<>();
            int num = 1;
            for(int j = 0 ; j <= i ; j++){
                pascal.add(num);
                num = (num * (i - j))/ (j + 1);
            }
            list.add(pascal);
        }
        return list;
    }
}