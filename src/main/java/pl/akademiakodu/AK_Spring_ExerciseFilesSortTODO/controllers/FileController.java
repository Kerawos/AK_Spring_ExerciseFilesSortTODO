package pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.controllers;


/**
 * Imports section
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.models.services.FileExercise;
import pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.models.UserInput;


import java.io.File;

/**
 * Control file page exercise
 */
@Controller
public class FileController {

    /**
     * Declarations
     */
    @Autowired
    private FileExercise fileExercise;
    private File testingFile = fileExercise.createNewFile("testFile.txt");

    /**
     * Method responsible for get file page exercise
     * @param model store user inputs
     * @return templates fulfilled by user inputs
     */
    @GetMapping("/file") public String fileGet(Model model){
        model.addAttribute("userInput", new UserInput());
        return "file";
    }

    /**
     * Methods responsible for adding text to file
     * @param userInput holding user input
     * @param model storing model logic
     * @return file template
     */
    @RequestMapping(params = "addText", method = RequestMethod.POST) public String filePostAddText(
            @ModelAttribute("userInput") UserInput userInput, Model model){
        fileExercise.saveIntoFile(testingFile, userInput.getInput());
        model.addAttribute("current", fileExercise.readFromFile(testingFile));
        return "file";
    }

    /**
     * Methods responsible for clear text from file
     * @param userInput holding user input
     * @param model storing model logic
     * @return file template
     */
    @RequestMapping(params = "clearFile", method = RequestMethod.POST) public String filePostClearFile(
            @ModelAttribute("userInput") UserInput userInput, Model model){
        fileExercise.clearFile(testingFile);
        model.addAttribute("current", fileExercise.readFromFile(testingFile));
        return "file";
    }

}
