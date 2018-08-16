/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import sun.util.calendar.ZoneInfoFile;

/**
 *
 * @author AGUIRREMR
 */
public class main {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String fileName = "C:/Users/AguirreMR/Desktop/sampleFile.txt";
        Path path = Paths.get(fileName);

        //CREATE
        File file = new File(fileName);
        file.createNewFile();

//        //WRITE
        String value = "Line 1\nline 2\nline 3 ";
        Files.write(path, value.getBytes());
//        //READ
        Charset charset = Charset.defaultCharset();
        for (String line : Files.readAllLines(path, charset)) {
            System.out.println(line);
        }
//        String path = "C:/Users/AguirreMR/Desktop/";
//        File file = new File(path);
//        getFilename(file);

    }

    private static void getFilename(File fileOrigin) {
        File[] pathName = fileOrigin.listFiles();
        for (File folder : pathName) {
            if (folder.isDirectory()) {
                getFilename(folder);
            } else {
                System.out.println(folder.getName());
            }

        }
    }

}
