public static boolean onlyOddNumbers(List<Integer> list) {
	for (int i : list) {
		if (i % 2 == 0)
			return false;
	}

	return true;
}

//If the list is large, you can use parallel stream for faster processing, as shown in the following example code:

public static boolean onlyOddNumbers(List<Integer> list) {
	return list
			.parallelStream() // parallel stream for faster processing
			.anyMatch(x -> x % 2 != 0); // return as soon as any elements match the condition
}