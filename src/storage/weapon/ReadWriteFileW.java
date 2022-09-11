package storage.weapon;

import model.Weapon;

import java.io.*;
import java.util.List;

public class ReadWriteFileW implements ReadWriteDataW {
    private static ReadWriteFileW instance=null;
    private ReadWriteFileW(){}
    public static ReadWriteFileW getInstance(){
        if(instance==null)instance=new ReadWriteFileW();
        return instance;
    }
    @Override
    public void writeData(List<Weapon> list) {
        try{
            FileOutputStream fos=new FileOutputStream("Weapon.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    @Override
    public List<Weapon> readData() {
        List<Weapon> weaponList=null;
        FileInputStream fis=null;
        try{
            fis=new FileInputStream("Weapon.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Object obj=ois.readObject();
            weaponList=(List<Weapon>) obj;
            return weaponList;
        }catch (IOException| ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
