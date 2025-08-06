class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new LinkedList<>();
        int num = 1;
        for (int j = 0; j <= rowIndex; j++) {
            list.add(num);
            num = (int)((long)num * (rowIndex - j) / (j + 1));
        }
        return list;
    }
}
