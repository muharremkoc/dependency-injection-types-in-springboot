package com.example.springbootdependencyinjectiontypes.setter.withcollections;
import com.example.springbootdependencyinjectiontypes.setter.withdependentobject.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class DIWithCollections {
    public static void main(String[] args) {

        Resource resource=new ClassPathResource("setterXMLs/collections/collectioncontext.xml");
        BeanFactory factory=new XmlBeanFactory(resource);

        Question e=(Question) factory.getBean("q");
        e.values();
        e.mapValues();

    }
}
