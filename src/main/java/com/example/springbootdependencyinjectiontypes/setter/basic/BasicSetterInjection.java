package com.example.springbootdependencyinjectiontypes.setter.basic;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;
public class BasicSetterInjection {

    public static void main(String[] args) {
        Resource resource=new ClassPathResource("setterXMLs/basic/context.xml");
        BeanFactory factory=new XmlBeanFactory(resource);

        Customer e=(Customer) factory.getBean("obj");
        e.values();
    }
}
