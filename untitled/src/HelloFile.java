import java.io.File;
import java.io.IOException;

public class HelloFile {
    public static void main(String[] args) {
        File file = new File("Hello File.txt");
        if(file.exists()){
            File file1 = new File("new hello file.txt");
            file.renameTo(file1);

            //将文件移动到另一个地方时，必须在同一个分区，只能将c盘的文件移到c盘，而不能移到d盘
            File file2 = new File("d:/hello.txt");
            file.renameTo(file2);
            //判断是否为文件
            System.out.println(file.isFile());
            //判断是否为文件夹
            System.out.println(file.isDirectory());
            //删除文件
//            file.delete();
        }else{
            try {
                file.createNewFile();
                System.out.println("文件创建成功");
            } catch (IOException e) {
                System.out.println("文件无法被创建");
            }
        }
    }

}
