package pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.controllers;

/**
 * Imports section
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.models.Monster;
import pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.models.services.SortExercise;

import java.util.List;

/**
 * Control sort exercise page
 */
@Controller
public class SortController {

    /**
     * Declarations
     */
    @Autowired private SortExercise sortExercise = new SortExercise(); //init for monster list below
    private List<Monster> monsterList = sortExercise.generateMonsterList();

    /**
     * Method responsible for get sort page exercise
     * @return sorting template
     */
    @GetMapping("/sort") public String sortGet(){
        return "sort";
    }

    /**
     * Method responsible for calling sort exercise logic
     * @param model stored calculations
     * @return templates with result
     */
    @RequestMapping(params = "sortByScary", method = RequestMethod.POST) public String sortByScaryPost(Model model){
        sortExercise.sortByScary(monsterList);
        model.addAttribute("list", sortExercise.listToString(monsterList));
        return "sort";
    }

    /**
     * Method responsible for calling sort exercise logic
     * @param model stored calculations
     * @return templates with result
     */
    @RequestMapping(params = "sortByName", method = RequestMethod.POST) public String sortByNamePost(Model model){
        sortExercise.sortByName(monsterList);
        model.addAttribute("list", sortExercise.listToString(monsterList));
        return "sort";
    }

}
