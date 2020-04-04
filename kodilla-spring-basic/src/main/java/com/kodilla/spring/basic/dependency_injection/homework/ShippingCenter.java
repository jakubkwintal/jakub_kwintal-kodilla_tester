package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {

    private DeliveryService deliveryService;
    private NotificationService notificationService;

    public ShippingCenter(DeliveryService deliveryService, NotificationService notificationService) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

    private boolean checkAddress(String address) {
        return address != null && !address.isEmpty();
    }

    public void sendPackage(String address, double weight) {

//        if (checkAddress(address)) {
//            this.deliveryService.deliverPackage(address, weight);
//        }

        if (weight > 30) {
            System.out.println("Package too heavy");
        } else if (checkAddress(address) && this.deliveryService.deliverPackage(address, weight)) {
//            this.notificationService.success(address);
            System.out.println("Delivering in progress...");
            System.out.println("Package delivered to: " + address);
        }
        else {
//            this.notificationService.fail(address);
            System.out.println("Package not delivered to: " + address);
        }
    }
}