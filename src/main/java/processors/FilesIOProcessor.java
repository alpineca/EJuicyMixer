package processors;

import models.BaseLiquid;
import models.Recipe;

import java.io.*;
import java.util.List;

public class FilesIOProcessor {
    public static <T> void saveFile(List<T> recipes, File fileToSave){
        try {
            FileOutputStream fileOutput = new FileOutputStream(fileToSave);
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);

            for(T element : recipes){
                objectOutput.writeObject(element);
            }

            objectOutput.close();
            fileOutput.close();
        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println("*****************");
            System.out.println("*BASES NOT SAVED*");
            System.out.println("*****************");
        }

        System.out.println("*************");
        System.out.println("*BASES SAVED*");
        System.out.println("*************");
    }
    public static <T> List<T> loadFile(List<T> recipes, File fileToSave){
//        List<T> loadedRecipes = null;

        try {
            FileInputStream fileInput = new FileInputStream(fileToSave);
            ObjectInputStream objectInput = new ObjectInputStream(fileInput);

            while(true){
                try {
                    recipes.add((T) objectInput.readObject());
                } catch (EOFException e) {
                    break;
                }
            }


            objectInput.close();
            fileInput.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Error initializing stream");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return recipes;
    }
}
