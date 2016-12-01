package autoBus;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CustomersArchive implements Serializable{

	private static final long serialVersionUID = 1L;
	private ArrayList<Customer> customersArchive;
	
	public CustomersArchive(){
		customersArchive = new ArrayList<>();
	}
	
	public int size(){
		return customersArchive.size();
	}
	
	public Customer get(int index){
		return customersArchive.get(index);
	}
	public ArrayList<Customer> getListOfCustomers(){
		return this.customersArchive;
	}
	public void addCustomer(Customer customer){
		customersArchive.add(customer);
	}
	
	public void removeCustomer(int index){
		customersArchive.remove(index);
	}
	
	public boolean isFileFound(){
		Path path = Paths.get("C:\\Autobus\\CustomersArchive.dat");
		return (Files.exists(path));
	}
	
	public void createFile() throws Exception{
		customersArchive.add(new Customer("", "", "", "", new Date(0, 0, 0), "", ""));
		saveCustomersArchive();
		customersArchive.remove(0);
		saveCustomersArchive();
	}
	
	public void saveCustomersArchive() throws Exception{
		Path path = Paths.get("C:\\Autobus");
		if (!Files.exists(path)){
			try {
				Files.createDirectory(path);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error: Unable to create directory!");
			}		
		}
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Autobus\\CustomersArchive.dat");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		try {
			objectOutputStream.writeObject(customersArchive);
		} finally {
			objectOutputStream.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void loadCustomersArchive() throws Exception{
		FileInputStream fileInputStream = new FileInputStream("C:\\Autobus\\CustomersArchive.dat");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		try {
			ArrayList<Customer> otherCustomersArchive = (ArrayList<Customer>)objectInputStream.readObject();//how to check if instance of ArrayList<Customer>??
			this.customersArchive=otherCustomersArchive;
		} finally {
			objectInputStream.close();
		}
	}
}
