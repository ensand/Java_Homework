//import java.io.FileWriter;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.stream.Stream;
//
//public class Replacer {
//
//    public static void replacer(String fileName, String replaceable, String replacer){
//        try {
//            FileWriter fw = new FileWriter(fileName);
//            fw.write(fileName.replaceAll(replaceable, replacer));
//            fw.flush();
//            fw.close();
//        } catch (IOException e) {
//            System.out.println("no >:(");
//            e.printStackTrace();
//        }
//    }
//
//    public static int readFile(String fileName, String replacer){
//        try (Stream<String> stream = Files.lines(Paths.get(fileName))){
//            stream.forEach(System.out::println);
//        } catch (IOException e){
//            e.printStackTrace();
//        }
////        int count = 0;
////        for (int i = 0; i < fileName.length(); i++){
////            if ([i] == replacer) {
////                count = count + 1;
////            }
////        }
////        return count;
//    }
//
//}
