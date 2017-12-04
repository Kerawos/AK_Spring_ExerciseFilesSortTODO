package pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.models.services;

/**
 * Import section
 */
import org.springframework.stereotype.Service;
import pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.models.Monster;
import pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.models.NameComparator;
import pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.models.ScaryComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Service responsible for sort exercise logic
 */
@Service
public class SortExercise {

    /**
     * Method responsible for generate defined monster list
     * @return monster list
     */
    public List<Monster> generateMonsterList(){
        List<Monster> monsterList = Arrays.asList(
                new Monster("Rainbowing Unicorn", 12),
                new Monster("Scary Harry", 3),
                new Monster("Red Butter", 6),
                new Monster("Dark Kitty", 14),
                new Monster("Sleeping Apple", 10)
        );
        return monsterList;
    }

    /**
     * Method responsible for generate string as output containing every monster from monster list
     * @param list given monster list
     * @return monster list as string
     */
    public String listToString(List<Monster> list){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(i+1 + ". ");
            sb.append(list.get(i).getName());
            sb.append(" = ");
            sb.append(list.get(i).getScary());
            sb.append(" *** ");
        }
        return sb.toString();
    }

    /**
     * Method responsible for sorting ascending given monster list by scariest
     * @param list
     * @return sorting ordered by ascending monster list by scary
     */
    public List<Monster> sortByScary(List<Monster> list){
        Collections.sort(list, new ScaryComparator());
        return list;
    }

    /**
     * Method responsible for sorting alphabetical given monster list
     * @param list
     * @return sorting alphabetical monster list
     */
    public List<Monster> sortByName(List<Monster> list){
        Collections.sort(list, new NameComparator());
        return list;
    }

}


