package JUnit;
import java.util.LinkedList;
import java.util.List;

public class KUnit {
	private static List<String> checks;
	private static int checkMade=0;
	private static int passedChecks=0;
	private static int failedChecks=0;
	
	private static void addToReport(String txt) {
		if(checks==null) {
			checks= new LinkedList<String>();
		}
	checks.add(String.format("%04d: %s" ,checkMade++, txt));
	}
	
	public static void checkEquals(int value1, int value2) {
		if(value1==value2) {
			addToReport(String.format("  %d== %d", value1,value2));
			passedChecks++;
		}else {
			addToReport(String.format("  %d== %d", value1,value2));
			failedChecks++;
		}
	}
	public static void checkNotEquals(int value1,int value2) {
		if(value1!=value2) {
			addToReport(String.format("  %d== %d", value1,value2));
			passedChecks++;
		}else {
			addToReport(String.format("  %d== %d", value1,value2));
			failedChecks++;
		}
	}

	public static void report() {
		System.out.printf("%d checks passed\n",passedChecks);
		System.out.printf("%d checks failed\n",failedChecks);
		System.out.println();
		
		for(String check : checks) {
			System.out.println(check);
		}
	}
}
