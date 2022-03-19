class company {
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		e1.eno   =01;
		e1.ename ="hameed";
		e1.dept  ="rapido";
		e1.sal   = 15000;
		
		e2.eno   =02;
		e2.ename ="vinod";
		e2.dept  ="dunzo";
		e2.sal   = 16000;

		e3.eno   =03;
		e3.ename ="sajid";
		e3.dept  ="boxe";
		e3.sal   = 17000;
		System.out.println("\n e1 object values");
		System.out.println("    e1.eno\t:"+e1.eno);
		System.out.println("  e1.ename\t:"+e1.ename);
		System.out.println("   e1.dept\t:"+e1.dept);
		System.out.println("    e1.sal\t:"+e1.sal);		
			System.out.println();
	    System.out.println("\n e2 object values");
		System.out.println("    e2.eno\t:"+e2.eno);
		System.out.println("  e2.ename\t:"+e2.ename);
		System.out.println("   e2.dept\t:"+e2.dept);
		System.out.println("    e2.sal\t:"+e2.sal);
			System.out.println();
	    System.out.println("\n e3 object values");
		System.out.println("    e3.eno\t:"+e3.eno);
		System.out.println("  e3.ename\t:"+e3.ename);
		System.out.println("   e3.dept\t:"+e3.dept);
		System.out.println("    e3.sal\t:"+e3.sal);
	}
}
