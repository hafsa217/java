class Operators {
 public static void main(String args[]) {
int a = 20, b = 10, c,d, e = 10, f = 4, g = 9;
c = b;
System.out.println("value of c = " + c);
 a = a + 1;
b = b - 1;
e = e *2;
f = f/ 2;
System.out.println("a,b,e,f =" + a +" , " + b + " ," + e + " , " + f);
a = a - 1;
b = b + 1;
e = e / 2;
f = f * 2;

System.out.println("a,b,e,f (using shorthand operator)= " + a +","   + b + ","+ e +"," +f);
}

}