package iodemo;

import java.io.File;

public class FileApiEx {
    public static void main(String[] args) {
       FileApiEx fileApiEx=new FileApiEx();
       fileApiEx.execute();
    }
    public void execute(){
        File dir=new File("E:/FSD/mydir");
        boolean isDir1=dir.isDirectory();
        boolean isExists1=dir.exists();
        System.out.println("mydir is a directory "+isDir1+" exists "+isExists1);

        File file=new File("E:/FSD/mydir/names.txt");
        boolean isDir2=file.isDirectory();
        boolean isExists2=file.exists();
        System.out.println("names.txt is a directory "+isDir2+" exists "+isExists2);

        //getting all the files in the directory
        File files[]=dir.listFiles();
        for(File iterated:files){
            System.out.println("iterated file "+iterated.getName());
        }
    }
}
