import behavior.Defensive;
import behavior.Offensive;
import soldier.Archer;
import soldier.HorseRider;
import soldier.Knight;
import soldier.Soldier;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Knight knight1 = new Knight("Hector", 3);
        Knight knight2 = new Knight("Paris", 1);

        Archer archer1 = new Archer("Lucas", 3);
        Archer archer2 = new Archer("Lucius", 2);

        HorseRider rider1 = new HorseRider("Victorius", 3);
        HorseRider rider2 = new HorseRider("Iáson", 2);

        List<Soldier> soldiers = List.of(knight1, knight2, archer1, archer2, rider1, rider2);

        System.out.println("-------REPORT--------");
        for (Soldier soldier: soldiers) {
            soldier.report();
        }

        System.out.println(" ");

        System.out.println("-------ATTACK--------");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof Offensive) {
              ((Offensive) soldier).attack();
            }
        }

        System.out.println(" ");

        System.out.println("-------DEFEND--------");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof Defensive) {
                ((Defensive) soldier).defend();
            }
        }

        System.out.println(" ");

        System.out.println("-------FIGHT WITH SPECIAL WEAPONS--------");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof Archer) {
                ((Archer) soldier).showerWithArrows();
            }
            if (soldier instanceof HorseRider) {
                ((HorseRider) soldier).cutOffEnemy();
            }
            if (soldier instanceof Knight) {
                ((Knight) soldier).flankEnemy();
            }
        }
    }
}