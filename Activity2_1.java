
public class Activity2_1 {

	public static void main(String[] args) {
		String line = "the quick brown fox";
		String newLine = "";

		for (int i = 0; i < line.length(); i++) {
			char tempoChar = line.charAt(i);

			if (tempoChar != ' ') {
				newLine += tempoChar;

			}
		}
		System.out.println(newLine);

	}

}
