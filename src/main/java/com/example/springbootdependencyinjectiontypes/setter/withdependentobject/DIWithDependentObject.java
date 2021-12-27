package com.example.springbootdependencyinjectiontypes.setter.withdependentobject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class DIWithDependentObject {
    public static void main(String[] args) {
        Resource resource=new ClassPathResource("setterXMLs/dependentobject/dependentobject.xml");
        BeanFactory factory=new XmlBeanFactory(resource);

        Person e=(Person) factory.getBean("obj");
        e.values();
    }
}
