import java.util.Scanner;

public class test {

    public static void usingScanner(){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        switch (input){
            case "Hi":
                System.out.println("Hello, hooman");
            case "Tell me a joke":
                System.out.println("Your face");
        }
    }


    public static void main(String[] args){
        System.out.println("Hello there");
        usingScanner();
    }

}
