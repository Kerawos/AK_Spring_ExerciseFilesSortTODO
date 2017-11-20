package pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.models.FileExercise;
import pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.models.UserInput;


import java.io.File;

@Controller
public class FileController {

    private FileExercise fileExercise = new FileExercise();
    private File testingFile = fileExercise.createNewFile("testFile.txt");

    @GetMapping("/file") public String fileGet(Model model){
        model.addAttribute("userInput", new UserInput());
        return "file";
    }

    @RequestMapping(params = "addText", method = RequestMethod.POST) public String filePostAddText(
            @ModelAttribute("userInput") UserInput userInput, Model model){
        fileExercise.saveIntoFile(testingFile, userInput.getInput());
        model.addAttribute("current", fileExercise.readFromFile(testingFile));
        return "file";
    }

    @RequestMapping(params = "clearFile", method = RequestMethod.POST) public String filePostClearFile(
            @ModelAttribute("userInput") UserInput userInput, Model model){
         fileExercise.clearFile(testingFile);
         model.addAttribute("current", fileExercise.readFromFile(testingFile));
         return "file";
    }


}
