public class Printer {
    public String queue = "";
    public String name = "";
    public int pages = 0;
    public String docText = "";

    public void appened() {
        add(name, docText, pages);

        queue =queue + this.name + "\n" +
               this. docText + "\n" +
                "Колличество листов: " + this.pages;
//        this.name = name;
//        this.docText = docText;
//        this.pages = pages;
//    }
//    public void add(String docText) {
//        add(docText);
////        this.docText = docText;
    }

    public void add(String name, String docText) {
        this.name =this.name +  name;
        this.docText = docText;
        pages = 1;


    }

    public void add(String name, String docText, int pages) {
//        this.queue = queue + name + "\n" + docText + "\n" +
//                "Колличество листов: " + pages;

//        add(name,docText,pages);
        this.name = name;
        this.docText = docText;
        this.pages = pages;


    }


    public void clear() {
        queue = "Получилось";
//       this.name = "";
//        this.docText = "";
//        this.pages = 0;
//        return;
    }

    public void print() {
        System.out.println(queue);
    }
}
