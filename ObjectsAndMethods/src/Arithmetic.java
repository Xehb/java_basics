public class Arithmetic {
    private String error = "Ошибка";
    private int a;
    private int b;
    private int c;


    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public int addition() {
        c = a + b;
        return c;
    }


    public int multiplication() {
        c = a * b;
        return c;
    }

    public int division() {
        if (b != 0) {
            c = a / b;
        } else {
            System.out.println(error);

        }
        return c;
    }


    public int deduction() {
        c = a - b;
        return c;
    }

    public int comparisonMax() {
        if (a > b) {
            c = a;
        } if ( b > a) {
            c = b;
        } else {
          c = a ;

        }
        return c;
    }

    public int comparisonMinimal() {
        if (a < b) {
            c = a;
        } if ( b < a) {
            c = b;
        } else {
            c = a;

        }
        return c;

    }
//
//    public void print() {
//        boolean error = true;
//        if (error) {
//            System.out.println(c);
//        } else {
//
//        }
//    }
}





