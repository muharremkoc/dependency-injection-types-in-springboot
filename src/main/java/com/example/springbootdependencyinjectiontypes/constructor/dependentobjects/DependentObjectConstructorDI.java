package com.example.springbootdependencyinjectiontypes.constructor.dependentobjects;


import com.example.springbootdependencyinjectiontypes.constructor.basic.Man;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;
public class DependentObjectConstructorDI {
    public static void main(String[] args) {
        Resource resource=new ClassPathResource("constructorXMLs/dependentobject/dependentobject.xml");
        BeanFactory factory=new XmlBeanFactory(resource);

        Employee e=(Employee) factory.getBean("e");
        e.show();
    }

}
