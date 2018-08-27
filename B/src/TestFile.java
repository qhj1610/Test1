import java.io.File;

/**
 * 测试File类
 * mkdir()  只能创建一级目录，且父目录必须存在，否则无法创建成功
 * mkdirs()  可以创建多级目录，父目录可以不存在
 */
public class TestFile {

    public static void main(String[] args) {
        File file = new File("E:/b/a");
        try {
            file.mkdir();

        }catch(Exception exception){
            exception.printStackTrace();
        }

        System.out.println(file.exists());
    }

}
