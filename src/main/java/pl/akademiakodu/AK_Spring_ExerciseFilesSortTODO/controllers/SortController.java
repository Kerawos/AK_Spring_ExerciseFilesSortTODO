package pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.models.Monster;
import pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.models.SortExercise;


import java.util.List;

@Controller
public class SortController {

    private SortExercise sortExercise = new SortExercise();
    private List<Monster> monsterList = sortExercise.generateMonsterList();

    @GetMapping("/sort") public String sortGet(){
        return "sort";
    }

    @RequestMapping(params = "sortByScary", method = RequestMethod.POST) public String sortByScaryPost(Model model){
        sortExercise.sortByScary(monsterList);
        model.addAttribute("list", sortExercise.listToString(monsterList));
        return "sort";
    }

    @RequestMapping(params = "sortByName", method = RequestMethod.POST) public String sortByNamePost(Model model){
        sortExercise.sortByName(monsterList);
        model.addAttribute("list", sortExercise.listToString(monsterList));
        return "sort";
    }

}
