package pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.models;

/**
 * Class store monster object
 */
public class Monster {

    /**
     * Variables declarations
     */
    private String name;
    private int scary;

    /**
     * Constructor
     * @param name
     * @param scary
     */
    public Monster(String name, int scary) {
        this.name = name;
        this.scary = scary;
    }

    /**
     * Getters and setters section
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScary() {
        return scary;
    }

    public void setScary(int scary) {
        this.scary = scary;
    }
}
