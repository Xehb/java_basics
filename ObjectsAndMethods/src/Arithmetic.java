public class Arithmetic {
    private int a;
    private int b;



    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public int addition() {
        return a + b;
    }


    public int multiplication() {
        return a * b;

    }

    public double division() {

        return a / b;
    }


    public int deduction() {
        return a - b;

    }

    public int comparisonMax() {
        if (a > b) {
            return a;
        }
        if (b > a) {
            return b;
        } else {
            return a;

        }

    }

    public int comparisonMinimal() {
        if (a < b) {
            return a;
        }
        if (b < a) {
            return b;
        } else {
            return a;

        }


    }

    public void print() {

        System.out.println("большее число:" + comparisonMax());
        System.out.println("меньшее число:" + comparisonMinimal());
        System.out.println("результат вычетания:" +deduction());
        System.out.println("результат деления:" + division());
        System.out.println("результат сложения:" + addition());
        System.out.println("результат умножения:" + multiplication());

    }
}






