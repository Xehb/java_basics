public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Молоко", 40, 2, 1.38);
        vasyaBasket.add("Пиво",60,1, 2 );



        Basket petyaBasket = new Basket(500);
        petyaBasket.add("гвозди", 400, 1, 0.4);
        petyaBasket.add("Молоток", 280, 4, 2.8);



        Basket mashaBasket = new Basket("стол",5000,30);


        vasyaBasket.print("Корзина Васи");
        System.out.println();
        petyaBasket.print("Корзина Пети");
        System.out.println();
        mashaBasket.print("Корзина Маши");

    }
}
