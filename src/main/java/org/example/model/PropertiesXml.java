package org.example.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Arrays;

@XmlRootElement(name="Properties")
public class PropertiesXml {

    @XmlAttribute(name = "Name")
    public String Name;

    @XmlElement(name = "Url")
    public UrlXml[] Urls;

    @XmlElement
    public MainUrlXml MainUrl;

    @XmlElement
    public String Title;

    @Override
    public String toString() {
        return "PropertiesXml{" +
                "Name='" + Name + '\'' +
                ", Urls=" + Arrays.toString(Urls) +
                ", MainUrl=" + MainUrl +
                ", Title='" + Title + '\'' +
                '}';
    }
}
