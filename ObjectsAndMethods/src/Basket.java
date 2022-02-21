public class Basket {
    private  String items = "";
    private  int totalPrice = 0;
    private int limit;
    private  double totalWeight = 0;

    public Basket() {
        items = "Список товаров:";
        this.limit =  1000000;
    }

    public Basket(int limit){
        this();
       this.limit = limit;
    }
    public Basket (String items, int totalPrice, double totalWeight){
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        this.totalWeight = totalWeight;
    }



    public  void add(String name, int price) {
        add(name, price, 2, 1);

    }
    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (containts(name)){
           error = true;
        }
        if (totalPrice + count * price >= limit){
           error = true;
        }
        if (error){
            System.out.println("Error occured");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт.; " +" Цена за шт.(кг):  " + price + " руб. " + " Вес товара: " + weight + "КГ";
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + count * weight;

    }

    public  void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;

    }

    public  int getTotalPrice() {
        return totalPrice;
    }

    public  double getTotalWeight() {
        return totalWeight;
    }

    public  boolean containts(String name) {
        return items.contains(name);
    }


    public  void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
            System.out.println("Общая стоимость товаров: " + totalPrice + " руб." + "\n" +
                    "Общий вес товаров: " + totalWeight + " кг");
        }
    }
}