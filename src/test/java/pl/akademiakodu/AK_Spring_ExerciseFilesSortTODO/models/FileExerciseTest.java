package pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.models;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class FileExerciseTest {
    private static FileExercise fileExercise;

    @BeforeClass
    public static void start() {
        fileExercise = new FileExercise();
    }

    @AfterClass
    public static void stop() throws Exception {
        fileExercise = null;
    }

    @Test
    public void testInOut() throws Exception {
        File file = new File("FileToTest.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e){
                e.printStackTrace();
            }
        } else {
            fileExercise.clearFile(file);
        }
        fileExercise.saveIntoFile(file, "test");
        assertEquals(fileExercise.readFromFile(file), "test");
        fileExercise.clearFile(file);
        assertEquals(fileExercise.readFromFile(file), "");
        file.delete();
    }

    @Test
    public void automateTest() throws Exception {
        File file = fileExercise.createNewFile("automateFile.txt");
        fileExercise.clearFile(file);
        assertEquals("", fileExercise.readFromFile(file));
        fileExercise.saveIntoFile(file, "test");
        assertEquals("test", fileExercise.readFromFile(file));
        fileExercise.clearFile(file);
        assertEquals("", fileExercise.readFromFile(file));
        fileExercise.saveIntoFile(file, "test");
        assertEquals("test", fileExercise.readFromFile(file));
        fileExercise.saveIntoFile(file, "test");
        assertEquals("testtest", fileExercise.readFromFile(file));
        fileExercise.deleteExistingFile(file);
        assertFalse(file.exists());
    }
}