package Empoolye;


import java.io.*;
import java.util.List;

public class Method1 implements Serializable{
    public static final String path = "/Users/khrystyna_nykolyshyn/Documents/JavaWrite";
    public static final File file = new File("Taks");
    public void serialize(List<Employe> employe) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(path + File.separator + file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(employe);
        objectOutputStream.flush();
        objectOutputStream.close();
    }
    public List<Employe> deserialize() throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream(path + File.separator + file);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        List<Employe> employe = (List<Employe>) objectInputStream.readObject();
        System.out.println(employe.toString());
        return employe;
    }
    public void allIO(List<Employe> list){
        try {
            serialize(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            deserialize();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
