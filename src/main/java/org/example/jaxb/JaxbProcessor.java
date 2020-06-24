package org.example.jaxb;

import org.example.model.PropertiesXml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JaxbProcessor {

    public PropertiesXml loadProperties(String file) throws JAXBException {
        final InputStream stream = pathToInputStream(Paths.get(file));
        return (PropertiesXml) JAXBContext.newInstance(PropertiesXml.class).createUnmarshaller().unmarshal(stream);
    }

    private InputStream pathToInputStream(Path path) {
        if (path == null)
            return null;
        try {
            return Files.newInputStream(path);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
