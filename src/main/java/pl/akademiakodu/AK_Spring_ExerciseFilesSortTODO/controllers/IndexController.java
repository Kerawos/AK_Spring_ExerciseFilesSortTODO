package pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.controllers;

/**
 * Imports section
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Control index page
 */
@Controller
public class IndexController {

    /**
     * method get index template
     * @return template with index
     */
    @GetMapping("/") public String indexGet(){
        return "index";
    }

}
