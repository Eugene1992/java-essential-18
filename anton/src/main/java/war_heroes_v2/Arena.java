package war_heroes_v2;

public class Arena {
    public static void main(String[] args) throws InterruptedException {
        Hero lotar = new Paladin("Lotar", 1700, 87, 207, 117);
        Hero kazar = new Elf("Kazar", 1400, 76, 170, 97);
        Hero kolos = new Dwarf("Kolos", 2100, 89, 198, 120);
        Hero tanar = new Ork("Tanar", 1800, 78, 197, 102);

        while (lotar.isAlive() && kazar.isAlive()) {
            lotar.makeAttack(kazar);
            Thread.sleep(1000);

            if (!kazar.isAlive()){
                lotar.victoryVoice();
                break;
            }

            kazar.makeAttack(lotar);
            Thread.sleep(1000);

            if (!lotar.isAlive()) {
                kazar.victoryVoice();
                break;
            }

        }
    }
}
