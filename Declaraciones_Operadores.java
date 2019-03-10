
public class Declaraciones_Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 8;
		int b= 3;
		int c= 5;
		
		//convertir enteros en decimales: casting
		double division1 = (double)a/b;
		double division2 = (double)a/c;
		double division3 = (double)a*b/c;
		double division4 = (double)(a*c)/b;
		double division5 = (double)a*(b/c);
			
		//Declaraciones_Operadores limtarDecimal = new DecimalFormat("0.00");
				
	    System.out.println("Si tenemos de valores a=8, b=3,c=5, determinemos las siguientes operaciones.");
		System.out.println("a+b+c"+ " = " + (a+b+c));
		System.out.println("a/b"+ " = " + (division1));
		System.out.println("a/c" + " = " + (division2));
		System.out.println("a*b/c"+ " = " + (division3));
		System.out.println("(a*c)/b)" + " = " + division4);
		System.out.println("(3*a-2*b) % (2*a-c)" + " = "+ (3*a-2*b) % (2*a-c));
		System.out.println("(a-3*b) % (c+2*a)/(a-c)"+ " = " + (a-3*b) % (c+2*a)/(a-c));
		System.out.println("2*b+3*(a-c)" + " = " + 2*b+3*(a-c));
		System.out.println("a%b" + " = " + a%b);
		System.out.println("a%c" + " = " + a%c);
		System.out.println("a*(b/c)" + " = " + division5);
		System.out.println("a*(c%b)" + " = " + a*(c%b));
		System.out.println("2*(a/5+(4-b*3)%(a+c-2)" + " = " + 2*(a/5+(4-b*3)%(a+c-2)));
		System.out.println("a-b-c*2" + " = " + (a-b-c*2));
		
		}
	

}
