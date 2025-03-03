package Java_new.FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreatingNewFile {

    /// /creating a new file
//    public static void main(String[] args) {
//        try {
//            File myobj = new File("MyFile.txt");
//            if (myobj.createNewFile()) {
//                System.out.println("File Created: " + myobj.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//    }
//}

/// /Write to a file
//public static void main(String[]args){
//try {
//    FileWriter myWriter = new FileWriter("myFile.txt");
//    myWriter.write("File in java might tough");
//    myWriter.close();
//    System.out.println("wrote in the file");
//}
//catch(IOException e){
//    System.out.println("An error occured");
//    e.printStackTrace();
//
//}
//}
//}

//public static void main(String[] args) {
//try{
//File myObj = new File("MyFile.txt");
//    Scanner myReader = new Scanner(myObj);
//
//    while(myReader.hasNextLine()){
//        String data = myReader.nextLine();
//        System.out.println(data);
//    }
//    myReader.close();
//}catch (FileNotFoundException e){
//    System.out.println("An error occurred.");
//    e.printStackTrace();
//}
//}
//}

//public static void main(String[] args) {
//    try{
//        File f1 = new File("myFile.txt");
//        Scanner dataReader = new Scanner(f1);
//        while(dataReader.hasNextLine()){
//
//            String filedata = dataReader.nextLine();
//            System.out.println(filedata);
//        }
//        dataReader.close();
//    }catch(FileNotFoundException exception){
//        System.out.println("Unexpected erroe occured!");
//        exception.printStackTrace();
//    }
//    }
//}
public static void main(String[] args) {
    File f0 = new File("myFile.txt");
    if (f0.delete()) {
        System.out.println("File deleted successfully :"+ f0.getName());
    }else{
        System.out.println("File could not be deleted");
    }
    }
}