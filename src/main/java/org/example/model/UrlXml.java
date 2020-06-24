package org.example.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Url")
public class UrlXml {


    @XmlAttribute(name = "Type")
    public String Type;

    @XmlElement
    public String Value;

    @XmlElement
    public String Description;

    @Override
    public String toString() {
        return "UrlXml{" +
                "Type='" + Type + '\'' +
                ", Value='" + Value + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
