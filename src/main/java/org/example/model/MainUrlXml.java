package org.example.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MainUrl")
public class MainUrlXml {

    @XmlElement
    public String Value;

    @XmlElement
    public String Description;

    @Override
    public String toString() {
        return "MainUrlXml{" +
                "Value='" + Value + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
