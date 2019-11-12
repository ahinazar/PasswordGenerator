import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            int length = Integer.parseInt(args[0]);
            if(length > 0)
                System.out.println(passGen(length));
            else
                throw new Exception();
        }
        catch(Exception e){
            System.out.println("Wrong argument entered, you should enter a positive number. exiting...");
            System.exit(0);
        }
    }

    private static char[] passGen(int length){
		
		//AAAAAAAAAAAAAAAAAAAAA		//AAAAAAAAAAAAAAAAAAAAA
		//AAAAAAAAAAAAAAAAAAAAA

        System.out.print("Your OTP is : ");
        String bigChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String littleChars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";
        String values = bigChars + littleChars + numbers + symbols;
        Random random = new Random();
        char[] password = new char[length];
        for (int i = 0; i < length; i++)
            password[i] = values.charAt(random.nextInt(values.length()));
        return password;
    }
} 