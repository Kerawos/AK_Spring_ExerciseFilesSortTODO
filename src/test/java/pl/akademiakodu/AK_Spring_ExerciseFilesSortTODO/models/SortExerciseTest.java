package pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.models;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.models.services.SortExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SortExerciseTest {

    private static SortExercise sortExercise;
    private static NameComparator nameComparator;
    private static ScaryComparator scaryComparator;

    @BeforeClass public static void start() {
        sortExercise = new SortExercise();
        nameComparator = new NameComparator();
        scaryComparator = new ScaryComparator();
    }

    @AfterClass public static void stop() {
        sortExercise = null;
        nameComparator = null;
        scaryComparator = null;
    }

    @Test public void test() throws Exception {
        List<Monster> actualList = sortExercise.generateMonsterList();

        List<Monster> expectedList = Arrays.asList(
                new Monster("Rainbowing Unicorn", 12),
                new Monster("Scary Harry", 3),
                new Monster("Red Butter", 6),
                new Monster("Dark Kitty", 14),
                new Monster("Sleeping Apple", 10)
        );
        arrayComparator(actualList, expectedList);
        System.out.println(sortExercise.listToString(expectedList));

        expectedList = Arrays.asList(
                new Monster("Scary Harry", 3),
                new Monster("Red Butter", 6),
                new Monster("Sleeping Apple", 10),
                new Monster("Rainbowing Unicorn", 12),
                new Monster("Dark Kitty", 14)
        );
        Collections.sort(actualList, scaryComparator);
        arrayComparator(actualList, expectedList);
        System.out.println(sortExercise.listToString(expectedList));

        expectedList = Arrays.asList(
                new Monster("Dark Kitty", 14),
                new Monster("Rainbowing Unicorn", 12),
                new Monster("Red Butter", 6),
                new Monster("Scary Harry", 3),
                new Monster("Sleeping Apple", 10)
        );
        Collections.sort(actualList, nameComparator);
        arrayComparator(actualList, expectedList);
        System.out.println(sortExercise.listToString(expectedList));
    }
    private void arrayComparator(List<Monster> actual, List<Monster> expected){
        for (int i = 0; i < actual.size(); i++) {
            for (int j = i; j < expected.size(); j++) {
                assertEquals(actual.get(i).getName(), expected.get(j).getName());
                assertEquals(actual.get(i).getScary(), expected.get(j).getScary());
                break;
            }
        }
    }
}