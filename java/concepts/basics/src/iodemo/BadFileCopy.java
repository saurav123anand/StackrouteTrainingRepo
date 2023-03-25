package iodemo;

import java.io.*;

public class BadFileCopy {
    public static void main(String[] args) {
        BadFileCopy badFileCopy = new BadFileCopy();
        /*try {
            badFileCopy.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        badFileCopy.execute1();

    }

    void execute() throws FileNotFoundException, IOException {
        File inputFile = new File("E:/FSD/mydir/names.txt");
        File outputFile = new File("E:/FSD/mydir/namescopy.txt");
        InputStream inputStream = new FileInputStream(inputFile);
        OutputStream outputStream = new FileOutputStream(outputFile);
        int readByte;
        int bytesCount = 0;
        //rwad method will every time read the file in integer representation and after all the file reads will
        //return -1
        while ((readByte = inputStream.read()) != -1) {
            outputStream.write(readByte);
            bytesCount++;
        }
        System.out.println("file copy done bytes count=" + bytesCount);
    }

    void execute1() {
        File inputFile = new File("E:/FSD/mydir/names.txt");
        File outputFile = new File("E:/FSD/mydir/namescopy.txt");
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(inputFile);
            outputStream = new FileOutputStream(outputFile);
            int readByte;
            int bytesCount = 0;
            //rwad method will every time read the file in integer representation and after all the file reads will
            //return -1
            while ((readByte = inputStream.read()) != -1) {
                outputStream.write(readByte);
                bytesCount++;
            }
            System.out.println("file copy done bytes count=" + bytesCount);
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
