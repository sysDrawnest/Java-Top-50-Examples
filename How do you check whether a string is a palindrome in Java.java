boolean checkPalindromeString(String input) {
	boolean result = true;
	int length = input.length();

	for (int i = 0; i < length/2; i++) {
		if (input.charAt(i) != input.charAt(length - i - 1)) {
			result = false;
			break;
		}
	}

	return result;
}

//A palindrome string is the same string backwards or forwards. To check for a palindrome, you can reverse the input string and check if the result is equal to the input. The following example code shows how to use the String charAt(int index) method to check for palindrome strings: