import java.util.*;

public class Main {

	public static void main(String[] args)
    {
 
        char[] letter = { 
		'a', 'b', 'c', 'd', 'e', 'f',
		'g', 'h', 'i', 'j', 'k', 'l',
		'm', 'n', 'o', 'p', 'q', 'r',
		's', 't', 'u', 'v', 'w', 'x',
		'y', 'z', '1', '2', '3', '4',
		'5', '6', '7', '8', '9', '0' 
		};

        String[] code = { 
		".-",   "-...", "-.-.", "-..",  ".",
		"..-.", "--.",  "....", "..",   ".---",
		"-.-",  ".-..", "--",   "-.",   "---",
		".--.", "--.-", ".-.",  "...",  "-",
		"..-",  "...-", ".--",  "-..-", "-.--",
		"--..", "|" 
		};
 		
		Scanner in = new Scanner(System.in);
        System.out.print("Input a string to encrypt: \n");
		String string = in.nextLine();

		encryption(code, string, letter);
		System.out.print("\n");
		
		System.out.print("Input a string to decrypt: \n");
		String morseCode = in.nextLine();
		
        decryption(code, morseCode);
		System.out.print("\n");
    }
	
	public static void encryption(String[] code, String string, char[] letter)
    {
        System.out.print("Changed string: \n");
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < letter.length; j++) {
                if (string.charAt(i) == letter[j]) {
                    System.out.print(code[j] + " ");
                    break;
                }
            }
        }
    }

    public static void decryption(String[] code, String morseCode)
    {
        String[] array = morseCode.split(" ");
        System.out.print("Changed string: \n");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < code.length; j++) {
                if (array[i].compareTo(code[j]) == 0) {
                    System.out.print((char)(j + 'a') + " ");
                    break;
                }
            }
        }
    }
}
