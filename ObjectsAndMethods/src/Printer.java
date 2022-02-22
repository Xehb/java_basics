public class Printer {
    public String queue = "";
    public int pendingPagesCount = 0;


    public void appened(String name, String docText, int pages) {
        boolean error = false;
        if (containts(name)) {
            error = true;
        }
        queue = queue + name + "\n" +
                docText + "\n" +
                "Колличество листов: " + pages + "\n";
        pendingPagesCount = pendingPagesCount + pages;
    }

    public void appened(String docText) {
        appened("Неизвестнрое имя", docText, 1);
    }

    public void appened(String name, String docText) {
        appened(name, docText, 1);
    }

    public int getPendingPagesCount() {
        return pendingPagesCount;
    }

    public void clear() {
        queue = "Очищено";
        pendingPagesCount = 0;
    }

    public boolean containts(String name) {
        return queue.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (queue.isEmpty()) {
            System.out.println("Нет печати");
        } else {
            System.out.println(queue);
//            System.out.println(pendingPagesCount);
        }
        clear();
        System.out.println(queue);
//                    System.out.println(pendingPagesCount);

    }
}

