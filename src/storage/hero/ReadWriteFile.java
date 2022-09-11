package storage.hero;

import model.Hero;

import java.io.*;
import java.util.List;

public class ReadWriteFile implements ReadWriteData{

    private static ReadWriteFile instance = null;

    private ReadWriteFile() {
    }

    public static ReadWriteFile getInstance() {
        if (instance == null) instance = new ReadWriteFile();
        return instance;
    }

    @Override
    public void writeData(List<Hero> heroList) {
        try {
            FileOutputStream fos = new FileOutputStream("Hero.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(heroList);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<Hero> readData() {
        List<Hero> heroList = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("Hero.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            heroList = (List<Hero>) obj;
            return heroList;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
