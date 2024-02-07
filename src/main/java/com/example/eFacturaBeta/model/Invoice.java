package com.example.eFacturaBeta.model;

import com.sun.xml.txw2.annotation.XmlNamespace;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@XmlRootElement(name = "Invoice")
//@XmlType(namespace = "urn:oasis:names:specification:ubl:schema:xsd:Invoice-2")
//@XmlType(propOrder = {"name", "age"})
//@XmlNamespace(value = XmlNs()
//@XmlElement(name ="" ,namespace = "urn:oasis:names:specification:ubl:schema:xsd:Invoice-2")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Invoice {

    @XmlElement(name = "CustomizationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String name;

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String noInvoice;


    @XmlElement
    private int age;

    // Constructors, getters, and setters
//        @XmlTransient
//        private String namespacePrefix;


}




