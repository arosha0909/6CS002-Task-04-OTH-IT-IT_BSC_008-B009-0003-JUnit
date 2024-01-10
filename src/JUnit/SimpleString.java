package JUnit;

public class SimpleString {
	public String a = "10";
	  private String b = "20";
	  
	  public SimpleString() {
	  }
	  
	  public SimpleString(String a, String b) {
	    this.a = a;
	    this.b = b;
	  }

	  public void squareA(){
	    this.a.equals(this.a);
	  }

	  private void squareB(){
	    this.b.equals(this.b);
	  }

	  public String getA() {
	    return a;
	  }

	  private void setA(String a) {
	    this.a = a;
	  }

	  public String getB() {
	    return b;
	  }

	  public void setB(String b) {
	    this.b = b;
	  }
	  
	  public String toString() {
	    return String.format("(a:%d, b:%d)", a, b);
	  }
}
