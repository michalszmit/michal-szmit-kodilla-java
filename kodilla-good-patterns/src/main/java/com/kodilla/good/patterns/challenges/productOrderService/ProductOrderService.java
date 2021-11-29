package com.kodilla.good.patterns.challenges.productOrderService;

public class ProductOrderService {
    private final NotificationService notificationService;
    private final OrderValidator orderValidator;
    private final StoreStock storeStock;

    public ProductOrderService(NotificationService notificationService, OrderValidator orderValidator, StoreStock storeStock) {
        this.notificationService = notificationService;
        this.orderValidator = orderValidator;
        this.storeStock = storeStock;
    }


    public PurchaseSummary process(final PurchaseOrder purchaseOrder) {
        boolean isPurchased = orderValidator.validateOrder(purchaseOrder.getBuyer(), purchaseOrder.getProducts());

        if (isPurchased) {
            storeStock.confirmAvailability(purchaseOrder.getBuyer(), purchaseOrder.getProducts());
            notificationService.sendNotificationConfirm(purchaseOrder.getBuyer(), purchaseOrder.getProducts());
            return new PurchaseSummary(purchaseOrder.getBuyer(), true);
        } else {
            notificationService.sendNotificationNegate(purchaseOrder.getBuyer(), purchaseOrder.getProducts());
            return new PurchaseSummary(purchaseOrder.getBuyer(), false);
        }
    }
}