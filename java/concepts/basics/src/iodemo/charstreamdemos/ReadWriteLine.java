package iodemo.charstreamdemos;

import java.io.*;

public class ReadWriteLine {
    public static void main(String[] args) {
       ReadWriteLine readWriteLine=new ReadWriteLine();
       readWriteLine.execute();
    }
    void execute(){
        InputStream inputStream=System.in;
        OutputStream outputStream=System.out;
        Reader reader=null;
        Writer writer=null;
        try {
            reader=new InputStreamReader(inputStream);
            BufferedReader bufferedReader=new BufferedReader(reader);
            writer=new OutputStreamWriter(outputStream);
            BufferedWriter bufferedWriter=new BufferedWriter(writer);
            System.out.println("Read line and write it back");
            String line=bufferedReader.readLine();
            int value=Integer.parseInt(line);
            System.out.println("value read= "+value);
            bufferedWriter.write(line);
            bufferedWriter.flush();
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
