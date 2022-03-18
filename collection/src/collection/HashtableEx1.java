package collection;

import java.util.Hashtable;

public class HashtableEx1 {
public static void main(String[] args) {
Hashtable h=new Hashtable();// {23=F, 10=B, 5=A, 25=G, 13=D, 28=H, 14=E, 12=C}
	//Hashtable h=new Hashtable(25); //{13=D, 10=B, 23=F, 28=H, 14=E, 12=C, 5=A, 25=G}
	//Hashtable h=new Hashtable(); //RETURN CHANGE AS 9%
	h.put(new Temp(1), "A");
	h.put(new Temp(2), "B");
	h.put(new Temp(3), "C");
	h.put(new Temp(4), "D");
	h.put(new Temp(5), "E");
	h.put(new Temp(6), "F");
	h.put(new Temp(7), "G");
	h.put(new Temp(8), "H");
	
	System.out.println(h);
	}
}

class Temp{
	int i;
	Temp(int i)
	{
		this.i=i;
	}
	public int hashcode() {
		return i;
		
	}
	public String toString() {
		return i%9+"";
	}
}