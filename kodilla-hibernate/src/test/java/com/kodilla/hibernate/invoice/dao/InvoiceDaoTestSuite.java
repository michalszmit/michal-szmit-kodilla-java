package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product carrot = new Product("Carrot");
        Product banana = new Product("Banana");
        Product apple = new Product("Apple");

        Item item1 = new Item(carrot, new BigDecimal(15),10);
        Item item2 = new Item(carrot, new BigDecimal(15), 4);
        Item item3 = new Item(banana, new BigDecimal(40), 8);
        Item item4 = new Item(apple, new BigDecimal(6), 2);

        Invoice invoice1 = new Invoice("2022_1");
        Invoice invoice2 = new Invoice("2022_2");
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item3);
        invoice2.getItems().add(item2);
        invoice2.getItems().add(item4);

        item1.setInvoice(invoice1);
        item3.setInvoice(invoice1);
        item2.setInvoice(invoice2);
        item4.setInvoice(invoice2);


        //When
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();
        invoiceDao.save(invoice2);
        int invoice2Id = invoice2.getId();
        //Then
        assertNotEquals(0, invoice1Id);
        assertNotEquals(0, invoice2Id);

        //cleanup
        try {
            invoiceDao.deleteById(invoice1Id);
            invoiceDao.deleteById(invoice2Id);

        } catch (Exception e) {
            //do nothing
        }
    }
}