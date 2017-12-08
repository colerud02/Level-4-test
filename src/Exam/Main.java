package Exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
	}

	public Main() {
		String input = JOptionPane.showInputDialog("Type word you want to find Anagrams for:");
		run(input);
	}

	public String run(String word) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("words.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (sc.hasNext()) {
			char array[] = word.toCharArray();
			String word12 = "";
			word12 = sc.nextLine();
			int z = 0;
			char array1[] = word12.toCharArray();
			int arrayLength = array.length;
			int array1Length = array1.length;
//			System.out.println(array.length);
//			System.out.println(array1.length);
			if (arrayLength == array1Length) {
				for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array.length; j++) {
						if (array[i] == array1[j]) {
							z++;
							break;
						}
					}
				}
			}
			if (z == array.length) {
				if (word12 != word) {
					System.out.println(word12);
				}
				//return word12;
			}
			// System.out.println(sc.next());
		}

		return "None";

	}
}
