package pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.models;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortExercise {

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

    public List<Monster> sortByScary(List<Monster> list){
        Collections.sort(list, new ScaryComparator());
        return list;
    }

    public List<Monster> sortByName(List<Monster> list){
        Collections.sort(list, new NameComparator());
        return list;
    }

}



