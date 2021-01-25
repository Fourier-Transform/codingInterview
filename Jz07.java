import java.math.BigInteger;
class Jz07 {
    public int fib(int n) {
        if(n == 0 || n == 1) return n;
        ArrayList<BigInteger> fibArr = new ArrayList<>();
        fibArr.add(new BigInteger("0"));
        fibArr.add(new BigInteger("1"));
        for(int i = 2; i <= n; i++){
            fibArr.add(fibArr.get(i - 1).add(fibArr.get(i - 2)));
        }
        return fibArr.get(fibArr.size() - 1).divideAndRemainder(new BigInteger("1000000007"))[1].intValue();
    }
}