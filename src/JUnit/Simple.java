package JUnit;

public class Simple {
	  public int a = 10;
	  private int b = 20;
	  
//	  public String c = "10";
//	  private String d = "20";
	  
	  public Simple() {
	  }
	  
	  public Simple(int a, int b) {
	    this.a = a;
	    this.b = b;
	  }

	  public void squareA(){
	    this.a *= this.a;
	  }

	  private void squareB(){
	    this.b *= this.b;
	  }

	  public int getA() {
	    return a;
	  }
//	  public String getAString() {
//		    return c;
//		  }

	  private void setA(int a) {
	    this.a = a;
	  }

	  public int getB() {
	    return b;
	  }
	  
//	  public String getBString() {
//		    return d;
//	  }

	  public void setB(int b) {
	    this.b = b;
	  }
	  
	  public String toString() {
	    return String.format("(a:%d, b:%d)", a, b);
	  }
}
