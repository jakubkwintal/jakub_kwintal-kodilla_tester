package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class ShippingCenter {

private DeliveryService deliveryService;

public ShippingCenter(DeliveryService deliveryService) {
    this.deliveryService = deliveryService;
}

private NotificationService notificationService;

public ShippingCenter(NotificationService notificationService) {
    this.notificationService = notificationService;
}

    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return notificationService.success(address);
        }
        return notificationService.fail(address);
    }
}