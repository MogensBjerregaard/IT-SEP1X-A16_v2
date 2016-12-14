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


public class ChauffeursArchive implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private ArrayList<Chauffeur> chauffeursArchive;
	
	/**
	 * This is a constructor for ChauffeursArchive
	 */
	public ChauffeursArchive(){
		chauffeursArchive=new ArrayList<Chauffeur>();
	}
	
	/**
	 * This returns the information of the specific chauffeur from chauffeursArchive
	 * @param index - index of the Chauffeur
	 * @return String that contains information about the specific Chauffeur
	 */
	public String toString(int index){
		return chauffeursArchive.get(index).toString();
	}
	
	/**
	 * This returns size of this chauffeursArchive
	 * @return size of this chauffeurs archive
	 */
	public int size(){
		return chauffeursArchive.size();
	}
	
	/**
	 * This returns a specific Chauffeur from chauffeursArchive
	 * @param index - index of this Chauffeur
	 * @return a specific Chauffeur from chauffeurs archive
	 */
	public Chauffeur get(int index){
		return chauffeursArchive.get(index);
	}
	
	/**
	 * This adds Chauffeur into chauffeursArchive 
	 * @param chauffeur - chauffeur that is added
	 */
	public void addChauffeur(Chauffeur chauffeur){
		chauffeursArchive.add(chauffeur);
	}
	
	/**
	 * This removes a specific Chauffeur from chauffeursArchive
	 * @param index - index of the deleted Chauffeur
	 */
	public void removeChauffeur(int index){
		chauffeursArchive.remove(index);
	}
	
	/**
    * This returns a boolean if the file exists
    * @return path of this file
    */
	public boolean isFileFound(){
		Path path = Paths.get("C:\\Autobus\\ChauffeursArchive.dat");
		return (Files.exists(path));
	}
	
	/**
    * This creates a new file
    * @throws Exception
    */
	public void createFile() throws Exception{
		chauffeursArchive.add(new Chauffeur("", "", "", 0, 0, 0, "", "", true, true));
		saveChauffeursArchive();
		chauffeursArchive.remove(0);
		saveChauffeursArchive();
	}
	
	/**
    * This saves chauffeursArchive after changes
    * @throws Exception
    */
	public void saveChauffeursArchive() throws Exception{
		Path path = Paths.get("C:\\Autobus");
		if (!Files.exists(path)){
			try {
				Files.createDirectory(path);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error: Unable to create directory!");
			}		
		}
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Autobus\\ChauffeursArchive.dat");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		try {
			objectOutputStream.writeObject(chauffeursArchive);
		} finally {
			objectOutputStream.close();
		}
	}
	
	/**
	 * This returns allChauffers from chauffeursArchive
	 * @return all chauffeurs from chauffeursArchive
	 */
	public String[] getAllChauffeurs(){
		String[] allChauffeurs = new String[chauffeursArchive.size()];
		for (int i = 0; i<chauffeursArchive.size();i++){
			allChauffeurs[i]=chauffeursArchive.get(i).getName();
		}
		return allChauffeurs;
	}
	
	/**
	 * Thus returns chauffeursArchive
	 * @return chauffeurs archive
	 */
	public ArrayList<Chauffeur> getChauffeurs(){
		return chauffeursArchive;
	}
	
	/**
    * This loads chauffeursArchive 
    * @throws Exception
    */
	@SuppressWarnings("unchecked")
	public void loadChauffeursArchive() throws Exception{
		FileInputStream fileInputStream = new FileInputStream("C:\\Autobus\\ChauffeursArchive.dat");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		try {
			ArrayList<Chauffeur> otherChauffeursArchive = (ArrayList<Chauffeur>)objectInputStream.readObject();//how to check if instance of ArrayList<Chauffeur>??
			this.chauffeursArchive=otherChauffeursArchive;
		} finally {
			objectInputStream.close();
		}
	}
	
	/**
	 * This returns a String that contains names of all Chauffeurs from chauffeursArchive
	 */
	public String toString(){
		String str = new String();
		for (int i=0; i<chauffeursArchive.size();i++){
			str=str+chauffeursArchive.get(i).getName()+"\n";
		}
		return str;
	}
	
	/**
	 * This returns a specified Chauffeur from chauffeursArchive
	 * @param id - id of the Chauffeur
	 * @return specified Chauffeur from chauffeurs archive
	 */
	public Chauffeur getChauffeurById(String id){
		for (int i = 0; i < chauffeursArchive.size(); i++) {
			if (chauffeursArchive.get(i).getEmployeeNumber().equalsIgnoreCase(id)) {
				return chauffeursArchive.get(i);
			}
		}
		return null;
	}
}
