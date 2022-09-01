package visitorFileProblem2;

import java.util.ArrayList;
import java.util.List;


public class Test {
	private static List<File> files = new ArrayList<File>();

	public static void main(String[] args) {

		File file  = null;
		
		for(int i = 0; i<3; i++){
			double random = Math.random();
			if(random < 0.5)
				file = new XMLFile("File-" + i + ".xml");
			else
				file = new TextFile("File-" + i + ".txt");
			files.add(file);
		}
		
		FileOperator fo = new FileOperator();
		fo.operate(files);
	}
}
