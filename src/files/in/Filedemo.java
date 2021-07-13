package files.in;

import java.io.File;
import java.io.IOException;

public class Filedemo {
	public static void main(String[] args) throws IOException {
		File file=new File("E:\\Selenum Classes\\name");
		file.createNewFile();
		System.out.println(file.getAbsoluteFile());
		file.renameTo(new File("E:\\\\Selenum Classes\\\\name123"));
		System.out.println(file.getPath());
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.list());

	}

}
