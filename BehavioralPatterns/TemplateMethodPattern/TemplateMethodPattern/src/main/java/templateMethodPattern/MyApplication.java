package templateMethodPattern;

public class MyApplication extends Application{

	@Override
	boolean canOpenDocument(String fileName) {
		System.out.println("Checking the document " + fileName);
		return true;
	}

	@Override
	Document createDocument(String fileName) {
		System.out.println("Opening document " + fileName);
		return new MyDocument(fileName);
	}
}
