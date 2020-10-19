package filesioexercise;

import java.io.File;
import java.util.Scanner;

public class File2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File file = new File("abc.txt");
		System.out.println("Press 1 for checking if it exists or not");
		System.out.println("Press 2 for checking if the file is readable");
		System.out.println("Press 3 for checking if the file is writable");
		System.out.println("Press 4 for checking the type of the file");
		System.out.println("Press 5 to check the length of the file");
		int choice = sc.nextInt();
		switch(choice) {
			case 1:
				boolean fileExists = file.exists();
				if(fileExists) {
					System.out.println("FILE EXISTS");
				}
				else {
					System.out.println("FILE DOES NOT EXISTS");
				}
				break;
			case 2:
				boolean isReadable = file.canRead();
				if(isReadable) {
					System.out.println("FILE IS READABLE");
				}
				else {
					System.out.println("FILE IS NOT READABLE");
				}
				break;
			case 3:
				boolean isWritable = file.canWrite();
				if(isWritable) {
					System.out.println("FILE IS WRITABLE");
				}
				else {
					System.out.println("FILE IS NOT WRITABLE");
				}
				break;
			case 4:
				System.out.println(file.getName());
				break;
			case 5:
				System.out.println("LENGTH OF FILE IS " + file.length());
				break;
			default:
				System.out.println("NO VALID OPTION");
			sc.close();	
		}
	}
}
