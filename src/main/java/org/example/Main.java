package org.example;

import org.example.jaxb.JaxbProcessor;

import javax.xml.bind.JAXBException;

public class Main {

    public static final String PROPERTIES_PATH = "./properties.xml";

    public static void main(String[] args) {
        final JaxbProcessor jaxbProcessor = new JaxbProcessor();

        try {
            System.out.println(jaxbProcessor.loadProperties(PROPERTIES_PATH));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
