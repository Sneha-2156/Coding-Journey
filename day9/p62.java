package day9;
//Richest customer wealth -LC 1672
public class p62 {
    public static int maimumxWealth(int[][] accounts){
        int maxWealth = 0;
        //visit each customer
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            //add money in each bank
            for(int j=0;j<accounts.length;j++){
                sum += accounts[i][j];
            }
            //update maximum wealth
            if(sum>maxWealth){
                maxWealth=sum;
            }
        }
        return maxWealth;
    }
    void main() {
        int[][] accounts={{1,2,3},{3,2,1}};
        System.out.println(maimumxWealth(accounts));
    }
}

//Time = 0(m*n) ; Space = 0(1)
