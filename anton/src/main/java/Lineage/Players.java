package Lineage;

public class Players {

    private String name;
    private Heroes[] heroes;
    private boolean isAlive;

    public Players(String name, Heroes... heroes) {
        this.name = name;
        this.heroes = heroes;
        this.isAlive = true;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public Heroes[] getHeroes() {
        return heroes;
    }

    public void setHeroes() {
        this.heroes = heroes;
    }

    public boolean isAlive() {
        for (Heroes heroes : heroes) {
            if (heroes.isAlive()) {
                return true;
            }
            isAlive = false;
        }
        return false;
    }

    public void congratulation() {
        if (isAlive) {
            System.out.println(name + " Congratulation, you are the winner!");
        }
    }

}


