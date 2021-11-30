import java.util.ArrayList;
// import java.util.Random;
public class TestPuzzleJava {
    

	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
		String randomLetter = generator.getRandomLetterWithArray();
		System.out.println(randomLetter);

		String randomPassword = generator.generatePassword();
		System.out.println(randomPassword);

		ArrayList<String> randomPass = generator.getNewPasswordSet(1);
		System.out.println(randomPass);

	}
}