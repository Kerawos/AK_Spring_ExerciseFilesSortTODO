package pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.models;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;


public class FileExercise {

    private File testFile;

    public File createNewFile(String filePath){
        testFile = new File(filePath);
        if (!testFile.exists()){
            try {
                testFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return testFile;
    }

    public void clearFile(File fileToClear){
        try {
            Files.newBufferedWriter(fileToClear.toPath(), StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readFromFile(File fileToRead) {
        //todo
        return "";
    }

    public void saveIntoFile(File fileToSave, String textToSave){
        //todo
    }

    public void deleteExistingFile(File file){
        if (file.exists()){
            file.delete();
        }
    }

}
