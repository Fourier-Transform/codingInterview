public class Jz48 {
    public int Add(int num1,int num2) {
        int sum = 0;
        int temp1 = 0 ,temp2 = 0;
        do{
            temp1 = num1^num2;
            temp2 = (num1&num2) << 1;
            if(temp2 == 0) return temp1;
            num1 = temp1;
            num2 = temp2;
        }while(true);
    }
}