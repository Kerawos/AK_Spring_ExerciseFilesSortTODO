package pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.controllers;

/**
 * Imports section
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Control description page
 */
@Controller
public class DescController {

    /**
     * method get description template
     * @return template with description
     */
    @GetMapping("/desc") public String descGet(){
        return "desc";
    }

}
