class Jz27 {
    ArrayList<String> ret;
    public String[] permutation(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        if(charArr.length == 0) return new String[0];
        ret = new ArrayList<String>();
        int[] used = new int[charArr.length];
        int[] visited = new int[charArr.length];
        dfs(charArr, used, new ArrayList<Character>(), 0, visited);
        String[] trueRet = ret.toArray(new String[ret.size()]);

        return trueRet;
    }

    public void dfs(char[] charArr,int[] used, ArrayList<Character> temp, int first, int[] visited){
        if(temp.size() == charArr.length){
            ret.add(charToString(temp));
        }
        for(int i = 0; i < charArr.length; i++){
            if(used[i] == 1||(i > 0 && charArr[i - 1] == charArr[i] && used[i - 1] == 0)) continue;
            temp.add(charArr[i]);
            used[i] = 1;
            dfs(charArr, used, temp, i + 1, visited);
            used[i] = 0;
            temp.remove(temp.size() - 1);
        }
    }

    public String charToString(ArrayList<Character> temp){
        StringBuilder sb = new StringBuilder();
        for(Character i: temp){
            sb.append(i);
        }
        return sb.toString();
    }
}