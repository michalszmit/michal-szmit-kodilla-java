package com.kodilla.good.patterns.challenges.productOrderService;

public class Application {

    public static void main(String[] args) {
        Buyer buyer1 = new Buyer("John", "Doe", "johndoe@email.com");
        Buyer buyer2 = new Buyer("Jennifer", "Smith", "jennifersmith@email.com");

        Product product1 = new Product("Mirror", 179.50);
        Product product2 = new Product("KitKat", 0.99);
        Product product3 = new Product("ToyCar", 99.99);
        Product product4 = new Product("Gaming laptop", 3499);

        OrderValidator validateOrder = new Validator();
        NotificationService emailService = new EmailNotifier();
        StoreStock basket = new PurchaseBasket();

        ProductOrderService service = new ProductOrderService(emailService, validateOrder, basket);
        PurchaseOrder purchase1 = new PurchaseOrder();
        purchase1.setBuyer(buyer1);
        purchase1.add(product1, 1);
        purchase1.add(product2, 20);
        purchase1.add(product4, 1);
        service.process(purchase1);
        System.out.println(purchase1);

        PurchaseOrder purchase2 = new PurchaseOrder();
        purchase2.setBuyer(buyer2);
        purchase2.add(product3, 0);
        service.process(purchase2);
        System.out.println(purchase2);
    }
}