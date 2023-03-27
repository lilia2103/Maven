package primitive_type;

public class PrimitiveType {
    public static void main(String[] args) {

        byte a = 107;
        byte b = 44;
        System.out.println("byte = " + a);
        System.out.println("byte = " + b);
        System.out.println("byte Max = " + Byte.MIN_VALUE);
        System.out.println("byte Min = " + Byte.MAX_VALUE);

        short c = 5465;
        short d = 4475;
        System.out.println("short = " + c);
        System.out.println("short = " + d);
        System.out.println("short Min = " + Short.MIN_VALUE);
        System.out.println("short Max =" + Short.MAX_VALUE);

        int e = 24554457;
        int f = 534654968;
        System.out.println("int = " + e);
        System.out.println("int = " + f);
        System.out.println("int Min = " + Integer.MIN_VALUE);
        System.out.println("int Max =" + Integer.MAX_VALUE);

        long g = 5497453545451L;
        long h = 4684556861351L;
        System.out.println("long = " + g);
        System.out.println("long = " + h);
        System.out.println("long Max = " + Long.MAX_VALUE);
        System.out.println("long Min =" + Long.MIN_VALUE);


        float j = 2.6f;
        float k = 6.5f;
        System.out.println("float = " + j);
        System.out.println("float = " + k);
        System.out.println("float Max = " + Float.MAX_VALUE);
        System.out.println("float Min = " + Float.MIN_VALUE);

        double l = 658464.6;
        double m = 85964.7;
        System.out.println("double = " + l);
        System.out.println("double = " + m);
        System.out.println("double Max = " + Double.MAX_VALUE);
        System.out.println("double Min = " + Double.MIN_VALUE);

        /**
         * double d1 = 34.567839023;
         * float f1 = 12.345f;
         * double d2 = 8923.1235857;
         * float f2 = 3456.091f;
         */

        char n = 'a';
        char o = 'A';
        System.out.println("char = " + n);
        System.out.println("char = " + o);

        char s = 77;
        char w = 109;
        System.out.println("char = " + s);
        System.out.println("char = " + w);

        char t = 57;
        System.out.println("char = " + t);

        boolean p = true;
        boolean q = false;
        System.out.println("boolean = " + p);
        System.out.println("bollean = " + q);

        /**
         * int year = 201l; սխալ անցումա Int ից long
         * System.out.print(year);
         */


        int aa = 7;
        long bb = aa;
        System.out.println("Cast1 = " + bb);

        int myInt = 7;
        double myDouble = myInt;
        System.out.println("Cast2 = " + myDouble);

        double dd = 9.78;
        int ii = (int) dd;
        System.out.println("Cast3 = " + ii);

        int ff = 9999;
        byte gg = (byte)  ff;
        System.out.println("Cast4 = " + gg);

        /**
         * long max = 3123456789; վերջում պետք է լինի l
         * double d = 1000_.00; double Ի մեջ չի կարող _ լինել
         * char i = 'i'; char j ='j'; char ij = i + j; cahr-ի միջոցով չի լինում գումարել
         * int 7a = 8; փոփոխականը չի կաող սկսվել թվով
         * long h = h + 8; h փոփոխականը չենք տվել որևե արժեք
         * int n, m = 11; m = n;
         */
    }
}
