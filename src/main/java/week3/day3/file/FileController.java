package week3.day3.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileController {
    public void printFileList(){
        File dir = new File("./");
        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file);
        }
    }
    public void createANewFile() throws IOException {
        File file = new File("./numbers.txt");
        file.createNewFile();
        System.out.println("파일 생성 되었는지?:" + file.exists());
    }

    public void readUsingFileInputStream(String filename) {


    }

    public void bufferedReaderByByte(String filename) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );

        System.out.println((char)br.read());
        System.out.println((char)br.read());
        System.out.println((char)br.read());
        System.out.println((char)br.read());

    }
    public void bufferedReader(String filename) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) throws IOException {
        FileController fc = new FileController();
//        fc.printFileList();
        fc.bufferedReader("8842height.phe.txt");

    }
}