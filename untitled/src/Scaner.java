import java.io.File;

public class Scaner {
    public static void main(String[] args) {
        printFloder(new File("E:/IdeaProjects/untitled"),1);
    }
    public static void printFloder(File file,int k){
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for(int i=0;i<files.length;i++){
                for(int j=0;j<k;j++){
                    System.out.print("  ");
                }
                System.out.println(files[i].getName());
                if(files[i].isDirectory()){
                    printFloder(files[i],k+1);
                }
            }
        }
    }
}
