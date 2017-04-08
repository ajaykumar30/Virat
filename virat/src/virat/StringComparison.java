package virat;

import org.testng.Assert;

public class StringComparison {
	public static int CompareStrings(String searchContent, String searchTerm) {
		int count = 0, lastIndex = 0;
		if (searchTerm == "" || searchContent == "") {

			System.out.println("Enter valid String");
		} else {

			while ((lastIndex = searchContent.indexOf(searchTerm, lastIndex)) != -1) {
				lastIndex = lastIndex + searchTerm.length();
				count++;
			}
			// System.out.println(count);

		}
		return count;

	}

	public static void main(String[] args) {

		System.out.println(CompareStrings("ajaykumar", "a"));

	}

}
