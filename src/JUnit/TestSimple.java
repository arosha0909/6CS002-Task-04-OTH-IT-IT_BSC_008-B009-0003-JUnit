package JUnit;
import static JUnit.KUnit.*;
import static JUnit.KUnitString.*;
public class TestSimple {

	void checkConstructorAndAccess(){
	    Simple s = new Simple(3, 4);
	    checkEquals(s.getA(), 4);
	    checkEquals(s.getB(), 4);
	    checkNotEquals(s.getB(), 4);    
	    checkNotEquals(s.getB(), 5);    
	    
	    SimpleString ss = new SimpleString("3", "4");
	    checkEqualsString(ss.getA(), "4");
	    checkEqualsString(ss.getB(), "4");
	    checkNotEqualsString(ss.getB(), "4");    
	    checkNotEqualsString(ss.getB(), "5");
	  }

	  void checkSquareA(){
	    Simple s = new Simple(3, 4);
	    s.squareA();
	    checkEquals(s.getA(), 9);
	  }
	  void checkSquareAString(){
		    SimpleString ss = new SimpleString("3", "4");
		    checkEqualsString(ss.getA(), "9");
		  }

	  public static void main(String[] args) {
	    TestSimple ts = new TestSimple();
	    ts.checkConstructorAndAccess();
	    ts.checkSquareA();
	    ts.checkSquareAString();
	    report();
	    reportString();
	  }
}
