import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ApacheCommonsLangsMain extends StringUtils {

    public static String isNumber(String userInput){
        if(!isNumeric(userInput)){
            return "\"" + userInput + "\" is not a number";
        }else {
            return "\"" + userInput + "\" is a number";
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter Something: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        System.out.printf("You Entered: %s\n",userInput);
        System.out.printf("%s\n",isNumber(userInput));
        System.out.printf("Flipped: \"%s\"\n",swapCase(userInput));
        System.out.printf("Reversed: %s\n",reverse(userInput));
    }
}
