package RepositoryPack;

import java.io.*;

public class RepositoryFile {


    public File createFile(String path) {
        File file = new File(path);
        try {
            if (!file.createNewFile()) {
                file = new File(path);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return file;
    }


    public void fileAppendText(File file, String text) {
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readFromFileByRow(File file) {
        String text="";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                text=line+"\n";
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
    public String readFromFile(File file){
        StringBuilder stringBuilder=new StringBuilder();
        String text = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                stringBuilder.append(line+"\n");
                line = reader.readLine();
            }
            text= String.valueOf(stringBuilder);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }

    }



