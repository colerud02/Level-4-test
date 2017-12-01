package Exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
	}

	public Main() {
		run("cinema");
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
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					
				}
			}
			System.out.println(sc.next());
		}
		
			return word;

		
	}
}
