package com.example.test.domain.sequence;

public class Sequence {

	public Sequence() {
	}

	public int calcule(int a, int b) {
		String stringResult = "";
		String convertA = String.valueOf(a);
		String convertB = String.valueOf(b);
		int position = convertA.length() >= convertB.length() ? convertA.length() : convertB.length();
		int i = 0;
		while (i < position) {
			if (convertA.length() > i && convertB.length() > i) {
				stringResult += String.valueOf(convertA.charAt(i)) + String.valueOf(convertB.charAt(i));
			} else if (convertA.length() >= position) {
				stringResult += String.valueOf(convertA.charAt(i));
			} else {
				stringResult += String.valueOf(convertB.charAt(i));
			}
			i++;
		}
		int result = Integer.parseInt(stringResult);
		return result > 1000000 ? -1 : result;
	}

}
