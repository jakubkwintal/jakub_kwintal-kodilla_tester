package com.kodilla.hibernate.invoice.repository;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceRepositoryTestSuite {

    @Autowired
    private InvoiceRepository invoiceRepository;

    private static final String INVOICE_NUMBER = "Invoice number";

    @Test
    public void testInvoiceRepositorySave() {
        //Given
        Product product1 = new Product("Dove");
        Product product2 = new Product("Colgate");

        Item item1 = new Item(new BigDecimal(12.50), 3, new BigDecimal(37.5)); // jak sprawić by trzecia wartość sama się liczyła?
        Item item2 = new Item(new BigDecimal(5.00), 2, new BigDecimal(10));
        Item item3 = new Item(new BigDecimal(12.50), 5, new BigDecimal(62.5));

        item1.getProducts().add(product1);
        item2.getProducts().add(product2);
        item3.getProducts().add(product1);

        Invoice invoiceA = new Invoice("2020/05/16/001");

        invoiceA.getItems().add(item1);
        invoiceA.getItems().add(item2);
        invoiceA.getItems().add(item3);

        //When
        invoiceRepository.save(invoiceA);
        int invoice = invoiceA.getId();

        //Then
        Assert.assertNotEquals(0, invoice);
    }

}
