public class PrintMain {
    public static void main(String[] args) {
        Printer doc = new Printer();

        doc.appened("пробный принт", "текст какой-то", 6);
        doc.appened("Пробный принт 2", "Текст какой-то 2");
        doc.appened("Тест какой-то 3");
        doc.print("Очередь печати");

    }
}

