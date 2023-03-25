package iodemo.charstreamdemos;

import java.io.*;

public class FileCopyChangeString {
    public static void main(String[] args) {
        FileCopyChangeString fileCopyChangeString=new FileCopyChangeString();
        fileCopyChangeString.execute();
    }

    void execute(){
        File inputFile=new File("D:/sania/dir/names.txt");
        File outputFile=new File("D:/sania/dir/namesCopy.txt");
        Reader reader=null;
        Writer writer=null;
        try {
            reader=new FileReader(inputFile);
            writer=new FileWriter(outputFile);

            BufferedReader bufferedReader=new BufferedReader(reader);
            BufferedWriter bufferedWriter=new BufferedWriter(writer);

            System.out.println("Read line and write it back");
            String readLine;
            while((readLine=bufferedReader.readLine())!=null){
                if(readLine.contains("mohit")){
                    readLine=readLine.replace("mohit","somnath");
                }
                bufferedWriter.write(readLine+"\n");
            }
            bufferedWriter.flush();
            System.out.println("file copy done mohit changed to somnath");
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
