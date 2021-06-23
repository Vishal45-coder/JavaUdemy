
public class Getter_setter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ge h1=new ge();
        h1.setA(10);
		System.out.println(h1.getA());
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