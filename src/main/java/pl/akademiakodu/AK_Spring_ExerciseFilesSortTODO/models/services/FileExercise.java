package pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.models.services;

/**
 * Import section
 */
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

/**
 * Service responsible for file exercise logic
 */
@Service
public class FileExercise {

    /**
     * Declaration variables
     */
    private File testFile;

    /**
     * Method responsible for create file in given path
     * @param filePath
     * @return created new file
     */
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

    /**
     * Method responsible for delete everything from file
     * @param fileToClear indicate file to clear
     */
    public void clearFile(File fileToClear){
        try {
            Files.newBufferedWriter(fileToClear.toPath(), StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method responsible to open file, read every sign from file, output string as result
     * @param fileToRead
     * @return file content
     */
    public String readFromFile(File fileToRead) {
        //todo
        return "";
    }

    /**
     * Method responsible to open file, save there given param
     * @param fileToSave
     * @param textToSave
     */
    public void saveIntoFile(File fileToSave, String textToSave){
        //todo
    }

    /**
     * Method which delete given file if possible
     * @param file
     */
    public void deleteExistingFile(File file){
        if (file.exists()){
            file.delete();
        }
    }

}
