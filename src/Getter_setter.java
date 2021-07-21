
public class Getter_setter {

	public static void main(String[] args) {
		
		ge h1=new ge();

		h1.setB("Vishal"); //IT sets the b value of Vishal for object h1
		System.out.println("Name : "+h1.getB()); //THis will get the value of b for the object  h1

		h1.setA(10); //IT sets the a value of 10 for object h1
		System.out.println("Age : "+h1.getA()); //THis will get the value of a for the object h1
	}

}
class ge{
	 int a;
		String b;
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
		public String getB() {
			return b;
		}
		public void setB(String b) {
			this.b = b;
		}
        
 }