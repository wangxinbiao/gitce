public class Array {
    public static void main(String[] args) {
        Integer r[] = new Integer[]{1,20,13,14,9,7,12,10,8};
        System.out.println("排序前：");
        for (int i = 0; i <r.length ; i++) {
            System.out.print(r[i]+" ");
        }
        System.out.println();
        System.out.println("排序后：");
        for (int i=1; i<r.length; i++) {
            int temp = r[i];
            for (int j = 0; j <i ; j++) {
                if(temp<r[j]){
                    for(int k =i;k>j;k--){
                        System.out.print(r[k]);
                    r[k]=r[k-1];
                    }
                    r[j]=temp;
                }
            }
        }
        System.out.println(r[4]);
    }
}
