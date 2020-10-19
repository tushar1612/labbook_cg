package filesioexercise;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;

class SubFile extends File implements AutoCloseable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SubFile(File parent, String child) {
		super(parent, child);
		// TODO Auto-generated constructor stub
	}

	public SubFile(String parent, String child) {
		super(parent, child);
		// TODO Auto-generated constructor stub
	}

	public SubFile(String pathname) {
		super(pathname);
		// TODO Auto-generated constructor stub
	}

	public SubFile(URI uri) {
		super(uri);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
public class File1 {
	public static void main(String[] args) {
//		try(SubFile file = new SubFile("abc.txt"); FileWriter fw = new FileWriter(file);) {
//			if(file.exists()) {
//				System.out.print("EXISTS");
//			}
//			System.out.print(file.getAbsolutePath());;
//			file.createNewFile();
//			fw.write(100);
//			char[] ch = {'a', '\n', 'b', 'c'};
//			fw.write(ch);
//		}
		try(SubFile file = new SubFile("abc.txt"); FileReader fr = new FileReader(file)){
			int readFile = fr.read();
			while(readFile != -1) {
				System.out.print((char) readFile);
				readFile = fr.read();
			}
		}
		catch(IOException e) {
			System.out.println("ERRPR");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
