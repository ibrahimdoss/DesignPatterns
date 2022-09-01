
package compositeFileSystem;

public class Test {

	public static void main(String[] args) {
		Directory user = new Directory("/Users/akin");
		user.list();
		
		Directory devDir = new Directory("Dev", user); 
		File file1 = new File("Readme.txt", devDir);	
		File file2 = new File("Report.docs", devDir);	
		File file3 = new File("Selam.java", devDir);	
		
		devDir.list();
		user.list();
//		
		Directory reportDir = new Directory("Reports", devDir); 
		File file4 = new File("ImportantReport.docs", reportDir);	
		File file5 = new File("SelamTest.java", reportDir);	
		
		devDir.list();
//		
		reportDir.list();
//		
		file2.move(reportDir);
//		
		System.out.println("\nAfter moving: " + file2 + " to " + reportDir);
		
		devDir.list();
		
		reportDir.list();
//		
//		user.list();
//		
		reportDir.move(user);
//		
//		System.out.println("\nAfter moving: " + reportDir + " to " + user);
//		
		user.list();
//		
//		System.out.println("\nAfter moving: " + reportDir + " to " + user);
//		
//		reportDir.delete();
//		
//		System.out.println("\nAfter delete.");
//		
//		user.list();
	}
}
