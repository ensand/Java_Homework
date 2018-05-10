//Ülesanne 29

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Replacer {


    public static ArrayList<String> readFile(String fileName)
            throws IOException {

        String line = null;
        ArrayList<String> text = new ArrayList<>();

        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            while ((line = br.readLine()) != null) {
                text.addAll(Arrays.asList(line));
            }

            br.close();

        } catch (FileNotFoundException ex){
            System.out.println("Unable to find file " + fileName);
            ex.printStackTrace();
        }

//        for (String textLine : text) {
//            System.out.println(textLine);
//        }

        return text;

    }


    public static void replacer(ArrayList<String> text, String replaceable, String replacer, String fileName) {

//            line = line.replaceAll(replaceable, replacer);

        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter writer = new BufferedWriter(fw);

            for (String line : text) {
                writer.write(line.replaceAll(replaceable, replacer));
                writer.newLine();
            }

            writer.flush();
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        //System.out.println(line);

    }


    public static void main(String[] args) throws IOException{

        replacer(readFile("text.txt"), "wand", "magic stick", "text.txt");

    }
}
