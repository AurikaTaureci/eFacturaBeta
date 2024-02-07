@XmlSchema(
        //namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2",
        //elementFormDefault = XmlNsForm.UNSET,
        xmlns = {
               // @XmlNs(prefix = "", namespaceURI = "urn:oasis:names:specification:ubl:schema:xsd:Invoice-2"),
                @XmlNs(prefix = "cbc", namespaceURI = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2"),
                @XmlNs(prefix = "ns4", namespaceURI = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2"),
                @XmlNs(prefix = "xsi", namespaceURI = "http://www.w3.org/2001/XMLSchema-instance"),
                @XmlNs(prefix = "schemaLocation", namespaceURI = "urn:oasis:names:specification:ubl:schema:xsd:Invoice-2 http://docs.oasis-open.org/ubl/os-UBL-2.1/xsd/maindoc/UBL-Invoice-2.1.xsd")

        }
)
package com.example.eFacturaBeta.model;

import jakarta.xml.bind.annotation.XmlNs;
import jakarta.xml.bind.annotation.XmlNsForm;
import jakarta.xml.bind.annotation.XmlSchema;


