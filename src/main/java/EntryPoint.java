import org.apache.commons.validator.routines.UrlValidator;

import java.io.IOException;

public class EntryPoint {
    public static void main(String[] args) throws IOException {
        UrlValidator urlValidator = new UrlValidator();

        if (args.length == 0) {
            System.out.println("Please provide url as argument");
            System.out.println("The program will exit now...");
            System.exit(0);
        }

        for (String url : args) {
            System.out.println("Checking url: " + url);
            if (urlValidator.isValid(url)) {
                System.out.println("url is valid");
            } else {
                System.out.println("url is invalid");
            }
            System.out.println();
        }
    }
}
