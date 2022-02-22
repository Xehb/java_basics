public class Arithmetic {
    private String error = "Ошибка";
    private int a;
    private int b;
    private int c;


//    public Arithmetic(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }

    public void addition(int a, int b) {
        c = a + b;
    }

    public void multiplication(int a, int b) {
        c = a * b;
    }

    public void division(int a, int b) {
        if (b != 0) {
            c = a / b;
        } else {
            System.out.println(error);

        }


    }

    public void deduction(int a, int b) {
        c = a - b;
    }

    public void print() {
        boolean error = false;
        if (error = true)
        {
            System.out.println(c);
        } else {

        }
    }
}



