import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> random10num = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 1; i <=10; i++) {
            random10num.add(random.nextInt(20) + 1);
        }
        return random10num;
    }

    public String getRandomLetterWithArray() {
        Random random = new Random();
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabet = new String[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(alphabetString.charAt(i));
        }
        return alphabet[random.nextInt(26)];
    }
    
    public String generatePassword() {
        String pass = "";
        for(int i = 0; i <8; i++) {
            pass = pass + getRandomLetterWithArray();
        }
        return pass;
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passSet = new ArrayList<String>();
        for(int i = 0; i< length; i++){
            passSet.add(generatePassword());
        }
        return passSet;
    }

}

