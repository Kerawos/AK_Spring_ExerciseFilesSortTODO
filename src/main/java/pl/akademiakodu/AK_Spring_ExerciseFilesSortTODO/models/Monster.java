package pl.akademiakodu.AK_Spring_ExerciseFilesSortTODO.models;

public class Monster {
    private String name;
    private int scary;

    public Monster(String name, int scary) {
        this.name = name;
        this.scary = scary;
    }

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
