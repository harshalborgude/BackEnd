package org.hrb.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
1. Serialization in Java is a mechanism of writing the state of an object into a byte-stream. It is mainly used in Hibernate, RMI, JPA, EJB and
 	JMS technologies. 
2. The reverse operation of serialization is called deserialization where byte-stream is converted into an object.
3. For serializing the object, we call the writeObject() method of ObjectOutputStream class, and for deserialization we call the readObject() 
	method of ObjectInputStream class.
4. We must have to implement the Serializable interface for serializing the object.
5. It is mainly used to travel object's state on the network (that is known as marshalling).
6. Serializable is a marker interface (has no data member and method). It is used to "mark" Java classes so that the objects of these classes may 
	get a certain capability.
7. The Serializable interface must be implemented by the class whose object needs to be persisted.
8. The String class and all the wrapper classes implement the java.io.Serializable interface by default.
9. If a class implements Serializable interface then all its sub classes will also be serializable.
10. The ObjectOutputStream class is used to write primitive data types, and Java objects to an OutputStream. Only objects that support the 
	java.io.Serializable interface can be written to streams.
		public final void writeObject(Object obj) throws IOException {} -> It writes the specified object to the ObjectOutputStream.
		
11. An ObjectInputStream deserializes objects and primitive data written using an ObjectOutputStream.
		public ObjectInputStream(InputStream in) throws IOException {} -> It creates an ObjectInputStream that reads from the specified InputStream.
 
 
 ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("f.txt")); -> .writeObject(obj)
 
 ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));  -> .readObject()
 
 
 Object****Stream   -> Output / Input
 File******Stream	-> Output / Input
 
 
 12. If a class has a reference to another class, all the references must be Serializable otherwise serialization process will not be performed. 
 		In such case, NotSerializableException is thrown at runtime.
 13. If there is any static data member in a class, it will not be serialized because static is the part of class not object.
 14. In case of array or collection, all the objects of array or collection must be serializable. If any object is not serialiizable, serialization will be failed.
 
 15. The serialization process at runtime associates an id with each Serializable class which is known as SerialVersionUID. It is used to verify the sender and 
 		receiver of the serialized object. The sender and receiver must be the same. To verify it, SerialVersionUID is used.The sender and receiver must have
 		 the same SerialVersionUID, otherwise, InvalidClassException will be thrown when you deserialize the object.
 
 */

class Student implements Serializable{  
	 int id;  
	 String name;  
	 public Student(int id, String name) {  
	  this.id = id;  
	  this.name = name;  
	 }  
}  

	public class Serialization {

		public static void main(String args[]) {

			// Seriaization
			try {
				// Creating the object
				Student s1 = new Student(211, "ravi");
				// Creating stream and writing the object
				//FileOutputStream fout = new FileOutputStream("f.txt");
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("f.txt"));
				out.writeObject(s1);
				out.flush();
				// closing the stream
				out.close();
				System.out.println("Serializatio success");
			} catch (Exception e) {
				System.out.println(e);
			}

			// Deserialization
			try {
				// Creating stream to read the object
				ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
				Student s = (Student) in.readObject();
				// printing the data of the serialized object
				System.out.println("Deserializatio :"+s.id + " " + s.name);
				// closing the stream
				in.close();
			} catch (Exception e) {
				System.out.println(e);
			}

		}
}
