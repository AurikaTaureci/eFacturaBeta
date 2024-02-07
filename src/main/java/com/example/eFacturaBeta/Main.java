package com.example.eFacturaBeta;

import com.example.eFacturaBeta.model.Invoice;
import com.sun.xml.bind.marshaller.NamespacePrefixMapper;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

//import javax.xml.bind.*;
import javax.xml.namespace.QName;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.setName("urn:cen.eu:en16931:2017#compliant#urn:efactura.mfinante.ro:CIUS-RO:1.0.1");
        invoice.setNoInvoice("TEC-23-0153");
        invoice.setAge(30);
        //invoice.setNamespacePrefix("cbc");


        File xmlFile = new File("C:\\Users\\Aurika\\Desktop\\new_eFactura\\eFacturaBeta\\src\\main\\resources\\invoice.xml");
        try {
            JAXBContext context = JAXBContext.newInstance(Invoice.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

         marshaller.marshal(invoice, xmlFile);
           // System.out.println("XML file generated successfully.");
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    }



