package oop.cw_03;

public class Test {
    public static void main(String[] args) {
//        Employee employee = new Employee();

//        Classes: Paladin, Elf, Dwarf, Ork + Arena(main)

//        Common fields:
//        - hp
//        - armor
//        - max dmg
//        - min dmg

//        Common methods:
//        attack()
//        isDie()
//        isSpecialAbility()

//        Paladin:
//        - can regenerate health

//        Elf:
//        - can do critical shot (x2 dmg)

//        Dwarf:
//        - can block shot

//        Ork:
//        - can vampire shot

        for (int i = 0; i < 10; i++) {
            System.out.println(rnd(0, 10));
        }
    }

    public static int rnd(int min, int max) {
        max = max - min;
        return (int) (Math.random() * ++max) + min;
    }
}
