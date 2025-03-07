import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        Add obj = new Add();
        int c =obj.addition(1,3);
        System.out.println("Addition: "+c);
        Square s = new Square();
        int a =s.getSquare(2242);
        System.out.println("Square:"+a);
        Subtract s1 = new Subtract();
        int d =s1.Sub(6,5);
        System.out.println("Subtraction: "+d);
        Multi P = new Multi();
        int dd = P.Multiplication(3,5);
        System.out.println("Multiplication:"+dd);
        Div e = new Div();
        int tt = e.Division(4,2);
        System.out.println("Division:"+tt);


    }
}