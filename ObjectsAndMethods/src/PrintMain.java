public class PrintMain {
    public static void main(String[] args) {
        Printer doc1 = new Printer();

        doc1.add("пробный принт", "текст какой-то", 6);
        doc1.appened();
        doc1.print();

        Printer doc2 = new Printer();
        doc2.add("Пробный принт 2", "Текст какой-то 2");
        doc2.appened();
        doc2.print();

        Printer doc3 = new Printer();

        doc3.add("Тест какой-то 3");
        doc3.appened();
        doc3.print();

//        doc1.clear();
//        doc1.print();
    }
}

