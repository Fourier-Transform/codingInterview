public class Jz12 {
    public double Power(double base, int exponent) {
        if(base == 0) return 0;
        if(exponent == 0) return 1;
        double sum = 1;
        for(int i = 0; i < Math.abs(exponent); i++){
            sum *= base;
        }
        if(exponent < 0){
            sum = 1/sum;
        }
        return sum;
  }
}