package debugShalaJava;

public class OperatorExample {

	public static void main(String[] args) {
		
		//Unary operator 
		int x = 10;
		System.out.println("x++ : "+x++); // 10  
		System.out.println("x   : "+x);   // 11
		System.out.println("++x : "+(++x)); // 12
		System.out.println("x-- : "+x--); // 12
		System.out.println("x   : "+x);   // 11
		System.out.println("--x : "+(--x)); // 10
		
		
		int a = 10;
		int b = -10;
		boolean c = true;
		boolean d = false;
		System.out.println(~a); // -11
		System.out.println(~b); // 9
		System.out.println(!c); // false
		System.out.println(!d); // true
		
		
		//Logical Operators
		System.out.println("\nLogical Operators");
		int e , f , g ;
		e = 10 ; f = 5 ; g = 20;
		//&&:- if both condition are true return true
		//||:- if one of them true return true
		System.out.println(e<f && f<g); //false
		System.out.println(e>f && f<g); //true
		System.out.println(e<f || f<g);  //true
		System.out.println(f>g || e>g);  //false
		
		
		//Bitwise Operators
		System.out.println("\nBitwise Operators");
		int h , i , j ;
		h = 10 ; i = 5 ; j = 20;
		System.out.println(h<i & j>i); //Bitwise and :- return false (Both condition are true)
		System.out.println(h>i | j<i); //Bitwise or :- return true (One condition true return true)
		System.out.println(h<j ^ j<i);  //Bitwise xor :- return false 
		
		
		//Java Shift Operator
		System.out.println("\nShift Operator");
		System.out.println(10<<2); //10*2^2 =10*4=40 left shift
		System.out.println(10>>2); //10/2^2 =10/4=2 right shift 
		//System.out.println(10<<<2);//error not exist
		System.out.println(10>>>2);//10/2^2 =10/4=2 right shift 
		
		
		//Java Arithematic operator
		System.out.println("\nShift Operator");
		System.out.println("2"+2);  //22
		System.out.println(2+2);    //4
		System.out.println(4-2);
		System.out.println(2*2);
		System.out.println(4/2);
		System.out.println(5%2); // remainder 
		
		
		//Java Ternary Operator
		int m =10;
		int n =20;
		String result =(m<n) ? "true" : "false" ;
		System.out.println("result :- "+result);
		
		
		//Java Assignment operator
		int p = 4;
		int var;
		var = p;
		System.out.println("var using = "+var); //4
		var += p;
		System.out.println("var using += "+var); //8
		var *= p;
		System.out.println("var using *= "+var); //32
		
				
	}

}
