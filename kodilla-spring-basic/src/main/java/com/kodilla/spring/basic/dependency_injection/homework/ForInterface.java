package com.kodilla.spring.basic.dependency_injection.homework;

public class ForInterface implements DeliveryService, NotificationService {
    @Override
    public boolean deliverPackage(String address, double weight) {
        return false;
    }

    @Override
    public void success(String address) {

    }

    @Override
    public void fail(String address) {

    }
}

