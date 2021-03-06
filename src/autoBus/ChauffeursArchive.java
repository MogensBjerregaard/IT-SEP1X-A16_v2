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
	
	public ChauffeursArchive(){
		chauffeursArchive=new ArrayList<Chauffeur>();
	}
	
	public String toString(int index){
		return chauffeursArchive.get(index).toString();
	}
	
	public int size(){
		return chauffeursArchive.size();
	}
	
	public Chauffeur get(int index){
		return chauffeursArchive.get(index);
	}
	
	public void addChauffeur(Chauffeur chauffeur){
		chauffeursArchive.add(chauffeur);
	}
	
	public void removeChauffeur(int index){
		chauffeursArchive.remove(index);
	}
	
	public boolean isFileFound(){
		Path path = Paths.get("C:\\Autobus\\ChauffeursArchive.dat");
		return (Files.exists(path));
	}
	
	public void createFile() throws Exception{
		chauffeursArchive.add(new Chauffeur("", "", "", 0, 0, 0, "", "", true, true));
		saveChauffeursArchive();
		chauffeursArchive.remove(0);
		saveChauffeursArchive();
	}
	
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
	
	public String[] getAllChauffeurs(){
		String[] allChauffeurs = new String[chauffeursArchive.size()];
		for (int i = 0; i<chauffeursArchive.size();i++){
			allChauffeurs[i]=chauffeursArchive.get(i).getName();
		}
		return allChauffeurs;
	}
	
	public ArrayList<Chauffeur> getChauffeurs(){
		return chauffeursArchive;
	}
	
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
	
	public String toString(){
		String str = new String();
		for (int i=0; i<chauffeursArchive.size();i++){
			str=str+chauffeursArchive.get(i).getName()+"\n";
		}
		return str;
	}
	
	public Chauffeur getChauffeurById(String id){
		for (int i = 0; i < chauffeursArchive.size(); i++) {
			if (chauffeursArchive.get(i).getEmployeeNumber().equalsIgnoreCase(id)) {
				return chauffeursArchive.get(i);
			}
		}
		return null;
	}
}
