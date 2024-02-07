package com.example.eFacturaBeta;

import com.example.eFacturaBeta.model.Invoice;

import javax.xml.bind.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        Invoice person = new Invoice();
        person.setName("John");
        person.setAge(30);

        File xmlFile = new File("C:\\Users\\Aurika\\Desktop\\new_eFactura\\eFacturaBeta\\src\\main\\resources\\invoice.xml");
        JAXBContext context = JAXBContext.newInstance(Invoice.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(person, xmlFile);
    }
}
