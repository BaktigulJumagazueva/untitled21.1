package Urok2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
jazuuchu();
okuuchu();

    }
    public static void jazuuchu() {
        try {
            FileWriter fileWriter = new FileWriter("text.txt");
                for (char i = 'A'; i <= 'Z'; i++) {
                    String a= i +""+Character.toLowerCase(i)+"\n";
                    fileWriter.append(a);
                    System.out.println();
                }
            for (char i = '0'; i <='9' ; i++) {
                fileWriter.append(i+"\n");
            }

                fileWriter.close();
            } catch(IOException e){
                System.out.println("файл не найден");
            }
        }

        public static void okuuchu(){
            try {
                FileReader fileReader = new FileReader("text.txt");
                Scanner scanner = new Scanner(fileReader);
                int c=1;
                while (scanner.hasNextLine()) {
                    System.out.println(c+")"+scanner.nextLine());
                    c++;
                }
                fileReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("файл не найден");
            } catch (IOException e) {
                System.out.println(" IO exception has been handled");
            }
        }
    }
