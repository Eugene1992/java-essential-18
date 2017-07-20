package gamev3;

/**
 * Created by D_ma on 17.07.2017.
 */
public class Arena {
    public static void main(String[] args) throws Exception  {
        Hero zeratul = new Elf("Zeratul", 100, 2, 4, 1, 5);
        Hero tassadar = new Dwarf("Tassadar", 100, 2, 4, 1, 2);
        Hero abathur = new Orc("Abathur", 100, 2, 4, 1, 2);
        Hero rolandTheSonOfSteven = new Human("Roland the son of Steven", 100, 2, 4, 1, 2);

    }


        static void teamBattle (Hero [] teamOne, Hero [] teamTwo){
        for (int i = 0; i < teamOne.length; i++) {
            teamOne[i].dmg(teamTwo[i]);
            teamTwo[i].dmg(teamOne[i]);
            
        }
    }

    }

