import java.io.File;

public class HelloFolder {
    public static void main(String[] args) {
//        File file = new File("Folder");
//        if(file.mkdir()){
//            System.out.println("创建成功");
//        }else{
//            System.out.println("创建失败");
//        }

//        File file = new File("Folder");
//        File file1 = new File("new folder");
//        file.renameTo(file1);

//        File file = new File("new folder/one/two/main");
//        file.mkdirs();

        File file = new File("new folder/one/two");
        File file1 = new File("new folder/two");
        file.renameTo(file1);
    }
}
