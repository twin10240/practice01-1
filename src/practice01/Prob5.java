package practice01;

public class Prob5 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			String output = "";
			String num = String.valueOf(i);
			
			for (int j = 0; j < num.length(); j++) {
				if (num.charAt(j) == '3' || num.charAt(j) == '6' || num.charAt(j) == '9') {
					output += "짝";
				}
			}
			
			if (!output.equals("")) {
				System.out.println(num + " " + output);
			}
		}
	}
}