package Day03;
//2、使用文件流复制myfile.txt文件为myfile_cp.txt
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Stream {
    private static Scanner scan;
    public static void main(String[] args) throws IOException {
        scan = new Scanner(System.in);
        createFile();
        FileInputStream fi = new FileInputStream("myfile.txt");
        FileOutputStream fo = new FileOutputStream("myfile_cp.txt");
        int length = -1;
        while((length = fi.read()) != -1){
            fo.write(length);
        }
        System.out.println("成功复制");

        fi.close();
        fo.close();
        scan.close();
    }
    public static FileOutputStream createFile() throws IOException{
        FileOutputStream fo = new FileOutputStream("myfile.txt",true);
        System.out.println("请输入文件内容：");
        String str = scan.nextLine();
        byte[] bytes = str.getBytes();
        fo.write(bytes);
        System.out.println("成功写入");
        fo.close();
        return fo;
    }
}
