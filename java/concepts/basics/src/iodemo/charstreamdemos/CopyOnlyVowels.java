package iodemo.charstreamdemos;

import java.io.*;

public class CopyOnlyVowels {
    public static void main(String[] args) {
        CopyOnlyVowels copyOnlyVowels=new CopyOnlyVowels();
        copyOnlyVowels.execute();
    }
    void execute(){
        File inputFile=new File("D:/sania/dir/names.txt");
        File outputFile=new File("D:/sania/dir/onlyVowels.txt");
        Reader reader=null;
        Writer writer=null;
        try {
            reader = new FileReader(inputFile);
            writer = new FileWriter(outputFile);
            int readChar;
            int vowelsCount = 0;
            while ((readChar = reader.read()) != -1) {
                char ch=(char) readChar;
                if(ch=='\n'){
                    writer.write('\n');
                }
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    writer.write(readChar);
                    vowelsCount++;
                }
            }
            System.out.println("file copy done vowels count=" + vowelsCount);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            close(reader);
            close(writer);
        }
    }
    void close(Reader reader){
        try {
            if(reader!=null){
                reader.close();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
    void close(Writer writer){
        try {
            if(writer!=null){
                writer.close();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
