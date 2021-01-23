class Jz19 {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0) return new int[0];
        int l = 0, r = matrix[0].length - 1, u = 0, d = matrix.length - 1;
        int flag = 0;
        int l1 = 0, l2 = 0;
        List<Integer> list = new ArrayList<>();
        while(l<=r && u<=d){
            switch(flag){
                case 0:
                while(l2 <= r){
                    list.add(matrix[l1][l2]);
                    l2++;
                }
                l2--;
                l1++;
                u++;
                flag = (flag+1)%4;
                break;

                case 1:
                while(l1 <= d){
                    list.add(matrix[l1][l2]);
                    l1++;
                }
                l1--;
                l2--;
                r--;
                flag = (flag+1)%4;
                break;

                case 2:
                while(l2 >= l){
                    list.add(matrix[l1][l2]);
                    l2--;
                }
                l2++;
                l1--;
                d--;
                flag = (flag+1)%4;
                break;

                case 3:
                while(l1 >= u){
                    list.add(matrix[l1][l2]);
                    l1--;
                }
                l1++;
                l2++;
                l++;
                flag = (flag+1)%4;
                break;
            }
        }
        int[] ret = new int[matrix.length*matrix[0].length];
        int count = 0;
        for(Integer i: list){
            ret[count++] = i;
        }
        return ret;
    }
}