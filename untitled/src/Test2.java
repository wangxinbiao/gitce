public class Test2 {
    public static void main(String[] args) {
//        int n = 10;
//        if(n%2 != 0){
//            System.out.println((n/2)+" "+(n/2+1));
//        }
//        int[] a = new int[n/2];
//        for (int i = 0; i <a.length ; i++) {
//            a[i] = i+1;
//        }
//        fun1(a, n, 0, 0);
        getAns(15);
    }
    public static void getAns(int n) {
        int min = 1;
        int sum = 1;
        int max = 1;
        while(min <= n/2+1) {
            if(sum == n) {
                for(int k = min; k<=max; k++) {
                    System.out.print(k+"");
                }
                System.out.println();
                sum = sum - min;
                min ++;
                max ++;
                sum = sum+max;
            }
            if(sum > n) {
                sum = sum - min;
                min ++;
            } else {
                max ++;
                sum = sum + max;
            }
        }
    }

//    public static void fun1(int[] a,int n,int sum,int t){
//        for (int i = t; i <a.length ; i++) {
//            sum = sum + a[i];
//            if(sum < n){
//                fun1(a,n,sum,t++);
//            }else if(sum == n){
//                t = t + 1;
//            }else{
//
//            }
//        }
//    }
}
