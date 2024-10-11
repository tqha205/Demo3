package javacore;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ChekedExceptionSample {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);

//   phương thức này dùng để sửa lỗi  Exception.
        try {
            Files.createFile(Paths.get("student.txt"));
        } catch (FileAlreadyExistsException e) {
            System.out.println("file ");
        } catch (IOException e) {
//            e.printStackTrace();

            System.out.println("exeption :" + e.toString());
        }catch (Exception e){

        }finally {
            System.out.println("luon luon thuc hien");
        }
        System.out.println("after exeption");

    }
}
