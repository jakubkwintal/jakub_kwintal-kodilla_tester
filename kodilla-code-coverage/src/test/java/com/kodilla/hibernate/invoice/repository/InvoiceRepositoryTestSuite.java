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

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceRepositoryTestSuite {

    @Autowired
    private InvoiceRepository invoiceRepository;

    private static final String INVOICE_NUMBER = "Invoice number";

    @Test
    public void testInvoiceRepositorySave() {
        //Given
        Product doveSoap = new Product("Dove");
        Product toothpasteColgate = new Product("Colgate");

        Item item1 = new Item("12.50", 3);
        Item item2 = new Item("5.0", 2);
        Item item3 = new Item("12.50", 5);

        doveSoap.getItems().add(item2); // coś mi tu nie gra..............
        toothpasteColgate.getItems().add(item1);
        toothpasteColgate.getItems().add(item2);
        toothpasteColgate.getItems().add(item3);

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
