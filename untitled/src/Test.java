public class Test {
    public static void main(String[] args) {
//        String str = "azxcasxcvz";
//        fun1(str,str.length());
//        int[] A=new int[]{1,3,6,28,7,9,5,7};
//        fun2(A, 1, 8, 7);

    }

    public static void fun1(String str,int n){
        String[] split = str.split("");
        for (int i = 0; i < n; i++) {
            //System.out.println(split[i]);
            for (int j = i+1; j < n; j++) {
                if(split[i].equals(split[j]) ){
                    System.out.println(split[i]);
                    return;
                }
            }
        }
    }

    public static void fun2(int[] A,int low,int higth,int val){
        int l = low;
        int h = higth;
        int mid;
        if(l<h){
            mid = (l+h)/2;
            if(A[mid] == val){
                System.out.println(mid);
            }else if(A[mid] < val){
                l=mid+1;
                fun2(A,l,h,val);
            }else{
                h=mid-1;
                fun2(A,l,h,val);
            }
        }
    }


}
