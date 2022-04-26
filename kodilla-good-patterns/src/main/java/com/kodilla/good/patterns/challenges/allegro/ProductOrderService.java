package com.kodilla.good.patterns.challenges.allegro;

public class ProductOrderService {
    private NotificationService notificationService;
    private ProductOrder productOrder;
    private OrderRepository orderRepository;

    public ProductOrderService(final NotificationService notificationService,
                               final ProductOrder productOrder,
                               final OrderRepository orderRepository) {
        this.notificationService = notificationService;
        this.productOrder = productOrder;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = productOrder.order(orderRequest.getBuyer(), orderRequest.getProduct());

        if (isOrdered) {
            notificationService.inform(orderRequest.getBuyer(), orderRequest.getProduct());
            orderRepository.createOrder(orderRequest.getBuyer(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getBuyer(), true);
        } else {
            return new OrderDto(orderRequest.getBuyer(), false);
        }
    }
}