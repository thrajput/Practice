/**
 * Created by Tarun on 7/1/2017.
 * https://leetcode.com/problems/count-primes/#/description
 *
 */
public class CountPrimes {

    public int countPrimes(int n) {

        boolean[] nonPrimes=new boolean[n+1];
        int count=0;
        for(int i=2;i<=n/2;i++)
        {
            for(int j=2;i*j<n;j++)
                nonPrimes[i*j]=true;
        }
        for(int i=2;i<n;i++)
        {
            if(nonPrimes[i]==false)
                count++;
        }

        return count;
    }




}
