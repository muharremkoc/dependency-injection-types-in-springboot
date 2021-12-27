# dependency-injection-types-in-springboot
Dependency Injection is a design pattern that removes the dependency of programs from each other and gets the information from the XML file.
The benefit of Dependency Injection is that it combines Code comfortably and facilitates Unit Testing.

## Basics

## For Setter Injection

We can inject objects using Setter. Two basic structures that we will use in XML are important in the injection method with Setter. These structures
 bean: The object to inject. We specify the ID and Path of our object.
 Primitive types for which we will specify property:Setter values. For example: (int id,String name, etc.)


![image](https://user-images.githubusercontent.com/80245013/147477445-7eb7234f-efb5-4ecc-b37b-dd9403de46a2.png)

 XML file
 
 ![image](https://user-images.githubusercontent.com/80245013/147477485-062b3ebf-96c4-43db-ab64-861f5407ac64.png)

 
---
## For Constructor Injection
Constructor Injection, In this method, we produce a constructor of our primitive definitions or Linked objects instead of a setter methods in our Object and specify it in our XML file.
   What is important in this method is our concept.
 constructor-arg value: The arguments and values of the constructor we created in our object.

![image](https://user-images.githubusercontent.com/80245013/147477573-e1a506fc-79b4-450a-8134-3a60675403be.png)


XML file

![image](https://user-images.githubusercontent.com/80245013/147477592-3af6319c-881a-49b3-b6dd-1c1ac21aed6b.png)


---

[Muharrem Koç](https://github.com/muharremkoc)
