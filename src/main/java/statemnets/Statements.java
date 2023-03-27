package statemnets;

public class Statements {
    /**
     * ex.1  zuyg kent
     *
     * @param x
     */
    public void zuygkent(int x) {
        if (x % 2 == 0) {
            System.out.println("zuyg " + x);
        } else {
            System.out.println("kent " + x);
        }
    }

    /**
     * ex.2 drakan bacaskan
     *
     * @param x
     */

    public void kamkam(int x) {
        if (x > 0) {
            System.out.println("Drakan " + x);
        } else {
            System.out.println("Bacaskan " + x);
        }
    }

    /**
     * ex.3 mijakyqi stugum
     *
     * @param x
     */
    public void stugum(int x) {
        if ((x < 8 && x > 5) || (x < 20 && x > 15)) {
            System.out.println("8 ic 5 20 ic 15 mijakaqum a" + x);
        } else {
            System.out.println("8 ic 5 20 ic 15 mijakayqum chi " + x);
        }
    }

    /**
     * ex.4 bajanvuma 5 bajanvuma 7
     *
     * @param x
     */
    public void bajanum(int x) {
        if (x % 5 == 0 && x % 7 == 0) {
            System.out.println("ha exav " + x);
        } else {
            System.out.println("che chexav " + x);
        }
    }

    /**
     * ex.5 stguma e te 2 rd tivy 7a te che
     *
     * @param x
     */
    public void eranish(int x) {
        if ((x % 100 - x % 10) / 10 == 7) {
            System.out.println("erkrordy 7 a " + x);
        } else {
            System.out.println("erkrordy 7 chi " + x);
        }
    }

    /**
     * ex.6 kety gtnvum e srjani vra te che
     *
     * @param x
     * @param y
     */
    public void shrjan(int x, int y) {
        if (Math.sqrt((x) * (x) + ((y) * (y))) <= 5) {
            System.out.println("true" + x + y);
        } else {
            System.out.println("false " + x + y);
        }
    }

    /**
     * ex.7
     *
     * @param x
     * @param y
     * @param z
     */

    public void mymethod(int x, int y, int z) {
        if (x > y && x > z) {
            System.out.println("x:" + x + "is max");
        } else if (y > x && y > z) {
            System.out.println("y" + y + "is max");
        } else {
            System.out.println("z" + z + "is max");
        }
    }

    /**
     * ex.8 stuguma nahanja te che
     *
     * @param x
     */
    public void nahanj(int x) {
        if (((x % 100 != 0 | x % 400 == 0) && (x % 4) == 0)) {
            System.out.println("nahanj a " + x);
        } else {
            System.out.println("nahanj chi " + x);
        }
    }

    public void num11() {
        int i = 1;
        while (i < 201) {
            System.out.println(i);
        }
    }

    public void first(int x) {
        int first = 0;
        while (x > 0) {
            first = x % 10;
            x /= 10;
        }
        System.out.println("first_digt" + first);
    }

    public static void square(int x) {
        System.out.println(x * x);
    }

    public static int sum(int m) {
        int sum = 0;
        for (int i = 5; i <= m; i += 5) {
            sum += i;
        }
        return sum;
    }

    //public static void product(int n){
    //  int pr =1;
    //for(int i =10; i <= n && i< 99; i++){
    //  if (isEven(i))
    //    pr *= i;
    //}
    //System.out.println("pro is:" + pr);
    //}

    public static void sumOf(int x) {
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        System.out.println("um of dit" + sum);
    }


    public static void main(String[] args) {
        Statements obj = new Statements();
        obj.zuygkent(5);
        obj.kamkam(4);
        obj.stugum(44);
        obj.bajanum(5);
        obj.eranish(456);
        obj.shrjan(4, 5);
        obj.mymethod(5, 6, 8);


        // 9
        int x3 = 0;
        while (x3++ < 10) {
            if (x3 == 9) {
                break;
            }
            System.out.println(x3);
        }
        //10.1  x is always smaller than 10, while loop whill be infinite. add a x++
        int x4 = 2;
        int y1 = 5;
        while (x4 < 10) {
            x4++;
            y1++;
            System.out.println(x4);
        }

        //10.2
        int x = 15;
        while (x > 10) {
            x = --x;
        }
        System.out.println(x);

        x = 1;
        y1 = 0;
        while (x < 5 && y1 < 10) {
            System.out.println("x+y =" + x + y1);
            x++;
            y1++;
        }
    }
}