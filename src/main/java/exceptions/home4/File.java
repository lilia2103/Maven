package exceptions.home4;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class File {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File();
        file.fileContent();
    }
    void fileContent() throws FileNotFoundException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String name = sc.nextLine();

        try(Scanner input = new Scanner(new java.io.File(name))){
            while (input.hasNextLine()){
                System.out.println(input.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
