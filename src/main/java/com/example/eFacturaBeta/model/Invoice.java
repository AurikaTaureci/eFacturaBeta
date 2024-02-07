package com.example.eFacturaBeta.model;
//import javax.xml.bind.annotation.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Invoice",namespace = "urn:oasis:names:specification:ubl:schema:xsd:Invoice-2")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Invoice {

        @XmlElement
        private String name;

        @XmlElement
        private int age;

        // Constructors, getters, and setters
    }




