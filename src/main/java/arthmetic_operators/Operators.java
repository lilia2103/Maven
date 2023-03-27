package arthmetic_operators;

public class Operators {
    public static void main(String[] args) {
        int a = 8;
        int b = 6;
        System.out.println("a + b = " + (a + b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a % b = " + (a % b));

        double c = 6.4;
        double d = 0.03;
        System.out.println("c + d = " + (c + d));
        System.out.println("c * d = " + (c * d));
        System.out.println("c / d = " + (c / d));
        System.out.println("c - d = " + (c - d));
        System.out.println("c % d = " + (c % d));


        int x;
        int y;
        System.out.println(x = 2 * ((5 + 3) * 4 - 8));
        System.out.println(y = 2 * 5 + 3 * 4 - 8);

        //Unary Operators

        int e = 10;
        int f = -88;
        boolean n1 = true;
        System.out.println("-e = " + -e);
        System.out.println("-f = " + -f);
        System.out.println("+e = " + +e);
        System.out.println("-e + 92 = " + (-e + 92));
        System.out.println("!n1 = " + !n1);
        System.out.println("!(!n1) = " + !(!n1));
        System.out.println("e++ = " + e++);
        System.out.println("--f = " + --f);

        int x1 = 3;
        int y1 = ++x *5 / x -- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y1);


        // Assignment Operator

        int x2 = (int) 1.0;
        System.out.println(x2);
        short y2 = (short) 1921222;
        System.out.println(y2);
        System.out.println(2147483647+1);
        boolean y3 = false;
        System.out.println(y3);
        boolean x3 = (y3 = true);
        System.out.println(x3);


        // Relational operators

        int aa = 10;
        int bb = 20;
        System.out.println("aa < bb = " + (aa < bb));
        System.out.println("aa <= bb = " + (aa <= bb));
        System.out.println("aa >= bb = " + (aa >= bb));
        System.out.println("aa > bb = " + ( aa > bb));


        /** Additional tasks
         * float y4 = 2.1f; f  չկար պետք է float հայտարելուց լինի վերջում f
         * byte x = 5;
         * byte y = 10;
         * int z = x + y ; եթե byte short գործողություն ենք անում դառնում էավտոմատ Int
         * short x = 10 ;
         * short y = 3;
         * int z = x * y ; նույնել այստեղ
         * long x = 10;
         * int y = 5;
         * y *= x
         */

        // 8
        int p = 10;
        int l = 5;
        int c1= p;
        p = l;
        l = c1;
        System.out.println("l = " + l);
        System.out.println("p = " + p);

        // 9
        int u = 10;
        int k = 5;
        u = u + k ;
        k = u - k;
        u = u - k;
        System.out.println("u = " + u );
        System.out.println("k = " + k );

        // 10

        int t = 1;
        int q = 100;
        int g;
        System.out.println(g = (t + q)*q/2);

        // 11 Bitwise & Logical operators
        int a2 = 8;
        int b1 = 3;
        System.out.println(a2 & b1 );
        System.out.println(a2 ^ b1);
        System.out.println(a2 | b1);
        System.out.println(~a2);
        System.out.println(true || (a2 < 4));
        System.out.println((b1 >= 6) || (++a2 <= 7));
        System.out.println((a2 > b1 )? a2:b1);
        System.out.println(b1^b1);

        //shift operator
        System.out.println(10 << 2);
        System.out.println(-10 << 3);
        System.out.println(20 >> 2);
        System.out.println(15 >> 3);

        int k1 = 10;
        System.out.println(k1 << 3);
        System.out.println(k1 << 4 );



        //hes
    }
}