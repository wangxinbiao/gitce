public class A1 {
    public static void main(String[] args) {
        int r[] = new int[]{1,20,13,14,9,7,12,10,8};
        insertSortAsc(r);
        float f=3.4f;
    }

    //直接插入排序
    public static void insertSortAsc(int[] keys){
        for(int i=1;i<keys.length;i++){
            int temp = keys[i],j;//从数组的第二个开始进行插入排序
            for(j=i-1; j>=0 && temp<keys[j]; j--){
                keys[j+1] = keys[j];//将已经排好序的子序列逆序与temp相比，比temp大，就将位置空出来，自己往后移！
            }
            keys[j+1] = temp;
        }
        for (int i = 0; i <keys.length ; i++) {
            System.out.print(keys[i]+" ");
        }
    }

    //折半插入排序

    //快速排序
    public void sort(int arr[],int low,int high) {
        int l=low;
        int h=high;
        int povit=arr[low];

        while(l<h){
            while(l<h&&arr[h]>=povit)
                h--;
            if(l<h){
            int temp=arr[h];
            arr[h]=arr[l];
            arr[l]=temp;
            l++;
        }

        while(l<h&&arr[l]<=povit)
            l++;

        if(l<h){
            int temp=arr[h];
            arr[h]=arr[l];
            arr[l]=temp;
            h--;
        }
        }
        System.out.print("l="+(l+1)+"h="+(h+1)+"povit="+povit+"\n");
        if(l>low)sort(arr,low,l-1);
        if(h<high)sort(arr,l+1,high);
        }
}
