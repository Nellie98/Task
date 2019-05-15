import java.awt.Font;

public class Main {

    public static void main(String[] args) {
        AsciiArt asciiArt = new AsciiArt();

        String text = "/"+"\\/"+"\\";
        String logo = text + text;

        String logo2 = "MM";

        Settings arial = new Settings(
                new Font("Arial", Font.PLAIN|Font.ITALIC, 11),
                30,
                4
        );
        asciiArt.drawString(
                logo,"*", arial
        );

        System.out.println();

        asciiArt.drawString(
                logo2,"*", arial
        );

    }

}