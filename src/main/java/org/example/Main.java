package org.example;

import org.apache.commons.io.*;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

        new Main().t1();
    }
    void t1(){
        try {
            FileUtils.copyFile(new File("c:\\__kko\\1.dat"), new File("c:\\__kko\\2.dat"));
        }catch(Exception e){}
        try {
            FileUtils.copyFileToDirectory(new File("c:\\__kko\\1.dat"), new File("c:\\__kko\\2"));
        }catch(Exception e){}
        try {
            FileUtils.moveFileToDirectory(new File("c:\\__kko\\2.dat"), new File("c:\\__kko\\3"),true);
        }catch(Exception e){}

        try {
            List<String> lines=FileUtils.readLines(new File("c:\\__kko\\pom.xml.txt"));
            System.out.println( String.join(",",lines) );
        }catch(Exception e){System.out.println(e);}

        try{
            String fileAsString = FileUtils.readFileToString(new File("c:\\__kko\\pom.xml.txt"), StandardCharsets.UTF_8);
            System.out.println(fileAsString);
        }catch(Exception e){System.out.println(e);}
    }
}