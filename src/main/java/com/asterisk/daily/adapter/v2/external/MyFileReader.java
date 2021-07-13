package com.asterisk.daily.adapter.v2.external;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyFileReader implements FileReader{
    @Override
    public String[] read() {
        ClassLoader classLoader = getClass().getClassLoader();
        String[] lines=new String[1];
//        String[] lines = new String[0];
        try {
            File file = new File(classLoader.getResource("Myfile.txt").getFile());
            java.io.FileReader fr = new java.io.FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            lines = new String[1];
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                if (i > 0) {
                    String[] temp = new String[i + 1];
                    for (int j = 0, linesLength = lines.length; j < linesLength; j++) {
                        temp[j] = lines[j];
                    }
                    i++;
                    temp[i - 1] = line;
                    lines = temp;
                }else {
                    lines[i++] = line;
                }
            }
            fr.close();
//            System.out.println("Contents of file: ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }
}
