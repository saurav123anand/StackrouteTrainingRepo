package iodemo;

import java.io.*;

public class SongCopy {
    public static void main(String[] args) {
        SongCopy songCopy=new SongCopy();
        songCopy.execute();
    }
    void execute() {
        File inputFile = new File("E:/songs/Alone.mp3");
        File outputFile = new File("D:/sania/AloneCopy.mp3");
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(inputFile);
            BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);
            outputStream = new FileOutputStream(outputFile);
            BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(outputStream);
            byte readBytes[]=new byte[1024];
            int bytesCount = 0,totalBytesCount=0;
            //rwad method will every time read the file in integer representation and after all the file reads will
            //return -1
            while ((bytesCount = bufferedInputStream.read(readBytes)) != -1) {
                bufferedOutputStream.write(readBytes,0,bytesCount);
                totalBytesCount=totalBytesCount+bytesCount;
            }
            System.out.println("file copy done bytes count=" + totalBytesCount);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(inputStream);
            close(outputStream);

        }
    }

    void close(InputStream stream) {
        try {

            if (stream != null) {
                stream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void close(OutputStream stream) {
        try {

            if (stream != null) {
                stream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
